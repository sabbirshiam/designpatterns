package patterns.behavior.memento

class Caretaker {
    private val mementoList = ArrayList<IMemento>()

    fun saveState(state: IMemento) {
        mementoList.add(state)
    }

    fun restoreTo(index: Int): IMemento {
        return  mementoList[index]
    }

    fun restoreDefault() { mementoList.clear() }
}