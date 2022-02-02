@file:Suppress("FunctionName", "NonAsciiCharacters")

package makrobot.dsl.body

import makrobot.dsl.MakroBotDsl

@MakroBotDsl
class MakroStrings {
    var надпись = arrayListOf<String>()

    operator fun String.unaryPlus() = надпись.add(this)
}