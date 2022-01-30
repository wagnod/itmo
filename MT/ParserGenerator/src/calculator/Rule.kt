package calculator

import java.util.regex.Pattern

class Token(val token: Rule, val text: String)

class TokenRule(val rule: Rule, val pattern: Pattern)

enum class Rule {
    fact,
	EPS,
	CLOSE,
	INT,
	MINUS,
	WHITESPACE,
	term,
	expr,
	DOUBLE,
	NUMBER,
	MOD,
	MUL,
	start,
	REVDIV,
	OPEN,
	DIV,
	termP,
	exprP,
	PLUS,
    END
}