@file:Suppress("FunctionName", "NonAsciiCharacters")

package makrobot.dsl.head

import makrobot.api.Mouth
import makrobot.api.Speaker
import makrobot.dsl.MakroBotDsl

@MakroBotDsl
class MakroMouth {
    lateinit var рот: Mouth

    inner class SpeakerOf {
        var мощность = 0
    }

    fun динамик(params: SpeakerOf.() -> Unit) {
        val динамик = SpeakerOf().apply(params)

        this.рот = Mouth(Speaker(динамик.мощность))
    }
}