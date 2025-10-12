package DesignPatterns.FactoryPatten.SimpleFactory;

// The factory class centralizes object creation
// the client(Main) doesn't need to know which class to instantiate - it just calls the factory
public class Main {
    public static void main(String[] args) {
        Burger basicBurger = BurgerFactory.createBurger("basic");
        basicBurger.prepare();

        Burger standardBurger = BurgerFactory.createBurger("standard");
        standardBurger.prepare();

        Burger premiumBurger = BurgerFactory.createBurger("premium");
        premiumBurger.prepare();
    }
}
