package DesignPatterns.FactoryPatten.FactoryMethod.Burger;

public class PremiumWheatBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Premium Wheat burger with gourmet bun, premium patty, cheese, lettuce and secret sauce!");
    }
}
