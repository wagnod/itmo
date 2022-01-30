package calculator

import java.util.regex.Pattern

class CalculatorLexer(private val input: String) {
    val length = input.length
    var result = mutableListOf<String>()
    var word = StringBuilder("")
    var index = 0
    var curToken = Token(Rule.EPS, "")

    private fun isBlank(c: Char): Boolean = (c == ' ' || c == '\r' || c == '\n' || c == '\t')

    private val allPatterns = Pattern.compile("(\\*)|(/)|(%)|(\\+)|(-)|(\\\\)|(\\()|(\\))|([\\n\\r\\t ]+)|(Int)|(Double)|(\\d+(\\.\\d+)?)")
    
    private val tokenRules = listOf(
            TokenRule(Rule.MUL, Pattern.compile("\\*")),
			TokenRule(Rule.DIV, Pattern.compile("/")),
			TokenRule(Rule.MOD, Pattern.compile("%")),
			TokenRule(Rule.PLUS, Pattern.compile("\\+")),
			TokenRule(Rule.MINUS, Pattern.compile("-")),
			TokenRule(Rule.REVDIV, Pattern.compile("\\\\")),
			TokenRule(Rule.OPEN, Pattern.compile("\\(")),
			TokenRule(Rule.CLOSE, Pattern.compile("\\)")),
			TokenRule(Rule.WHITESPACE, Pattern.compile("[\\n\\r\\t ]+")),
			TokenRule(Rule.INT, Pattern.compile("Int")),
			TokenRule(Rule.DOUBLE, Pattern.compile("Double")),
			TokenRule(Rule.NUMBER, Pattern.compile("\\d+(\\.\\d+)?"))
    )
    
    private val ignore = setOf(
            Rule.WHITESPACE
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
}