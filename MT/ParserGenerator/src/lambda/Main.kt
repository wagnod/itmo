package lambda

fun main() {
    val analyzer = LambdaLexer("lambda n : n and true")
    val parser = LambdaParser(analyzer)
    parser.parse()
    val node = parser.result
    println(node.value)
}