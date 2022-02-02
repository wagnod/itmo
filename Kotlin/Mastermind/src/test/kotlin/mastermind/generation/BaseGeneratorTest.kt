package mastermind.generation

import mastermind.LENGTH
import mastermind.generateSecret
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class BaseGeneratorTest {

    companion object {
        @JvmStatic
        fun sequencesLength() = mutableListOf<Arguments>().apply {
            repeat(100) {
                this.add(Arguments.of(generateSecret(true), LENGTH))
            }
        }

        @JvmStatic
        fun sequencesDuplicates() = mutableListOf<Arguments>().apply {
            repeat(100) {
                this.add(Arguments.of(generateSecret(true)))
            }
        }
    }

    @ParameterizedTest
    @MethodSource("sequencesLength")
    fun checkSequenceLength(seq: String, expectedLen: Int) {
        Assertions.assertEquals(expectedLen, seq.length, "Wrong length for generated sequence $seq")
    }

    @ParameterizedTest
    @MethodSource("sequencesDuplicates")
    fun checkCharDifference(seq: String) {
        Assertions.assertEquals(seq.length, seq.toSet().size, "There are duplicates in the sequence $seq")
    }
}