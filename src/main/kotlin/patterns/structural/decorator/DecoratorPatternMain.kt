package patterns.structural.decorator

fun main(args: Array<String>) {
    fun printInfo(coffee: Coffee) =
        println("Order name:  Cost: ${coffee.getCost()}, Ingredients: ${coffee.getIngredients()}")

    val milkCoffee = WithMilk(SimpleCoffee())
    printInfo(milkCoffee)

    val creamMilkCoffee = WithCream(WithMilk(SimpleCoffee()))
    printInfo(creamMilkCoffee)
}