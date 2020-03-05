package patterns.creational.factory

class HtmlParser : Parser {
    override fun parseData(data: String) {
        println("parsing datas for $data ...")
    }
}