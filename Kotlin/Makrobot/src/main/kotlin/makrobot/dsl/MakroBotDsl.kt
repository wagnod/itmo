@file:Suppress("EnumEntryName", "NonAsciiCharacters", "FunctionName")

package makrobot.dsl

import makrobot.api.*
import makrobot.dsl.body.MakroBody
import makrobot.dsl.body.MakroHands
import makrobot.dsl.chassis.MakroWheels
import makrobot.dsl.head.MakroHead

object гусеницы
object пластик
object металл

@MakroBotDsl
class MakroBotOf {
    lateinit var имя: String
    lateinit var голова: Head
    lateinit var туловище: Body
    lateinit var руки: Hands
    lateinit var шасси: Chassis

    val ноги = Chassis.Legs

    infix fun голова(params: MakroHead.() -> Unit) {
        val голова = MakroHead().apply(params)

        this.голова = Head(голова.материал, голова.глаза, голова.рот)
    }

    infix fun туловище(params: MakroBody.() -> Unit) {
        val туловище = MakroBody().apply(params)

        this.туловище = Body(туловище.материал, туловище.надпись)
    }

    infix fun руки(params: MakroHands.() -> Unit) {
        val руки = MakroHands().apply(params)

        this.руки = Hands(руки.материал, руки.нагрузка.start, руки.нагрузка.endInclusive)
    }

    infix fun гусеницы.шириной(width: Int) = Chassis.Caterpillar(width)

    fun колеса(params: MakroWheels.() -> Unit): Chassis.Wheel {
        val колесо = MakroWheels().apply(params)

        return Chassis.Wheel(колесо.количество, колесо.диаметр)
    }
}

fun робот(name: String, params: MakroBotOf.() -> Unit): MakroBot {
    val робот = MakroBotOf().apply(params)
    робот.имя = name

    return MakroBot(робот.имя, робот.голова, робот.туловище, робот.руки, робот.шасси)
}