package patterns.behavior.strategy

class OperationAdd : Strategy {
    override fun doOperation(num1: Int, num2: Int) = num1.plus(num2)
}