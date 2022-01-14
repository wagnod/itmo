import guru.nidi.graphviz.engine.Format
import guru.nidi.graphviz.toGraphviz
import java.io.File

fun main() {
    val analyzer = LexicalAnalyzer("lambda n : n and true")

    val parser = Parser(analyzer)
    parser.parse()
    println(analyzer.result)
    println(parser.graph.toString())
    parser.graph.toGraphviz().render(Format.PNG).toFile(File("example/tree.png"))
}