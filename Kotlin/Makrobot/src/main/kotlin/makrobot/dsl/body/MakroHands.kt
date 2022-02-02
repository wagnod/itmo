@file:Suppress("FunctionName", "NonAsciiCharacters")

package makrobot.dsl.body

import makrobot.api.LoadClass
import makrobot.api.Material
import makrobot.api.Metal
import makrobot.api.Plastik
import makrobot.dsl.MakroBotDsl
import makrobot.dsl.металл
import makrobot.dsl.пластик

@MakroBotDsl
class MakroHands {
    val оченьЛегкая = LoadClass.VeryLight
    val легкая = LoadClass.Light
    val средняя = LoadClass.Medium
    val тяжелая = LoadClass.Heavy
    val оченьТяжелая = LoadClass.VeryHeavy
    val невозможная = LoadClass.Enormous

    lateinit var материал: Material
    var нагрузка = оченьЛегкая..легкая

    infix fun металл.толщиной(thickness: Int) {
        материал = Metal(thickness)
    }

    infix fun пластик.толщиной(thickness: Int) {
        материал = Plastik(thickness)
    }

    operator fun LoadClass.minus(maxLoad: LoadClass) = this..maxLoad
}