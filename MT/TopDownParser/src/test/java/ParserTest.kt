import guru.nidi.graphviz.attribute.Color.GREEN
import guru.nidi.graphviz.attribute.Color.WHITE
import guru.nidi.graphviz.model.Factory.mutGraph
import guru.nidi.graphviz.model.Factory.node
import guru.nidi.graphviz.model.Link
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ParserTest {
    companion object {
        @JvmStatic
        fun lexerString() = mutableListOf<Arguments>().apply {
            this.add(Arguments.of("lambda 2n: n == 1", "Illegal argument ", "2", 7))
            this.add(Arguments.of("lambda n: n !== 1", "Illegal argument ", "!", 12))
        }

        @JvmStatic
        fun parserErrorString() = mutableListOf<Arguments>().apply {
            this.add(Arguments.of("n: n and true", "Unexpected token ", "n", 1))
            this.add(Arguments.of("lambda a, b : a not not (b == 2)", "Unexpected token ", "not", 19))
            this.add(Arguments.of("lambda a b : a not not (b == 2)", "Unexpected token ", "b", 7))
            this.add(Arguments.of("lambda n: n and == true", "Unexpected token ", "==", 19))
            this.add(Arguments.of("lambda n : n or (not n", "Unexpected token ", " ", 22))
        }

        @JvmStatic
        fun parserTestSring() = mutableListOf<Arguments>().apply {
            this.add(
                Arguments.of(
                    "lambda n : \nn or (not n)",
                    listOf("lambda", "n", ":", "n", "or", "(", "not", "n", ")")
                )
            )
            this.add(
                Arguments.of(
                    "lambda a, b : a and not (b == 2)",
                    listOf("lambda", "a", ",", "b", ":", "a", "and", "not", "(", "b", "==", "2", ")")
                )
            )
            this.add(
                Arguments.of(
                    "lambda n : n or true",
                    listOf("lambda", "n", ":", "n", "or", "true")
                )
            )
            this.add(
                Arguments.of(
                    "lambda x : not (x == true) ",
                    listOf("lambda", "x", ":", "not", "(", "x", "==", "true", ")")
                )
            )
            this.add(Arguments.of("lambda\n n\n : n", listOf("lambda", "n", ":", "n")))
        }
    }


    @Test
    fun treeTest() {
        val str = "lambda a, b : a or not (b == 2)"

        val testGraph = mutGraph().setDirected(true)
            .graphAttrs().add(WHITE.background())
            .add(node("S").link(Link.to(node("lambda").with(GREEN))))
            .add(node("S").link(Link.to(node("PARAM"))))
            .add(node("PARAM").link(Link.to(node("a").with(GREEN))))
            .add(node("PARAM").link(Link.to(node("PARAM'"))))
            .add(node("PARAM'").link(Link.to(node("b").with(GREEN))))
            .add(node("S").link(Link.to(node(":").with(GREEN))))
            .add(node("S").link(Link.to(node("S'"))))
            .add(node("S'").link(Link.to(node("OR"))))
            .add(node("OR").link(Link.to(node("AND"))))
            .add(node("AND").link(Link.to(node("NOT"))))
            .add(node("NOT").link(Link.to(node("EQ"))))
            .add(node("EQ").link(Link.to(node("CONST"))))
            .add(node("CONST").link(Link.to(node("a").with(GREEN))))
            .add(node("EQ").link(Link.to(node("EQ'"))))
            .add(node("EQ'").link(Link.to(node("eps").with(GREEN))))
            .add(node("AND").link(Link.to(node("AND'"))))
            .add(node("AND'").link(Link.to(node("eps").with(GREEN))))
            .add(node("OR").link(Link.to(node("OR'"))))
            .add(node("OR'").link(Link.to(node("or").with(GREEN))))
            .add(node("OR").link(Link.to(node("AND"))))
            .add(node("AND").link(Link.to(node("NOT"))))
            .add(node("NOT").link(Link.to(node("not").with(GREEN))))
            .add(node("NOT").link(Link.to(node("EQ"))))
            .add(node("EQ").link(Link.to(node("CONST"))))
            .add(node("CONST").link(Link.to(node("(").with(GREEN))))
            .add(node("S'").link(Link.to(node("OR"))))
            .add(node("OR").link(Link.to(node("AND"))))
            .add(node("AND").link(Link.to(node("NOT"))))
            .add(node("NOT").link(Link.to(node("EQ"))))
            .add(node("EQ").link(Link.to(node("CONST"))))
            .add(node("CONST").link(Link.to(node("b").with(GREEN))))
            .add(node("EQ").link(Link.to(node("EQ'"))))
            .add(node("EQ'").link(Link.to(node("==").with(GREEN))))
            .add(node("EQ'").link(Link.to(node("EQ"))))
            .add(node("EQ").link(Link.to(node("CONST"))))
            .add(node("CONST").link(Link.to(node("2").with(GREEN))))
            .add(node("CONST").link(Link.to(node(")").with(GREEN))))
            .add(node("CONST").link(Link.to(node("S'"))))
            .add(node("OR'").link(Link.to(node("eps").with(GREEN))))
            .add(node("OR'").link(Link.to(node("OR"))))

        val analyzer = LexicalAnalyzer(str)
        val parser = Parser(analyzer)
        parser.parse()

        assertEquals(testGraph.toString(), parser.graph.toString())
    }

    @ParameterizedTest
    @MethodSource("lexerString")
    fun lexerErrorTest(test: String, exceptionMessage: String, char: String, position: Int) {
        val analyzer = LexicalAnalyzer(test)
        val parser = Parser(analyzer)
        assertFailsWith<ParseException>(
            message = exceptionMessage + char + " at pos " + position.toChar(),
            block = {
                parser.parse()
            }
        )
    }

    @ParameterizedTest
    @MethodSource("parserErrorString")

    fun parserErrorTest(test: String, exceptionMessage: String, token: String, position: Int) {
        val analyzer = LexicalAnalyzer(test)
        val parser = Parser(analyzer)
        assertFailsWith<ParseException>(
            message = exceptionMessage + " $token at pos ${position.toChar()}",
            block = {
                parser.parse()
            }
        )
    }

    @ParameterizedTest
    @MethodSource("parserTestSring")
    fun parseResultTest(test: String, expected: List<String>) {
        val analyzer = LexicalAnalyzer(test)
        val parser = Parser(analyzer)
        parser.parse()
        assertEquals(expected, analyzer.result)
    }
}