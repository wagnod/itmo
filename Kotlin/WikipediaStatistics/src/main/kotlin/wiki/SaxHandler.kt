package wiki

import org.xml.sax.Attributes
import org.xml.sax.helpers.DefaultHandler

class SaxHandler : DefaultHandler() {
    private val tagsPath = mapOf(
        "title" to listOf("page", "title"),
        "text" to listOf("page", "revision", "text"),
        "timestamp" to listOf("page", "revision", "timestamp")
    )

    private val bytes = tagsPath["text"]

    private val tagsCount = mapOf(
        "title" to StringBuilder(),
        "text" to StringBuilder(),
        "timestamp" to StringBuilder(),
        "bytes" to StringBuilder()
    )

    private val path = mutableListOf<String>()

    private val stat = Statistics()

    private fun clear() {
        path.clear()
        tagsCount.forEach { (_, sb) ->
            sb.clear()
        }
    }

    private fun noMissedTags(): Boolean {
        var done = true
        tagsCount.forEach { (_, sb) ->
            done = done && sb.isNotEmpty()
        }
        return done
    }

    override fun characters(ch: CharArray?, start: Int, length: Int) {
        val curTag = path.lastOrNull()
        if (tagsPath[curTag]?.size?.let { path.takeLast(it) } == tagsPath[curTag]) {
            tagsCount[curTag]?.append(ch?.sliceArray(start until start + length))
        }
    }

    override fun startElement(uri: String?, localName: String?, qName: String?, attributes: Attributes?) {
        if (qName == null) return

        path.add(qName)
        if (path.takeLast(3) == bytes) {
            val value = attributes?.getValue("bytes")
            if (value != null) {
                tagsCount["bytes"]?.append(value.toCharArray())
                if (value == "0") {
                    tagsCount[bytes.last()]?.append("0".toCharArray())
                }
            } else {
                clear()
            }
        }
    }

    override fun endElement(uri: String?, localName: String?, qName: String?) {
        if (qName == "page") {
            if (noMissedTags()) {
                stat.collectFreqStatistics("title", tagsCount.getValue("title").toString())
                stat.collectFreqStatistics("text", tagsCount.getValue("text").toString())
                stat.collectYearStatistics(tagsCount.getValue("timestamp").toString())
                stat.collectSizeStatistics(tagsCount.getValue("bytes").toString())
            }
            clear()
        }
        if (path.isNotEmpty()) path.removeLast()
    }

    fun collectStatistics(): String {
        val tagInfo = listOf(
            "title" to "Топ-300 слов в заголовках статей:",
            "text" to "Топ-300 слов в статьях:",
            "bytes" to "Распределение статей по размеру:",
            "timestamp" to "Распределение статей по времени:",
        )
        stat.collectStatistics()
        val lineBreak = "\r\n"
        return (tagInfo.joinToString(lineBreak) { (name, info) ->
            info + lineBreak +
                    stat.statistics[name]?.joinToString("") { (index, value) ->
                        "$index $value$lineBreak"
                    }
        })
    }
}