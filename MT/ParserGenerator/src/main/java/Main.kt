fun main() {
    val calculator = "calculator"
//    val lambda = "lambda"
    val grammar = makeGrammar(calculator)
//    val grammar = makeGrammar(lambda)
    val lexGen = LexerGenerator(grammar)
    lexGen.generateRule()
    lexGen.generateLexer(grammar.rules.filterIsInstance<Term>().filter { it.name != epsilon })
    val parserGen = ParserGenerator(grammar)
    parserGen.makeFirst()
    parserGen.makeFollow()
    parserGen.generateParser()
}