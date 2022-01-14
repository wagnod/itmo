import guru.nidi.graphviz.attribute.Color.GREEN
import guru.nidi.graphviz.attribute.Color.WHITE
import guru.nidi.graphviz.model.Factory.mutGraph
import guru.nidi.graphviz.model.Factory.node
import guru.nidi.graphviz.model.Link
import guru.nidi.graphviz.model.Node

class Parser(private val lex: LexicalAnalyzer) {
    val graph = mutGraph().setDirected(true).graphAttrs().add(WHITE.background())

    fun parse() {
        lex.nextChar()
        lex.nextToken()
        nonTermS()
    }

    fun nonTermS(): Node {
        val node = node("S")
        graph.add(node)
        if (lex.curToken == Token.LAMBDA) {
            graph.add(node.link(Link.to(node("lambda").with(GREEN))))
            lex.nextToken()
            val vars = nonTermParam()
            graph.add(node.link(Link.to(vars)))
            // :
            if (lex.curToken != Token.SEMICOLON) {
                throw ParseException("Unexpected token" + lex.str + lex.curPos)
            }
            graph.add(node.link(Link.to(node(":").with(GREEN))))
            lex.nextToken()
            // S'
            val cont = nonTermSPrime()
            graph.add(node.link(Link.to(cont)))
            return node
        }
        throw ParseException("Unexpected token ${lex.str} at pos ${lex.curPos}")
    }

    private fun nonTermSPrime(): Node {
        val node = node("S'")
        graph.add(node)
        val options = listOf(Token.NAME, Token.NOT, Token.VALUE, Token.LPAREN)
        if (lex.curToken in options) {
            val or = nonTermOr()
            graph.add(node.link(Link.to(or)))
            return node
        }
        throw ParseException("Unexpected token ${lex.str} at pos ${lex.curPos}")
    }

    private fun nonTermParam(): Node {
        val node = node("PARAM")
        graph.add(node)
        if (lex.curToken == Token.NAME) {
            // variable
            val name = node(lex.str).with(GREEN)
            graph.add(node.link(Link.to(name)))
            lex.nextToken()
            // Param`
            if (lex.curToken == Token.COMMA) {
                lex.nextToken()
                val vars = nonTermParamPrime()
                graph.add(node.link(Link.to(vars)))
            }
            return node
        }
        throw ParseException("Unexpected token ${lex.str} at pos ${lex.curPos}")
    }

    private fun nonTermParamPrime(): Node {
        val node = node("PARAM'")
        graph.add(node)
        if (lex.curToken == Token.NAME) {
            // variable
            val name = node(lex.str).with(GREEN)
            graph.add(node.link(Link.to(name)))
            lex.nextToken()
            // Param
            if (lex.curToken == Token.COMMA) {
                val vars = nonTermParam()
                graph.add(node.link(Link.to(vars)))
            }
            return node
        }
        throw ParseException("Unexpected token ${lex.str} at pos ${lex.curPos}")
    }


    private fun nonTermOr(): Node {
        val node = node("OR")
        graph.add(node)
        val options = listOf(Token.NAME, Token.NOT, Token.VALUE, Token.LPAREN)
        if (lex.curToken in options) {
            val and = nonTermAnd()
            graph.add(node.link(Link.to(and)))

            val orP = nonTermOrPrime()
            graph.add(node.link(Link.to(orP)))
            return node
        }
        throw ParseException("Unexpected token ${lex.str} at pos ${lex.curPos}")
    }

    private fun nonTermOrPrime(): Node {
        val node = node("OR'")
        graph.add(node)
        if (lex.curToken == Token.OR) {
            graph.add(node.link(Link.to(node("or").with(GREEN))))
            lex.nextToken()
            val or = nonTermOr()
            graph.add(node.link(Link.to(or)))
            return node
        } else if (lex.curToken == Token.RPAREN || lex.curToken == Token.END) {
            graph.add(node.link(Link.to(node("eps").with(GREEN))))
            return node
        }
        throw ParseException("Unexpected token ${lex.str} at pos ${lex.curPos}")
    }

    private fun nonTermAnd(): Node {
        val node = node("AND")
        graph.add(node)
        val options = listOf(Token.NAME, Token.NOT, Token.VALUE, Token.LPAREN)
        if (lex.curToken in options) {
            val not = nonTermNot()
            graph.add(node.link(Link.to(not)))
            val andP = nonTermAndPrime()
            graph.add(node.link(Link.to(andP)))
            return node
        }
        throw ParseException("Unexpected token ${lex.str} at pos ${lex.curPos}")
    }

    private fun nonTermAndPrime(): Node {
        val node = node("AND'")
        graph.add(node)
        if (lex.curToken == Token.AND) {
            graph.add(node.link(Link.to(node("and").with(GREEN))))
            lex.nextToken()
            val and = nonTermAnd()
            graph.add(node.link(Link.to(and)))
            return node
        } else if (lex.curToken == Token.OR || lex.curToken == Token.RPAREN || lex.curToken == Token.END) {
            graph.add(node.link(Link.to(node("eps").with(GREEN))))
            return node
        }
        throw ParseException("Unexpected token ${lex.str} at pos ${lex.curPos}")
    }

    private fun nonTermNot(): Node {
        val node = node("NOT")
        graph.add(node)
        val options = listOf(Token.NAME, Token.VALUE, Token.LPAREN)
        if (lex.curToken == Token.NOT) {
            graph.add(node.link(Link.to(node("not").with(GREEN))))
            lex.nextToken()
            val eq = nonTermEq()
            graph.add(node.link(Link.to(eq)))
            return node
        } else if (lex.curToken in options) {
            val eq = nonTermEq()
            graph.add(node.link(Link.to(eq)))
            return node
        }
        throw ParseException("Unexpected token ${lex.str} at pos ${lex.curPos}")
    }

    private fun nonTermEq(): Node {
        val node = node("EQ")
        graph.add(node)
        val options = listOf(Token.NAME, Token.VALUE, Token.LPAREN)
        if (lex.curToken in options) {
            val const = nonTermConst()
            graph.add(node.link(Link.to(const)))
            val eqP = nonTermEqPrime()
            graph.add(node.link(Link.to(eqP)))
            return node
        }
        throw ParseException("Unexpected token ${lex.str} at pos ${lex.curPos}")
    }

    private fun nonTermEqPrime(): Node {
        val node = node("EQ'")
        graph.add(node)
        val options = listOf(Token.OR, Token.AND, Token.RPAREN, Token.END)
        if (lex.curToken == Token.EQUAL) {
            lex.nextToken()
            graph.add(node.link(Link.to(node("==").with(GREEN))))
            val eq = nonTermEq()
            graph.add(node.link(Link.to(eq)))
            return node
        } else if (lex.curToken in options) {
            graph.add(node.link(Link.to(node("eps"))))
            return node
        }
        throw ParseException("Unexpected token ${lex.str} at pos ${lex.curPos}")
    }

    private fun nonTermConst(): Node {
        val node = node("CONST")
        graph.add(node)
        if (lex.curToken == Token.NAME || lex.curToken == Token.VALUE) {
            val value = node(lex.str).with(GREEN)
            graph.add(node.link(Link.to(value)))
            lex.nextToken()
            return node
        } else if (lex.curToken == Token.LPAREN) {
            lex.nextToken()
            graph.add(node.link(Link.to(node("(").with(GREEN))))
            val sP = nonTermSPrime()
            if (lex.curToken == Token.RPAREN) {
                lex.nextToken()
                graph.add(
                    node.link(Link.to(sP))
                        .link(Link.to(node(")").with(GREEN)))
                )
                return node
            }
        }
        throw ParseException("Unexpected token ${lex.str} at pos ${lex.curPos}")
    }
}