package patterns.behavior.memento

class FileWriterUtil(val file: String) {

    private var fileName: String
    private var content: StringBuilder

    init {
        fileName = file
        content = java.lang.StringBuilder()
    }

    override fun toString(): String {
        return this.content.toString()
    }

    fun write(str: String) {
        content.append(str)
    }

    fun save(): Memento {
        return Memento(this.fileName, this.content)
    }

    fun undoToLastSave(obj: Any) {
        val memento = obj as Memento
        this.fileName = memento.fileName
        this.content = memento.content
    }
}