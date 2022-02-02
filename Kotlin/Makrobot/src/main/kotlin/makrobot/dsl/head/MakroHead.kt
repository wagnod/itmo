@file:Suppress("FunctionName", "NonAsciiCharacters")

package makrobot.dsl.head

import makrobot.api.*
import makrobot.dsl.MakroBotDsl
import makrobot.dsl.металл
import makrobot.dsl.пластик

@MakroBotDsl
class MakroHead {
    lateinit var материал: Material
    lateinit var рот: Mouth
    var глаза = arrayListOf<Eye>()

    infix fun металл.толщиной(thickness: Int) {
        материал = Metal(thickness)
    }

    infix fun пластик.толщиной(thickness: Int) {
        материал = Plastik(thickness)
    }

    infix fun MakroHead.глаза(params: MakroEyes.() -> Unit) {
        глаза = MakroEyes().apply(params).глаза
    }

    infix fun MakroHead.рот(params: MakroMouth.() -> Unit) {
        рот = MakroMouth().apply(params).рот
    }
}