package patterns.creational.factory

class XmlParser : Parser {
    override fun parseData(data: String) {
        println("parsing datas for $data ...")
    }
}