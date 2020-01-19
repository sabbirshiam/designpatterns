import patterns.creational.factory.FactoryPattern
import patterns.creational.factory.FactoryPattern.Companion.PARSER
import patterns.creational.singleton.SingletonPattern
import kotlin.concurrent.thread

fun main(args: Array<String>) {

    // Singleton
    thread(start = true) {
        println("${Thread.currentThread().name} has run.")
        SingletonPattern.getInstance().instanceName = "changing variable name"
        println(SingletonPattern.getInstance().instanceName)

        // in kotlin way
//        SingletonPattern.instanceName = "testing"
//        println(SingletonPattern.instanceName)
    }
    thread(start = true) {
        println("${Thread.currentThread().name} has run.")
        println(SingletonPattern.getInstance().instanceName)

        // in kotlin way
//        println(SingletonPattern.instanceName)
    }

    // Factory
    val dataParserJson = FactoryPattern().getParser(PARSER.JSON)
    dataParserJson.parseData("Json")

    val dataParserXml = FactoryPattern().getParser(PARSER.XML)
    dataParserXml.parseData("Xml")
}
