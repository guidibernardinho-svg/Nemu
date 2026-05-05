class Emulator {
    private val cpu = CPU()
    private val romLoader = RomLoader()

    fun start(path: String) {
        val rom = romLoader.load(path)
        println("ROM carregada: ${rom.size} bytes")

        cpu.reset()

        while (true) {
            cpu.step()
            Thread.sleep(16)
        }
    }
}class Emulator {
    private val cpu = CPU()
    private val romLoader = RomLoader()

    fun start(path: String) {
        val rom = romLoader.load(path)
        println("ROM carregada: ${rom.size} bytes")

        cpu.reset()

        while (true) {
            cpu.step()
            Thread.sleep(16)
        }
    }
}
