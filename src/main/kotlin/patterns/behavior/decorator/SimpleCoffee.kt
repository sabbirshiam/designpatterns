package patterns.behavior.decorator

/**
 *  Main object which extends interface Coffee. we will decorate it with add ons over it.
 */
class SimpleCoffee : Coffee {
    override fun getName(): String = "Black Coffee"
    override fun getCost(): Double = 100.00
    override fun getIngredients(): String = "Coffee Beans"
}