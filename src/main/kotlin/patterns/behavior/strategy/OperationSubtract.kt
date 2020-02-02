package patterns.behavior.strategy

class OperationSubtract: Strategy {
    override fun doOperation(num1: Int, num2: Int) = num1.minus(num2)
}