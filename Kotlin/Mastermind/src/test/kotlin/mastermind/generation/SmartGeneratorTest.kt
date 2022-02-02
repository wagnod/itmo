package mastermind.generation

import mastermind.LENGTH
import mastermind.generateSecret
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class SmartGeneratorTest {
    companion object {
        @JvmStatic
        fun sequencesLength() = mutableListOf<Arguments>().apply {
            repeat(100) {
                this.add(Arguments.of(generateSecret(false), LENGTH))
            }
        }
    }

    @ParameterizedTest
    @MethodSource("sequencesLength")
    fun checkSequenceLength(seq: String, expectedLen: Int) {
        Assertions.assertEquals(expectedLen, seq.length, "Wrong length for generated sequence $seq")
    }
}