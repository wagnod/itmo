package wiki

import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream
import java.io.File
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit
import javax.xml.parsers.SAXParserFactory

fun solve(parameters: Parameters) {
    val outputFiles = mutableListOf<BZip2CompressorInputStream>()
    for (input in parameters.inputs) {
        outputFiles.add(BZip2Unpacker().unpack(input))
    }
    val statistics = parse(outputFiles, parameters.threads)
    printResults(parameters.output, statistics)
}

private fun parse(outputFiles: List<BZip2CompressorInputStream>, threads: Int): String {
    val parsingPool = ThreadPoolExecutor(
        threads, threads,
        0L, TimeUnit.MILLISECONDS, LinkedBlockingQueue()
    )
    val statPool = ThreadPoolExecutor(
        threads, threads,
        0L, TimeUnit.MILLISECONDS, LinkedBlockingQueue()
    )
    val handler = SaxHandler()
    val parser = SAXParserFactory.newInstance().newSAXParser()
    for (outputFile in outputFiles) {
        parser.parse(outputFile, handler)
    }
    parsingPool.shutdown()
    parsingPool.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS)
    statPool.shutdown()
    statPool.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS)
    return handler.collectStatistics()
}

private fun printResults(output: String, statistics: String) {
    val outputStream = File(output).outputStream()
    outputStream.write(statistics.toByteArray())
    outputStream.close()
    deleteTempDirectory()
}

private fun deleteTempDirectory() {
    File("temp_data").deleteRecursively()
}