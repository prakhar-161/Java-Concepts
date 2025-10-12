package DesignPatterns.DecoratorPattern;

public class ExtraCheeseTopping extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraCheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
