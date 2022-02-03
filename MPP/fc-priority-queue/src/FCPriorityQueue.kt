import kotlinx.atomicfu.AtomicArray
import kotlinx.atomicfu.atomic
import kotlinx.atomicfu.atomicArrayOfNulls
import java.util.*

class FCPriorityQueue<E : Comparable<E>> {
    private val q = PriorityQueue<E>()
    private val lock = atomic(false)
    private val size = 10
    private val operations: AtomicArray<Queue<E>?> = atomicArrayOfNulls(size)

    class Queue<T>(var operation: Operations, var element: T?)

    enum class Operations {
        ADD,
        POLL,
        DONE
    }

    private fun combine(queue: Queue<E>): E? {
        while (true) {
            val pos = Random().nextInt(size)
            if (operations[pos].compareAndSet(null, queue)) {
                if (lock.compareAndSet(expect = false, update = true)) {
                    for (i in 0 until size) {
                        val value = operations[i].value ?: continue
                        if (value.operation != Operations.DONE) {
                            if (value.operation == Operations.ADD) {
                                q.add(value.element)
                            }
                            if (value.operation == Operations.POLL) {
                                value.element = q.poll()
                            }
                            value.operation = Operations.DONE
                        }
                    }
                    lock.compareAndSet(true, update = false)
                }

                if (queue.operation == Operations.DONE) {
                    val res = queue.element
                    operations[pos].value = null
                    return res
                }
            }
        }
    }

    /**
     * Retrieves the element with the highest priority
     * and returns it as the result of this function;
     * returns `null` if the queue is empty.
     */
    fun poll(): E? {
        return combine(Queue(Operations.POLL, null))
//        return q.poll()
    }

    /**
     * Returns the element with the highest priority
     * or `null` if the queue is empty.
     */
    fun peek(): E? {
        return q.peek()
    }

    /**
     * Adds the specified element to the queue.
     */
    fun add(element: E) {
        combine(Queue(Operations.ADD, element))
//        q.add(element)
    }
}