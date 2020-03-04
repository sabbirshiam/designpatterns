package patterns.behavior.memento

class Caretaker {
    private val mementoList = ArrayList<IMemento>()

    fun saveState(state: IMemento) {
        mementoList.add(state)
    }

    fun restoreTo(version: Int): IMemento {
        return  mementoList[version]
    }

    fun restoreDefault() { mementoList.clear() }
}