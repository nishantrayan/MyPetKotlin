package KotlinSamples.ClassDelegation

interface IPrinter {
    fun print()
}

interface IScanner {
    fun scan()
}

class Printer : IPrinter {
    override fun print() {
        println("Printing a document...")
    }

}

class Scanner : IScanner {
    override fun scan() {
        println("Scanning a document")
    }

}

class MultiFunctionDevice(printer: Printer = Printer(), scanner: Scanner = Scanner()) : IPrinter by printer,
    IScanner by scanner {

}

fun main() {
    val multiDevice = MultiFunctionDevice()
    multiDevice.print()
    multiDevice.scan()
}