package patterns.behavior.strategy

class OperationMultiply : Strategy{
    override fun doOperation(num1: Int, num2: Int) = num1.times(num2)
}