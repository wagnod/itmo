import java.io.File

class LexerGenerator(val grammar: Grammar) {
    private val prefix = "src/${grammar.name.lowercase()}"

    private fun validate() {
        if (!File(prefix).exists()) {
            File(prefix).mkdir()
        }
    }


    fun generateRule() {
        validate()
        val tokens = grammar.rules.map { it.name }.toHashSet().joinToString(",\n$tab")
        File("$prefix/Rule.kt").writeText("""
package ${grammar.header}

import java.util.regex.Pattern

class Token(val token: Rule, val text: String)

class TokenRule(val rule: Rule, val pattern: Pattern)

enum class Rule {
    $tokens,
    END
}""".trimIndent())
    }

    fun generateLexer(tokens: List<Term>) {
        fun escape(s: String) = s.replace("\\", "\\\\").replace("\"", "\\\"")
        val allPatterns = tokens.joinToString("|") { "(${escape(it.pattern)})" }
        File("${prefix}/${grammar.name}Lexer.kt").writeText("""
package ${grammar.header}

import java.util.regex.Pattern

class ${grammar.name}Lexer(private val input: String) {
    val length = input.length
    var result = mutableListOf<String>()
    var word = StringBuilder("")
    var index = 0
    var curToken = Token(Rule.EPS, "")

    private fun isBlank(c: Char): Boolean = (c == ' ' || c == '\r' || c == '\n' || c == '\t')

    private val allPatterns = Pattern.compile("$allPatterns")
    
    private val tokenRules = listOf(
            ${tokens.joinToString(",\n${tab.repeat(3)}") { "TokenRule(Rule.${it.name}, Pattern.compile(\"${escape(it.pattern)}\"))" }}
    )
    
    private val ignore = setOf(
            ${tokens.filter { it.skip }.joinToString(",\n${tab.repeat(3)}") { "Rule.${it.name}" }}
    )

    fun find(s: String) : Rule {
        var result = Rule.EPS
        for (r in tokenRules) {
            if (r.pattern.matcher(s).matches()) {
                result = r.rule
                break
            }
        }
        return result
    }

    fun nextToken() {
        word = StringBuilder("")
        if (index == length) {
            curToken = Token(Rule.END, "")
            return
        }
        var cur = input[index]
        index++
        word.append(cur)
        var s = word.toString()
        var t = find(s)
        var m = allPatterns.matcher(s)
        if (m.matches()) {
            while (index < length) {
                cur = input[index]
                index++
                word.append(cur)
                s = word.toString()
                t = find(s)
                m = allPatterns.matcher(s)
                if (!m.matches()) {
                    index--
                    s = s.substring(0, s.length - 1)
                    t = find(s)
                    if (ignore.contains(t)) {
                        nextToken()
                        return
                    }
                    break
                }
            }
            curToken = Token(t, s)
        } else {
            throw ParseException("Unexpected token " + word)
        }
    }
}""".trimIndent()
        )
    }
}
