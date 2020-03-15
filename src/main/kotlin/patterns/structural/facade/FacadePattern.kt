package patterns.structural.facade

class CPU {
    fun freeze() = println("Freezing.")
    fun jump(position: Long) = println("Jump to $position.")
    fun execute() = println("Executing.")
}

class HardDrive {
    fun read(lba: Long, size: Int): ByteArray = byteArrayOf()
}

class Memory {
    fun load(position: Long, data: ByteArray) = println("Loading from memory position: $position")
}

/* Facade */
/**
 * Facade pattern hides the complexities of the system and provides an interface to the client
 * using which the client can access the system.
 * this pattern adds an interface to the existing system to hide its complexities.
 * Here , Computer object act as Facade which assemble CPU, Memory and HardDrive initialization.
 * Client can access complex objects throw Computer object.
 */

class Computer(val processor: CPU = CPU(), val ram: Memory = Memory(), val hd: HardDrive = HardDrive()) {
    companion object {
        val BOOT_ADDRESS = 0L
        val BOOT_SECTOR = 0L
        val SECTOR_SIZE = 0
    }

    fun start() {
        processor.freeze()
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE))
        processor.jump(BOOT_ADDRESS)
        processor.execute()
    }
}

fun main(args: Array<String>) {
    val computer = Computer()
    computer.start()
}