package patterns.behavior.memento

fun main(args: Array<String>) {
    val caretaker = FileWriterCaretaker()
    val fileWriter = FileWriterUtil("data.txt")
    fileWriter.write("First Set of Data\n")
    println(fileWriter)

    // lets save the file
    caretaker.save(fileWriter)
    //now write something else
    fileWriter.write("Second Set of Data\n")

    //checking file contents
    println(fileWriter)

    //lets undo to last save
    caretaker.undo(fileWriter)

    //checking file content again
    println(fileWriter)
}
