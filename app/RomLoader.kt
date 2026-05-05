import java.io.File

class RomLoader {
    fun load(path: String): ByteArray {
        return File(path).readBytes()
    }
}
