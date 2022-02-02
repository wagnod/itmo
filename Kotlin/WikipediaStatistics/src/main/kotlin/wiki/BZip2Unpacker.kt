package wiki

import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream
import java.io.BufferedInputStream
import java.io.File

class BZip2Unpacker {
    fun unpack(input: File): BZip2CompressorInputStream {
        return BZip2CompressorInputStream(BufferedInputStream(input.inputStream()))
    }
}