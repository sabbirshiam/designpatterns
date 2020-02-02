package patterns.behavior.strategy


/**
 * In Strategy pattern, a class behavior or its algorithm can be changed at run time.
 * This type of design pattern comes under behavior pattern.
 * In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object.
 * The strategy object changes the executing algorithm of the context object.
 *
 * Steps
 * ------
 * 1. Create interface of Strategy
 * 2. Create concrete class implementing Strategies functions.
 * 3. Create another class with member reference of Strategy interface.
 * 4. call Context object to execute corresponding Strategic functions.
 */

class Context(strategy: Strategy) {
    private var mStrategy: Strategy = strategy

    fun executeStrategy(num1: Int, num2: Int): Int = mStrategy.doOperation(num1, num2)
}