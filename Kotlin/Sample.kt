fun main() {
    val basicPrinter = BasicPrinter()
    val printerDelegate = PrinterDelegate(basicPrinter)
    
    printerDelegate.printMessage("Hello, world!")
}
