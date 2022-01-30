package lambda

class Node(val text: String, val rule: Rule) {
    var value: String = ""
    val children = mutableListOf<Node>()
}

class ParseException(message: String?) : Throwable(message)

class LambdaParser(private val lexer: LambdaLexer) {
    var result = Node("EPS", Rule.EPS)

    fun parse() {
        lexer.nextToken()
        result = start()
    }

    fun or(): Node {
        var res = Node("or", Rule.or)
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.NOT -> {
                val and = and()
                res.children.add(and)
                val orP = orP()
                res.children.add(orP)
                res.value = and.value + " " + orP.value
            }
            Rule.NUMBER -> {
                val and = and()
                res.children.add(and)
                val orP = orP()
                res.children.add(orP)
                res.value = and.value + " " + orP.value
            }
            Rule.LPAREN -> {
                val and = and()
                res.children.add(and)
                val orP = orP()
                res.children.add(orP)
                res.value = and.value + " " + orP.value
            }
            Rule.ID -> {
                val and = and()
                res.children.add(and)
                val orP = orP()
                res.children.add(orP)
                res.value = and.value + " " + orP.value
            }

            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

    fun const(): Node {
        var res = Node("const", Rule.const)
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.NUMBER -> {
                val NUMBER = Node(lexer.curToken.text, Rule.NUMBER)
                res.children.add(NUMBER)
                consume(Rule.NUMBER)
                res.value = NUMBER.text
            }
            Rule.LPAREN -> {
                val LPAREN = Node(lexer.curToken.text, Rule.LPAREN)
                res.children.add(LPAREN)
                consume(Rule.LPAREN)
                val sP = sP()
                res.children.add(sP)
                val RPAREN = Node(lexer.curToken.text, Rule.RPAREN)
                res.children.add(RPAREN)
                consume(Rule.RPAREN)
                res.value = LPAREN.text + " " + sP.value + " " + RPAREN.text
            }
            Rule.ID -> {
                val ID = Node(lexer.curToken.text, Rule.ID)
                res.children.add(ID)
                consume(Rule.ID)
                res.value = ID.text
            }

            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

    fun eqP(): Node {
        var res = Node("eqP", Rule.eqP)
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.EQ -> {
                val EQ = Node(lexer.curToken.text, Rule.EQ)
                res.children.add(EQ)
                consume(Rule.EQ)
                val eq = eq()
                res.children.add(eq)
                res.value = EQ.text + " " + eq.value
            }
            Rule.AND -> {
                res.value = ""
            }
            Rule.OR -> {
                res.value = ""
            }
            Rule.EPS -> {
                res.value = ""
            }
            Rule.RPAREN -> {
                res.value = ""
            }
            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

    fun start(): Node {
        var res = Node("start", Rule.start)
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.LAMBDA -> {
                val LAMBDA = Node(lexer.curToken.text, Rule.LAMBDA)
                res.children.add(LAMBDA)
                consume(Rule.LAMBDA)
                val param = param()
                res.children.add(param)
                val SEMICOLON = Node(lexer.curToken.text, Rule.SEMICOLON)
                res.children.add(SEMICOLON)
                consume(Rule.SEMICOLON)
                val sP = sP()
                res.children.add(sP)
                res.value = LAMBDA.text + " " + param.value + ": " + sP.value
            }

            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

    fun paramP(): Node {
        var res = Node("paramP", Rule.paramP)
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.COMMA -> {
                val COMMA = Node(lexer.curToken.text, Rule.COMMA)
                res.children.add(COMMA)
                consume(Rule.COMMA)
                val param = param()
                res.children.add(param)
                res.value = COMMA.text + " " + param.value
            }
            Rule.SEMICOLON -> {
                res.value = ""
            }
            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

    fun orP(): Node {
        var res = Node("orP", Rule.orP)
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.OR -> {
                val OR = Node(lexer.curToken.text, Rule.OR)
                res.children.add(OR)
                consume(Rule.OR)
                val or = or()
                res.children.add(or)
                res.value = OR.text + " " + or.value
            }
            Rule.EPS -> {
                res.value = ""
            }
            Rule.RPAREN -> {
                res.value = ""
            }
            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

    fun eq(): Node {
        var res = Node("eq", Rule.eq)
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.NUMBER -> {
                val const = const()
                res.children.add(const)
                val eqP = eqP()
                res.children.add(eqP)
                res.value = const.value + " " + eqP.value
            }
            Rule.LPAREN -> {
                val const = const()
                res.children.add(const)
                val eqP = eqP()
                res.children.add(eqP)
                res.value = const.value + " " + eqP.value
            }
            Rule.ID -> {
                val const = const()
                res.children.add(const)
                val eqP = eqP()
                res.children.add(eqP)
                res.value = const.value + " " + eqP.value
            }

            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

    fun not(): Node {
        var res = Node("not", Rule.not)
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.NOT -> {
                val NOT = Node(lexer.curToken.text, Rule.NOT)
                res.children.add(NOT)
                consume(Rule.NOT)
                val eq = eq()
                res.children.add(eq)
                res.value = NOT.text + " " + eq.value
            }
            Rule.NUMBER -> {
                val eq = eq()
                res.children.add(eq)
                res.value = eq.value
            }
            Rule.LPAREN -> {
                val eq = eq()
                res.children.add(eq)
                res.value = eq.value
            }
            Rule.ID -> {
                val eq = eq()
                res.children.add(eq)
                res.value = eq.value
            }

            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

    fun andP(): Node {
        var res = Node("andP", Rule.andP)
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.AND -> {
                val AND = Node(lexer.curToken.text, Rule.AND)
                res.children.add(AND)
                consume(Rule.AND)
                val and = and()
                res.children.add(and)
                res.value = AND.text + " " + and.value
            }
            Rule.OR -> {
                res.value = ""
            }
            Rule.EPS -> {
                res.value = ""
            }
            Rule.RPAREN -> {
                res.value = ""
            }
            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

    fun param(): Node {
        var res = Node("param", Rule.param)
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.ID -> {
                val ID = Node(lexer.curToken.text, Rule.ID)
                res.children.add(ID)
                consume(Rule.ID)
                val paramP = paramP()
                res.children.add(paramP)
                res.value = ID.text + " " + paramP.value
            }
            Rule.SEMICOLON -> {
                res.value = ""
            }
            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

    fun and(): Node {
        var res = Node("and", Rule.and)
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.NOT -> {
                val not = not()
                res.children.add(not)
                val andP = andP()
                res.children.add(andP)
                res.value = not.value + " " + andP.value
            }
            Rule.NUMBER -> {
                val not = not()
                res.children.add(not)
                val andP = andP()
                res.children.add(andP)
                res.value = not.value + " " + andP.value
            }
            Rule.LPAREN -> {
                val not = not()
                res.children.add(not)
                val andP = andP()
                res.children.add(andP)
                res.value = not.value + " " + andP.value
            }
            Rule.ID -> {
                val not = not()
                res.children.add(not)
                val andP = andP()
                res.children.add(andP)
                res.value = not.value + " " + andP.value
            }

            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

    fun sP(): Node {
        var res = Node("sP", Rule.sP)
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.NOT -> {
                val or = or()
                res.children.add(or)
                res.value = or.value
            }
            Rule.NUMBER -> {
                val or = or()
                res.children.add(or)
                res.value = or.value
            }
            Rule.LPAREN -> {
                val or = or()
                res.children.add(or)
                res.value = or.value
            }
            Rule.ID -> {
                val or = or()
                res.children.add(or)
                res.value = or.value
            }

            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

    fun consume(expected: Rule) {
        val actual = lexer.curToken.token
        if (expected != actual) {
            throw ParseException("Illegal token " + actual.name + ", expected " + expected.name)
        }
        lexer.nextToken()
    }
}