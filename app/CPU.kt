class CPU {
    var pc = 0x8000
    var a = 0

    fun reset() {
        println("CPU resetada")
    }

    fun step() {
        println("Executando instrução em $pc")
        pc++
    }
}
