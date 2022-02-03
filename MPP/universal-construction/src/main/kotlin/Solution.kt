/**
 * @author Симонович Варвара
 */

class Solution : AtomicCounter {
    // объявите здесь нужные вам поля
    private val root = Node(0)
    private val last = ThreadLocal<Node>()

    override fun getAndAdd(x: Int): Int {
        // напишите здесь код
        if (last.get() == null) {
            last.set(root)
        }

        while (true) {
            val old = last.get().value
            val node = Node(old + x)
            last.set(last.get().next.decide(node))

            if (last.get() == node) {
                return old
            }
        }
    }

    // вам наверняка потребуется дополнительный класс
    private class Node(val value: Int) {
        val next = Consensus<Node>()
    }
}