import java.io.File
import kotlin.collections.HashMap

class ParserGenerator(val grammar: Grammar) {
    private val first = mutableMapOf<String, MutableSet<String>>()
    private val firstRight = mutableMapOf<List<Pair<String, String>>, MutableSet<String>>()
    private val follow = mutableMapOf<String, MutableSet<String>>()

    fun makeFirst() {
        for (r in grammar.rules) {
            first[r.name] = mutableSetOf()
            when (r) {
                is Term -> firstRight[listOf(r.name to empty)] = mutableSetOf()
                is NonTerm -> firstRight[r.children] = mutableSetOf()
            }
        }
        var changed = true
        while (changed) {
            changed = false
            for (r in grammar.rules) {
                val cur = first[r.name]!!.toMutableSet()
                when (r) {
                    is Term -> {
                        first[r.name]!!.add(r.name)
                        firstRight[listOf(r.name to empty)]!!.add(r.name)
                    }
                    is NonTerm -> {
                        first[r.name]!!.addAll(first[r.children[0].first]!!)
                        firstRight[r.children]!!.addAll(first[r.children[0].first]!!)
                        var i = 0
                        while (epsilon in first[r.children[i].first]!!) {
                            i++
                            if (i == r.children.size) break
                            first[r.name]!!.addAll(first[r.children[i].first]!!)
                            firstRight[r.children]!!.addAll(first[r.children[i].first]!!)
                        }
                    }
                }
                if (first[r.name]!! != cur) {
                    changed = true
                }
            }
        }
    }

    fun makeFollow() {
        val rules = grammar.rules
        val nonTerminals = rules.filterIsInstance<NonTerm>()
        val nonTerminalNames = nonTerminals.map { it.name }.toHashSet()
        for (r in rules) {
            follow[r.name] = mutableSetOf()
        }
        follow[rules[0].name]!!.add("EPS")
        var changed = true
        while (changed) {
            changed = false
            for (n in nonTerminals) {
                for (i in n.children.indices) {
                    val b = n.children[i].first
                    if (b in nonTerminalNames) {
                        val gamma = if (i == n.children.size - 1) epsilon else n.children[i + 1].first
                        val cur = follow[b]!!.toMutableSet()
                        follow[b]!!.addAll(first[gamma]!!.minus(epsilon))
                        if (epsilon in first[gamma]!!) {
                            follow[b]!!.addAll(follow[n.name]!!)
                        }
                        if (follow[b]!! != cur) {
                            changed = true
                        }
                    }
                }
            }
        }
    }

    private fun generateFunction(name: String): String {
        val follows = if (epsilon in first[name]!!) follow[name]!! else emptySet<String>()
        val alphas = grammar.rules.filter { it.name == name }.toMutableList()
        val firstToAlpha = HashMap<String, Rule>()
        val nonTerminals = grammar.rules.filterIsInstance<NonTerm>()
        val nonTerminalNames = nonTerminals.map { it.name }
        val rule = nonTerminals.find { it.name == name }
        val epsilonCode = alphas.find { it is NonTerm && it.children.map { p -> p.first }.contains(epsilon) }?.code ?: empty
        for (a in alphas) {
            when (a) {
                is Term -> firstToAlpha[a.name] = a
                is NonTerm -> firstRight[a.children]!!.filter { it != epsilon }.forEach { firstToAlpha[it] = a }
            }
        }
        val x = if (rule?.argument != empty) {
            "res.value = acc"
        } else {
            ""
        }

        return """ 
    fun $name(${rule?.argument}) : Node {
        var res = Node("$name", Rule.$name)
        $x
        var currentRule = lexer.curToken.token
        when (currentRule) {
            ${firstToAlpha.entries.joinToString("\n${tab.repeat(3)}") {
            """
            Rule.${it.key} -> {
                ${(it.value as NonTerm).children.joinToString("\n${tab.repeat(4)}") { c ->
                when (c.first) {
                    !in nonTerminalNames -> {
                        """
                val ${c.first} = Node(lexer.curToken.text, Rule.${c.first})
                res.children.add(${c.first})
                consume(Rule.${c.first})
                        """.trim()
                    }
                    else -> {
                        """
                val ${c.first} = ${c.first}(${c.second})
                res.children.add(${c.first})
                        """.trim()
                    }
                }
            }}
                ${it.value.code}
            }
                """.trim()
        }}
            ${follows.joinToString("\n${tab.repeat(3)}") {
            """
            Rule.$it -> {
                $epsilonCode
            }
                """.trim()
        }} 
            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }
        """.trim()
    }

    fun generateParser() {
        val parserName = "${grammar.name}Parser"
        val lexerName = "${grammar.name}Lexer"
        val nonTerminals = grammar.rules.filterIsInstance<NonTerm>()
        val nonTerminalNames = nonTerminals.map { it.name }.toHashSet()
        File("src/${grammar.name}/${parserName}.kt").writeText(
            """
package ${grammar.header}

class Node(val text: String, val rule: Rule) {
    ${grammar.fields.joinToString("\n${tab.repeat(2)}") { "$it = 0" }}
    val children = mutableListOf<Node>()
}
    
class ParseException(message: String?) : Throwable(message)

class $parserName (private val lexer: $lexerName) {
    var result = Node("EPS", Rule.EPS)
    
    fun parse() {
        lexer.nextToken()
        result = start()
    }
    
    ${nonTerminalNames.joinToString("\n\n${tab}") { generateFunction(it) }}
    
    fun consume(expected: Rule) {
        val actual = lexer.curToken.token
        if (expected != actual) {
            throw ParseException("Illegal token " + actual.name + ", expected " + expected.name)
        }
        lexer.nextToken()
    }
}
            """.trim()
        )
    }
}