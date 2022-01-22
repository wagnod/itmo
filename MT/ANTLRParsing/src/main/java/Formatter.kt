import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.TokenStream
import org.antlr.v4.runtime.tree.ParseTree
import java.nio.file.Files
import java.nio.file.Path

class Formatter {
    fun format(inputPath: Path): String {
        val parser = getParser(inputPath)
        val parsedTree: ParseTree = parser.tree()
        val visitor = Visitor()
        visitor.visit(parsedTree)
        return visitor.getCode()
    }

    private fun getParser(inputPath: Path): GrammarParser {
        val stream: CharStream = CharStreams.fromPath(inputPath)
        val lexer = GrammarLexer(stream)
        val ts: TokenStream = CommonTokenStream(lexer)
        return GrammarParser(ts)
    }
}

fun main(args: Array<String>) {
    Files.newBufferedWriter(Path.of(args[1])).use { writer ->
        val formatter = Formatter()
        val inputPath = Path.of(args[0])
        val formatted = formatter.format(inputPath)
        writer.write(formatted)
    }
}