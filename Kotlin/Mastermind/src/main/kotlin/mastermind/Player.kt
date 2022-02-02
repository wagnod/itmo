package mastermind

import java.util.*

interface Player {
    val mode: Boolean

    fun guess(): String
    fun receiveEvaluation(complete: Boolean, positions: Int, letters: Int)
    fun incorrectInput(guess: String) {}
    fun choseMode(): Boolean
}

class RealPlayer : Player {
    private val scanner = Scanner(System.`in`)
    override var mode: Boolean = choseMode()

    override fun choseMode(): Boolean {
        print("Chose if letters are repeated/not repeated (r/n): ")

        if (scanner.next() == "n") return true
        return false
    }

    override fun guess(): String {
        print("Your guess: ")
        return scanner.next()
    }

    override fun receiveEvaluation(complete: Boolean, positions: Int, letters: Int) {
        if (complete) {
            println("You are correct!")
        } else {
            println("Positions: $positions; letters: $letters.")
        }
    }

    override fun incorrectInput(guess: String) {
        println("Incorrect input: $guess. It should consist of 4 letters (A, B, C, D, E, F, G, H).")
    }
}