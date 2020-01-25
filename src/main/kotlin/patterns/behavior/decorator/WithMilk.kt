package patterns.behavior.decorator

class WithMilk constructor(coffee: Coffee) : CoffeeDecorator(coffee) {

    override fun getName(): String = "Cream Coffee"
    override fun getCost(): Double = super.getCost().plus(5.00)
    override fun getIngredients(): String = super.getIngredients().plus(" milk ")
}