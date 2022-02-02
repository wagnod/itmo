package wiki

import java.util.concurrent.ConcurrentHashMap

class Statistics {
    private val sizeStatistics = ConcurrentHashMap<Int, Int>()
    private val yearStatistics = ConcurrentHashMap<Int, Int>()
    private val freqStatisticsText = ConcurrentHashMap<String, Int>()
    private val freqStatisticsTitle = ConcurrentHashMap<String, Int>()

    val statistics = mutableMapOf<String, List<Pair<String, String>>>(
        "title" to listOf(),
        "text" to listOf(),
        "timestamp" to listOf(),
        "bytes" to listOf()
    )

    fun collectStatistics() {
        statistics["title"] = freqStatistics("title")
        statistics["text"] = freqStatistics("text")
        statistics["timestamp"] = yearStatistics()
        statistics["bytes"] = sizeStatistics()
    }

    fun collectSizeStatistics(data: String) {
        val index = data.toIntOrNull() ?: return

        sizeStatistics.compute(index.toString().lastIndex) { _, value ->
            value?.plus(1) ?: 1
        }
    }

    private fun sizeStatistics(): List<Pair<String, String>> {
        val range = range(sizeStatistics)
        return range.map { year ->
            Pair("$year", "${sizeStatistics[year] ?: 0}")
        }
    }

    fun collectYearStatistics(data: String) {
        val year = data.take(4).toIntOrNull() ?: return

        yearStatistics.compute(year) { _, value ->
            value?.plus(1) ?: 1
        }
    }

    private fun yearStatistics(): List<Pair<String, String>> {
        val range = range(yearStatistics)
        return range.map { year ->
            Pair("$year", "${yearStatistics[year] ?: 0}")
        }
    }

    fun collectFreqStatistics(op: String, data: String) {
        val regex = """[а-я]{3,}""".toRegex()
        when (op) {
            "text" -> {
                regex.findAll(data.lowercase()).forEach { result ->
                    freqStatisticsText.compute(result.value) { _, value ->
                        value?.plus(1) ?: 1
                    }
                }
            }
            "title" -> {
                regex.findAll(data.lowercase()).forEach { result ->
                    freqStatisticsTitle.compute(result.value) { _, value ->
                        value?.plus(1) ?: 1
                    }
                }
            }
            else -> {
                throw IllegalArgumentException()
            }
        }
    }

    private fun freqStatistics(data: String): List<Pair<String, String>> {
        when (data) {
            "text" -> {
                val stat = freqStatisticsText.toList().sortedWith(compareByDescending<Pair<String, Int>> { (_, count) ->
                    count
                }.thenBy { (name, _) ->
                    name
                }).take(300).map { (name, count) ->
                    Pair("$count", name)
                }
                return stat
            }
            "title" -> {
                val stat = freqStatisticsTitle.toList().sortedWith(compareByDescending<Pair<String, Int>> { (_, count) ->
                    count
                }.thenBy { (name, _) ->
                    name
                }).take(300).map { (name, count) ->
                    Pair("$count", name)
                }
                return stat
            }
            else -> throw IllegalArgumentException()
        }
    }


    private fun range(stat: ConcurrentHashMap<Int, Int>): IntRange {
        val minRange = stat.keys.minOrNull()
        val maxRange = stat.keys.maxOrNull()
        var range = IntRange.EMPTY
        if (minRange != null && maxRange != null) {
            range = minRange..maxRange
        }
        return range
    }
}