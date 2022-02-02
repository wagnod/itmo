package mastermind.matching

import mastermind.LENGTH
import mastermind.alphabet
import mastermind.checkMatches
import mastermind.generateSecret
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.random.Random

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    this[index1] = this[index2].also { this[index2] = this[index1] }
}

internal class SequenceMatchingTest {

    companion object {
        @JvmStatic
        fun sequences() = mutableListOf<Arguments>().apply {
            repeat(100) {
                this.add(bullsOrNothing(true))
                this.add(bullsOrNothing(false))
                this.add(allCows())
                this.add(cowsAndBulls())
            }
        }

        // this test works for both sequences with all different and repeating letters
        fun bullsOrNothing(differentLetters: Boolean): Arguments {
            val alphabetNew = alphabet.toMutableList()
            val secret = generateSecret(differentLetters)

            secret.forEach { alphabetNew.remove(it) }

            var secretChanged = secret.toMutableList()
            val repeatCount = Random.nextInt(0, 4)
            var i = 0

            repeat(repeatCount) {
                secretChanged[i++] = alphabetNew.random()
            }

            return Arguments.of(secret, secretChanged.joinToString(""), LENGTH - repeatCount, 0)
        }

        // This test works only for sequences with all different letters
        // I haven't come up with a similar test for repeating ones
        fun allCows(): Arguments {
            val secret = generateSecret()
            var sequenceNotSecret = secret.reversed()

            return Arguments.of(secret, sequenceNotSecret, 0, LENGTH)
        }

        // Same to allCows()
        fun cowsAndBulls(): Arguments {
            val secret = generateSecret()
            var res = secret.toMutableList()
            val count = Random.nextInt(1, res.size - 1)

            for (i in 1..count) res.swap(i, i - 1)

            return Arguments.of(secret, res.joinToString(""), LENGTH - (count + 1), count + 1)
        }
    }

    @ParameterizedTest
    @MethodSource("sequences")
    fun testSequenceMatching(initial: String, actual: String, expectedFullMatch: Int, expectedPartMatch: Int) {
        val actualMatches = checkMatches(initial, actual)

        Assertions.assertEquals(
            expectedFullMatch, actualMatches.first, "Full matches don't equal! " +
                    "Actual full match count = $actualMatches.first, expected full match count = $expectedFullMatch"
        )

        Assertions.assertEquals(
            expectedPartMatch, actualMatches.second, "Part matches don't equal! " +
                    "Part full part count = $actualMatches.second, expected part match count = $expectedPartMatch"
        )
    }
}