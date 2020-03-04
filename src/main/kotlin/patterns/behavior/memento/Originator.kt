package patterns.behavior.memento

class Originator(var state: String) {
    private var initialState: String = state

    fun createMemento(): IMemento {
        return Memento(state)
    }

    fun restore(memento: IMemento) {
        state = memento.getState()
    }

    fun restoreToDefault() {
        state = initialState
    }
}