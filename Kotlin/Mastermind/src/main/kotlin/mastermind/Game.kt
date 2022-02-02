package mastermind

val alphabet = listOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H')
const val LENGTH = 4

fun playMastermind(player: Player = RealPlayer(), secret: String = generateSecret(player.mode)) {
    var complete = false

    do {
        val guess = player.guess()

        if (!inputValidation(guess)) {
            player.incorrectInput(guess)
        } else {
            val matches = checkMatches(secret, guess)

            if (matches.first == LENGTH) complete = true

            player.receiveEvaluation(complete, matches.first, matches.second)
        }
    } while (!complete)
}

fun generateSecret(differentLetters: Boolean = true): String {
    return if (differentLetters) {
        val variance = alphabet.toMutableList()

        List(LENGTH) {
            val randomCh = variance.random()
            variance.remove(randomCh)
            randomCh
        }.joinToString("")
    } else {
        List(LENGTH) { alphabet.random() }.joinToString("")
    }
}

fun checkMatches(secret: String, guess: String): Pair<Int, Int> {
    val absoluteMatches = guess.filterIndexed { index, i -> i == secret[index] }.length
    var secretCopy = secret
    var partialMatches = 0

    for (i in guess) {
        if (secretCopy.contains(i)) {
            partialMatches += 1
            secretCopy = secretCopy.replaceFirst(i, '_')
        }
    }

    return Pair(absoluteMatches, partialMatches - absoluteMatches)
}

fun inputValidation(guess: String): Boolean {
    return guess.filter {
        alphabet.contains(it)
    }.length == LENGTH
}