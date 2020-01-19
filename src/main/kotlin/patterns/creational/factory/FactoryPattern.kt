package patterns.creational.factory

import java.lang.IllegalArgumentException

/*
* The factory method is a creational design pattern, i
* .e., related to object creation.
* In the Factory pattern, we create an object without exposing the creation logic to the client
* and the client uses the same common interface to create a new type of object.
* Factory pattern introduces loose coupling between classes which is the most important
* principle one should consider and apply while designing the application architecture.
* usability: 1. common parser provider-> eg. xml parser, json parser etc.
* Step
* -----
* 1. interface or abstruct class creation.
* 2. Create concrete classes implementing same interfaces.
* 3. Create Factory class to generate object of concrete classes.
* 4. Use Factory class to get concrete object by passing object type.
 */

class FactoryPattern {

    companion object {
        enum class PARSER {
            JSON,
            XML;
        }
    }

    fun getParser(parserType: PARSER): Parser {
        return when (parserType) {
            Companion.PARSER.JSON -> JsonParser()
            Companion.PARSER.XML -> XmlParser()
        }
    }
}