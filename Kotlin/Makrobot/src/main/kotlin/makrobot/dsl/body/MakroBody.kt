@file:Suppress("FunctionName", "NonAsciiCharacters")

package makrobot.dsl.body

import makrobot.api.Material
import makrobot.api.Metal
import makrobot.api.Plastik
import makrobot.dsl.MakroBotDsl
import makrobot.dsl.металл
import makrobot.dsl.пластик

@MakroBotDsl
class MakroBody {
    lateinit var материал: Material
    var надпись = arrayListOf<String>()

    infix fun металл.толщиной(thickness: Int) {
        материал = Metal(thickness)
    }

    infix fun пластик.толщиной(thickness: Int) {
        материал = Plastik(thickness)
    }

    infix fun MakroBody.надпись(params: MakroStrings.() -> Unit) {
        надпись = MakroStrings().apply(params).надпись
    }
}