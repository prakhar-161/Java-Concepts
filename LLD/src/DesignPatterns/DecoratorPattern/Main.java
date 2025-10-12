package DesignPatterns.DecoratorPattern;

// suppose we want Margherita + Extra cheese pizza
public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheeseTopping(new Margherita());
        System.out.println(pizza.cost());
    }
}
