package lambda

import java.util.regex.Pattern

class Token(val token: Rule, val text: String)

class TokenRule(val rule: Rule, val pattern: Pattern)

enum class Rule {
    const,
	paramP,
	EPS,
	orP,
	not,
	param,
	and,
	SEMICOLON,
	WHITESPACE,
	ID,
	COMMA,
	NUMBER,
	or,
	OR,
	eqP,
	start,
	LPAREN,
	RPAREN,
	eq,
	EQ,
	LAMBDA,
	NOT,
	andP,
	AND,
	sP,
    END
}