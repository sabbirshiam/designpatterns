package patterns.behavior.strategy

interface Strategy {
    fun doOperation(num1: Int, num2: Int): Int
}