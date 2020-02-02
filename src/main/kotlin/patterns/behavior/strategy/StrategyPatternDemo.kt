package patterns.behavior.strategy

fun main(args: Array<String>) {
    val contextAdd = Context(OperationAdd())
    val contextSub = Context(OperationSubtract())
    val contextMul = Context(OperationMultiply())

    println(contextAdd.executeStrategy(20, 20))
    println(contextSub.executeStrategy(20, 20))
    println(contextMul.executeStrategy(20, 20))
}