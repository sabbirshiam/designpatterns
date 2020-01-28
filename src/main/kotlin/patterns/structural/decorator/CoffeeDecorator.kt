package patterns.structural.decorator

/**
 * The Decorator pattern allows a user to add new functionality to an existing object without altering its structure.
 * This type of design pattern comes under structural pattern as this pattern acts as a wrapper to the existing class.
 * That is there will be additional features added to the original object.
 * The component, which adds these additional features is called the Decorator.
 * An example would be creating different flavours of Coffee according to customer choices.
 * Problems solved
 * ----------------
 * Responsibilities should be added to (and removed from) an object dynamically at run-time.
 * A flexible alternative to subclassing for extending functionality should be provided.
 *
 * In kotlin we can use infix or extension to use like decorator pattern.
 * Steps
 * -----
 * 1. Create interface like Coffee
 * 2. Create Concrete Component SimpleCoffee implementing Coffee
 * 3. Create abstract decorator class implementing the Coffee interface.
 * 4. Create concrete decorator class extending the CoffeeDecorator class.
 * 5. Decorate SimpleCoffee with other concrete decorator class as much as you want. :)
 */
abstract class CoffeeDecorator constructor(coffee: Coffee) : Coffee {
    private var decoratedCoffee: Coffee = coffee

    override fun getName(): String = decoratedCoffee.getName()
    override fun getCost(): Double = decoratedCoffee.getCost()
    override fun getIngredients(): String = decoratedCoffee.getIngredients()
}