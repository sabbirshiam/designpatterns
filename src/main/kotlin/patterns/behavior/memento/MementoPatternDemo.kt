package patterns.behavior.memento

fun main(args: Array<String>) {
    val caretaker = Caretaker()
    val originator = Originator("initial state")

    caretaker.saveState(originator.createMemento())
    println("current state# ${originator.state}")

    originator.state = "v1.0.0"
    caretaker.saveState(originator.createMemento())
    println("current saved state# ${originator.state}")

    originator.state = "v2.0.0"
    caretaker.saveState(originator.createMemento())
    println("current saved state# ${originator.state}")

    originator.restore(caretaker.restoreTo(1))
    println("restored to # ${originator.state}")

    // changes made but not saved
    originator.state = "v3.0.0"
    originator.restore(caretaker.restoreTo(2))
    println("restored to # ${originator.state}")

    // Restore to default
    originator.restoreToDefault()
    caretaker.restoreDefault()
    println("restored to default# ${originator.state}")
}
