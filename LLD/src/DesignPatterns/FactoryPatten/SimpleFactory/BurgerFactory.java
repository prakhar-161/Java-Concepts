package DesignPatterns.FactoryPatten.SimpleFactory;

public class BurgerFactory {
    public static Burger createBurger(String type) {
        if(type == null) {
            throw new IllegalArgumentException("Burger type cannot be null");
        }

        switch (type.toLowerCase()) {
            case "basic":
                return new BasicBurger();
            case "standard":
                return new StandardBurger();
            case "premium":
                return new PremiumBurger();
            default:
                throw new IllegalArgumentException("Unknown burger type value: " + type);
        }
    }
}
