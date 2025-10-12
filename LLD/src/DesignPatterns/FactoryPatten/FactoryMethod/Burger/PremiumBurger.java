package DesignPatterns.FactoryPatten.FactoryMethod.Burger;

public class PremiumBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Premium burger with gourmet bun, premium patty, cheese, lettuce and secret sauce!");
    }
}
