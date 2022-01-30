import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

open class Rule(open val name: String, open val code: String)

data class Term(override val name: String, override val code: String, val pattern: String, val skip: Boolean) :
    Rule(name, code)

data class NonTerm(
    override val name: String,
    override val code: String,
    val argument: String,
    val children: List<Pair<String, String>>
) :
    Rule(name, code)


fun makeGrammar(filename: String): Grammar {
    val input = File(filename).readText()
    val lexer = GrammarLexer(CharStreams.fromString(input))
    val parser = GrammarParser(CommonTokenStream(lexer))
    val parseTree = parser.file()
    val visitor = Visitor()
    visitor.visitRules(parseTree.rules())
    visitor.visitFields(parseTree.fields())
    val grammar = Grammar(
        parseTree.grammarName().gName,
        parseTree.packageName().pName.lowercase(),
        visitor.rules,
        visitor.fields
    )
    grammar.validate()
    return grammar
}

data class Grammar(val name: String, val header: String, val rules: List<Rule>, val fields: Set<String>) {
    fun validate() {
        val r = rules.map { it.name }.toHashSet()
        for (rule in rules) {
            if (rule is NonTerm) {
                val children = rule.children
                for (c in children) {
                    if (c.first !in r && c.first != "expr") throw IllegalStateException("Rule $c is not present in the grammar!")
                }
            }
        }
    }
}
