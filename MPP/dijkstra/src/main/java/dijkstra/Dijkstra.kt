package dijkstra

import kotlinx.atomicfu.atomic
import java.util.*
import java.util.concurrent.Phaser
import kotlin.Comparator
import kotlin.concurrent.thread

private val NODE_DISTANCE_COMPARATOR = Comparator<Node> { o1, o2 -> o1!!.distance.compareTo(o2!!.distance) }

fun shortestPathParallel(start: Node) {
    val workers = Runtime.getRuntime().availableProcessors()
    start.distance = 0
    val q = MultiQueue(workers, NODE_DISTANCE_COMPARATOR)
    q.addAndIncrementAndGet(start)
    val onFinish = Phaser(workers + 1)
    repeat(workers) {
        thread {
            while (true) {
                val cur: Node = q.poll() ?: if (q.isNowEmpty()) break else continue

                for (e in cur.outgoingEdges) {
                    while (true) {
                        val oldDistance = e.to.distance
                        val newDistance = cur.distance + e.weight

                        if (oldDistance > newDistance) {
                            if (e.to.casDistance(oldDistance, newDistance)) {
                                q.addAndIncrementAndGet(e.to)
                            } else continue
                        }
                        break
                    }
                }
                q.decrementAndGet()
            }
            onFinish.arrive()
        }
    }
    onFinish.arriveAndAwaitAdvance()
}

private class MultiQueue(val initialCapacity: Int, comparator: Comparator<Node>) {
    val queueList: MutableList<PriorityQueue<Node>> = Collections.nCopies(initialCapacity, PriorityQueue(comparator))
    val size = atomic(0)

    fun poll(): Node? {
        var i = 0
        var j = 0
        while (i == j) {
            i = Random().nextInt(initialCapacity)
            j = Random().nextInt(initialCapacity)
        }

        synchronized(queueList[i]) {
            synchronized(queueList[j]) {
                val isIEmpty = queueList[i].isEmpty()
                val isSameEmptiness = isIEmpty == queueList[j].isEmpty()

                val pollIndex = if (isSameEmptiness)
                    if (!isIEmpty)
                        if (queueList[i].peek().distance < queueList[j].peek().distance) i else j
                    else -1
                else if (isIEmpty) j else i

                return if (pollIndex != -1) queueList[pollIndex].poll() else null
            }
        }
    }

    fun isNowEmpty(): Boolean {
        return size.compareAndSet(0, 0)
    }

    fun addAndIncrementAndGet(element: Node) {
        val randomIndex = Random().nextInt(initialCapacity)

        synchronized(queueList[randomIndex]) {
            queueList[randomIndex].add(element)
        }

        size.incrementAndGet()
    }

    fun decrementAndGet() {
        size.decrementAndGet()
    }
}