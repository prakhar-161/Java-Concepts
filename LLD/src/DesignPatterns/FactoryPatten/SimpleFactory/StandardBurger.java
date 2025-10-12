package DesignPatterns.FactoryPatten.SimpleFactory;

public class StandardBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Standard burger with bun, patty, cheese and lettuce!");
    }
}
