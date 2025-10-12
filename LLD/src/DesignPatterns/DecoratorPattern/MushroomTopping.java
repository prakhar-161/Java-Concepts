package DesignPatterns.DecoratorPattern;

public class MushroomTopping extends ToppingDecorator {
    BasePizza basePizza;

    public MushroomTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
