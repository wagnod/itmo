import java.io.Reader

enum class Token {
    LAMBDA, SEMICOLON, COMMA, AND, OR, NOT, EQUAL, LPAREN, RPAREN, NAME, VALUE, EPS, END
}


class LexicalAnalyzer(private val stream: Reader) {
    constructor(s: String) : this(s.reader())

    var result = mutableListOf<String>()
    var str: String = ""
    var curChar: Int = -1
    var curPos: Int = -1
    var curToken: Token = Token.EPS

    private fun isBlank(c: Char): Boolean = (c == ' ' || c == '\r' || c == '\n' || c == '\t')

    fun nextChar() {
        try {
            curChar = stream.read()
        } catch (e: IllegalArgumentException) {
            throw ParseException(e.message)
        } finally {
            curPos++
        }
    }

    fun nextToken() {
        val word = mutableListOf<Char>()
        while (isBlank(curChar.toChar())) nextChar()
        if (curChar == -1) {
            curToken = Token.END
            str = ""
            return
        }

        if (curChar.toChar() == ',') {
            curToken = Token.COMMA
            str = ","
            result.add(",")
            nextChar()
            return
        } else if (curChar.toChar() == ':') {
            curToken = Token.SEMICOLON
            str = ":"
            result.add(":")
            nextChar()
            return
        } else if (curChar.toChar() == '(') {
            curToken = Token.LPAREN
            str = "("
            result.add("(")
            nextChar()
            return
        } else if (curChar.toChar() == ')') {
            curToken = Token.RPAREN
            str = ")"
            result.add(")")
            nextChar()
            return
        }

        val isWord = if (curChar.toChar().isLetter() || curChar.toChar() == '=') {
            true
        } else if (curChar.toChar().isDigit()) {
            false
        } else {
            throw ParseException("Illegal argument" + curChar.toChar() + " at pos " + curPos)
        }

        while (curChar.toChar().isLetterOrDigit() || curChar.toChar() == '=') {
            word.add(curChar.toChar())
            nextChar()
        }

        str = word.joinToString("")
        result.add(str)
        if (word.isNotEmpty() && isWord) {
            return when (word.joinToString("")) {
                "lambda" -> curToken = Token.LAMBDA
                "and" -> curToken = Token.AND
                "or" -> curToken = Token.OR
                "not" -> curToken = Token.NOT
                "==" -> curToken = Token.EQUAL
                else -> curToken = Token.NAME
            }
        } else {
            curToken = Token.VALUE
        }
    }
}