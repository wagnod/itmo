package makrobot.api

import makrobot.dsl.MakroBotDsl

@MakroBotDsl
class MakroBot(val name: String, val head: Head, val body: Body, val hands: Hands, val chassis: Chassis) {

    var speed: Int = 5

    var power = 3

    fun stepForward(steps: Int) = println("stepForward $steps")

    fun stepBack(steps: Int) = println("stepBack $steps")

    fun turnAround() = println("turnAround")

    fun pronounce(source: String) = println("pronounce: \n$source")
}