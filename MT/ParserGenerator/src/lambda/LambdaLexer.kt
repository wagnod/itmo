package lambda

import java.util.regex.Pattern

class LambdaLexer(private val input: String) {
    val length = input.length
    var result = mutableListOf<String>()
    var word = StringBuilder("")
    var index = 0
    var curToken = Token(Rule.EPS, "")

    private fun isBlank(c: Char): Boolean = (c == ' ' || c == '\r' || c == '\n' || c == '\t')

    private val allPatterns =
        Pattern.compile("(and)|(or)|(not)|(==)|(lambda)|(:)|(,)|(\\()|(\\))|(\\d+(\\.\\d+)?)|([a-zA-Z][a-zA-Z0-9]*)|([\\n\\r\\t ]+)")

    private val tokenRules = listOf(
        TokenRule(Rule.AND, Pattern.compile("and")),
        TokenRule(Rule.OR, Pattern.compile("or")),
        TokenRule(Rule.NOT, Pattern.compile("not")),
        TokenRule(Rule.EQ, Pattern.compile("==")),
        TokenRule(Rule.LAMBDA, Pattern.compile("lambda")),
        TokenRule(Rule.SEMICOLON, Pattern.compile(":")),
        TokenRule(Rule.COMMA, Pattern.compile(",")),
        TokenRule(Rule.LPAREN, Pattern.compile("\\(")),
        TokenRule(Rule.RPAREN, Pattern.compile("\\)")),
        TokenRule(Rule.NUMBER, Pattern.compile("\\d+(\\.\\d+)?")),
        TokenRule(Rule.ID, Pattern.compile("[a-zA-Z][a-zA-Z0-9]*")),
        TokenRule(Rule.WHITESPACE, Pattern.compile("[\\n\\r\\t ]+"))
    )

    private val ignore = setOf(
        Rule.WHITESPACE
    )

    fun find(s: String): Rule {
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