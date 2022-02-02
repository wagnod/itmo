@file:Suppress("FunctionName", "NonAsciiCharacters")

package makrobot.dsl.head

import makrobot.api.Eye
import makrobot.api.LampEye
import makrobot.api.LedEye
import makrobot.dsl.MakroBotDsl

@MakroBotDsl
class MakroEyes {
    val глаза = arrayListOf<Eye>()

    inner class EyesOfLamps {
        var количество = 0
        var яркость = 0
    }

    inner class EyesOfLed {
        var количество = 0
        var яркость = 0
    }

    fun диоды(params: EyesOfLed.() -> Unit) {
        val диоды = EyesOfLed().apply(params)

        repeat(диоды.количество) {
            this.глаза.add(LedEye(диоды.яркость))
        }
    }

    fun лампы(params: EyesOfLamps.() -> Unit) {
        val лампы = EyesOfLamps().apply(params)

        repeat(лампы.количество) {
            this.глаза.add(LampEye(лампы.яркость))
        }
    }
}