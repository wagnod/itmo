@file:Suppress("EnumEntryName", "NonAsciiCharacters")

package makrobot.api

import makrobot.dsl.MakroBotDsl

enum class WeekDay {
    пн, вт, ср, чт, пт, сб, вс
}

@MakroBotDsl
class Schedule {

    val timePoints = arrayListOf<Pair<WeekDay, Int>>()
    val exceptDaysOfMonth = arrayListOf<Int>()

    override fun toString(): String {
        return buildString {
            append(timePoints.joinToString(prefix = "Расписание: ") { "${it.first} в ${it.second}ч" })
            if (exceptDaysOfMonth.isNotEmpty()) {
                append(exceptDaysOfMonth.joinToString(prefix = " кроме: ", postfix = " чисел месяца"))
            }
        }
    }
}