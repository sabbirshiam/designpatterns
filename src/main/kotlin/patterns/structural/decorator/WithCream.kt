package patterns.structural.decorator

class WithCream constructor(coffee: Coffee) : CoffeeDecorator(coffee) {

    override fun getName(): String = "Cream Coffee"
    override fun getCost(): Double = super.getCost().plus(10.00)

    override fun getIngredients(): String = super.getIngredients().plus(" Cream ")
}