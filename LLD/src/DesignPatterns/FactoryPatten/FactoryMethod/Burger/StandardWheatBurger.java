package DesignPatterns.FactoryPatten.FactoryMethod.Burger;

public class StandardWheatBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Standard Wheat burger with bun, patty, cheese and lettuce!");
    }
}
