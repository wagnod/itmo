package calculator

fun main() {
    val analyzer = CalculatorLexer("8 / 4 / 2")
    val parser = CalculatorParser(analyzer)
    parser.parse()
    val node = parser.result
    println(node.value)
}