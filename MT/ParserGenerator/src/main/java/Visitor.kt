const val filePrefix = "src/generated"
const val epsilon = "EPS"
const val empty = " "
const val tab = "\t"

class Visitor : GrammarBaseVisitor<Unit>() {
    val rules = mutableListOf<Rule>()
    var name = ""
    var arg = ""
    val fields = mutableSetOf<String>()

    private fun codeToStr(text: String?): String {
        val lines = text?.substring(1, text.length - 1)?.split("\n")?.map { it.trim() }
        return lines?.joinToString("\n") ?: empty
    }

    override fun visitNames(ctx: GrammarParser.NamesContext) {
        // names OR names ;
        if (ctx.OR() != null) {
            visitNames(ctx.names(0))
            visitNames(ctx.names(1))
        } else {
            // name+ code?
            val code = codeToStr(ctx.code()?.text)
            val cnt = if (code == empty) ctx.childCount else ctx.childCount - 1
            val children = mutableListOf<Pair<String, String>>()
            for (i in 0 until cnt) {
                val n = ctx.name(i)
                var arg = if (n.argument() != null) n.argument().ARGUMENT().text else empty
                if (arg != empty) arg = arg.substring(1, arg.length - 1).trim()
                val identifier = if (n.ID() != null) n.ID().text else n.TERMINAL_NAME().text
                children.add(identifier to arg)
            }
            rules.add(NonTerm(name, code, arg, children))
        }
    }

    override fun visitRules(ctx: GrammarParser.RulesContext) {
        val cnt = ctx.childCount
        for (i in 0 until cnt) {
            val rule = ctx.grammarRule(i)
            val syntaxRule = rule.syntaxRule()
            val termRule = rule.terminalRule()
            if (syntaxRule != null) {
                // ID typedArg? COLON names ;
                name = syntaxRule.ID().text
                val names = syntaxRule.names()
                val argument = syntaxRule.typedArg()
                arg = if (argument?.ID(1) != null && argument.CAPITALIZED() != null ) {
                    "${argument.ID(1)} : ${argument.CAPITALIZED()}"
                } else {
                    empty
                }
                visitNames(names)
            } else if (termRule != null) {
                // TERMINAL_NAME COLON REGEXP code? SKIP_RULE? ;
                name = termRule.TERMINAL_NAME().text
                val regex = termRule.REGEXP().text
                val skip = termRule.SKIP_RULE() != null
                val code = termRule.code()
                val codeTxt = if (code == null) " " else codeToStr(code.text)
                rules.add(Term(name, codeTxt, regex.substring(1, regex.length - 1), skip))
            }
        }
        rules.add(Term(epsilon, empty, empty, false))
    }

    private fun fieldToStr(ctx: GrammarParser.FieldContext?): String {
        return "${ctx?.ID(0)?.text} ${ctx?.ID(1)?.text} : ${ctx?.CAPITALIZED()?.text}"
    }

    override fun visitFields(ctx: GrammarParser.FieldsContext?) {
        //  FIELDS LEFT_BRACKET field+ RIGHT_BRAKCET;
        if (ctx != null) {
            for (i in 0 until ctx.childCount - 3) {
                fields.add(fieldToStr(ctx.field(i)))
            }
        }
    }
}