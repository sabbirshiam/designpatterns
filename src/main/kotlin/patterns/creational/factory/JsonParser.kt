package patterns.creational.factory

/**
 * Concrete Class for Json from Parser interface.
 */
class JsonParser: Parser {
    override fun parseData(data: String) {
        println("parsing datas for $data ...")
    }
}