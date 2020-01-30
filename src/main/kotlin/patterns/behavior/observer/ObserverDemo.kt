package patterns.behavior.observer

import kotlin.properties.Delegates

interface ValueChangedListener {
    fun onValueChanged(newValue: String)
}

class PrintChangedValue : ValueChangedListener {
    override fun onValueChanged(newValue: String) {
        println("Text is changed to $newValue")
    }
}

class ObservableObject(listener: ValueChangedListener) {
    var text: String by Delegates.observable(
        initialValue = "",
        onChange = { _, _, new ->
            listener.onValueChanged(new)
        }
    )
}

fun main(args: Array<String>) {
    val observableObject = ObservableObject(PrintChangedValue())
    observableObject.text = "hello"
    observableObject.text = "changed value"
}