package patterns.behavior.memento

class FileWriterCaretaker {
    private var anyObject: Any? = null

    fun save(fileWriter: FileWriterUtil) {
        this.anyObject = fileWriter.save()
    }

    fun undo(fileWriter: FileWriterUtil) {
        anyObject?.let { fileWriter.undoToLastSave(it) }
    }
}