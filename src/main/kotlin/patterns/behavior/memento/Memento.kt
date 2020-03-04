package patterns.behavior.memento

data class Memento(val content: String): IMemento {
    override fun getState(): String {
        return content
    }
}