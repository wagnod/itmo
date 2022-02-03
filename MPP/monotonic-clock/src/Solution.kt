/**
 * В теле класса решения разрешено использовать только переменные делегированные в класс RegularInt.
 * Нельзя volatile, нельзя другие типы, нельзя блокировки, нельзя лазить в глобальные переменные.
 *
 * @author :TODO: Симонович Варвара
 */
// Lamport Monotonic Clock
class Solution : MonotonicClock {
    private var c1 by RegularInt(0)
    private var c2 by RegularInt(0)
    private var c3 by RegularInt(0)
    private var c21 by RegularInt(0)
    private var c22 by RegularInt(0)
    private var c23 by RegularInt(0)

    override fun write(time: Time) {
        // write left-to-right firstly
        c21 = time.d1
        c22 = time.d2
        c23 = time.d3
        // write right-to-left
        c3 = time.d3
        c2 = time.d2
        c1 = time.d1
    }

    override fun read(): Time {
        val r1 by RegularInt(c1)
        val r2 by RegularInt(c2)
        val r3 by RegularInt(c3)
        val r23 by RegularInt(c23)
        val r22 by RegularInt(c22)
        val r21 by RegularInt(c21)

        if (r1 == r21) {
            if (r2 == r22) {
                if (r3 == r23) {
                    return Time(r1, r2, r3)
                }
                return Time(r1, r2, r23)
            }
            return Time(r1, r22, 0)
        }
        return Time(r21, 0, 0)
    }
}