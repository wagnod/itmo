package calculator

class Node(val text: String, val rule: Rule) {
    var value : Int = 0
    val children = mutableListOf<Node>()
}
    
class ParseException(message: String?) : Throwable(message)

class CalculatorParser (private val lexer: CalculatorLexer) {
    var result = Node("EPS", Rule.EPS)
    
    fun parse() {
        lexer.nextToken()
        result = start()
    }
    
    fun fact( ) : Node {
        var res = Node("fact", Rule.fact)
        
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.NUMBER -> {
                val NUMBER = Node(lexer.curToken.text, Rule.NUMBER)
                res.children.add(NUMBER)
                consume(Rule.NUMBER)
                res.value = Integer.parseInt(NUMBER.text)
            }
			Rule.OPEN -> {
                val OPEN = Node(lexer.curToken.text, Rule.OPEN)
                res.children.add(OPEN)
                consume(Rule.OPEN)
				val start = start( )
                res.children.add(start)
				val CLOSE = Node(lexer.curToken.text, Rule.CLOSE)
                res.children.add(CLOSE)
                consume(Rule.CLOSE)
                res.value = start.value
            }
             
            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

	fun start( ) : Node {
        var res = Node("start", Rule.start)

        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.NUMBER -> {
                val expr = expr( )
                res.children.add(expr)
                res.value = expr.value
            }
			Rule.OPEN -> {
                val expr = expr( )
                res.children.add(expr)
                res.value = expr.value
            }

            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

	fun termP(acc : Int) : Node {
        var res = Node("termP", Rule.termP)
        res.value = acc
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.DIV -> {
                val DIV = Node(lexer.curToken.text, Rule.DIV)
                res.children.add(DIV)
                consume(Rule.DIV)
				val fact = fact( )
                res.children.add(fact)
				val termP = termP(acc / fact.value)
                res.children.add(termP)
                res.value = termP.value
            }
			Rule.MUL -> {
                val MUL = Node(lexer.curToken.text, Rule.MUL)
                res.children.add(MUL)
                consume(Rule.MUL)
				val fact = fact( )
                res.children.add(fact)
				val termP = termP(acc * fact.value)
                res.children.add(termP)
                res.value = termP.value
            }
			Rule.REVDIV -> {
                val REVDIV = Node(lexer.curToken.text, Rule.REVDIV)
                res.children.add(REVDIV)
                consume(Rule.REVDIV)
				val fact = fact( )
                res.children.add(fact)
				val termP = termP(termP(fact.value).value / acc)
                res.children.add(termP)
                res.value = termP.value
            }
            Rule.PLUS -> {
                res.value = acc
            }
			Rule.MINUS -> {
                res.value = acc
            }
			Rule.CLOSE -> {
                res.value = acc
            }
            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

	fun term( ) : Node {
        var res = Node("term", Rule.term)
        
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.NUMBER -> {
                val fact = fact( )
                res.children.add(fact)
				val termP = termP(fact.value)
                res.children.add(termP)
                res.value = termP.value
            }
			Rule.OPEN -> {
                val fact = fact( )
                res.children.add(fact)
				val termP = termP(fact.value)
                res.children.add(termP)
                res.value = termP.value
            }
             
            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

	fun expr( ) : Node {
        var res = Node("expr", Rule.expr)
        
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.NUMBER -> {
                val term = term( )
                res.children.add(term)
				val exprP = exprP(term.value)
                res.children.add(exprP)
                res.value = exprP.value
            }
			Rule.OPEN -> {
                val term = term( )
                res.children.add(term)
				val exprP = exprP(term.value)
                res.children.add(exprP)
                res.value = exprP.value
            }
             
            Rule.END -> {
                return res
            }
            else -> throw ParseException("Illegal token " + currentRule.name)
        }
        return res
    }

	fun exprP(acc : Int) : Node {
        var res = Node("exprP", Rule.exprP)
        res.value = acc
        var currentRule = lexer.curToken.token
        when (currentRule) {
            Rule.PLUS -> {
                val PLUS = Node(lexer.curToken.text, Rule.PLUS)
                res.children.add(PLUS)
                consume(Rule.PLUS)
				val term = term( )
                res.children.add(term)
				val exprP = exprP(acc + term.value)
                res.children.add(exprP)
                res.value = exprP.value
            }
			Rule.MINUS -> {
                val MINUS = Node(lexer.curToken.text, Rule.MINUS)
                res.children.add(MINUS)
                consume(Rule.MINUS)
				val term = term( )
                res.children.add(term)
				val exprP = exprP(acc - term.value)
                res.children.add(exprP)
                res.value = exprP.value
            }
            Rule.CLOSE -> {
                res.value = acc
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