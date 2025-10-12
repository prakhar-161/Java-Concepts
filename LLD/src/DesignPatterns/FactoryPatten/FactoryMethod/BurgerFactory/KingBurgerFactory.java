package DesignPatterns.FactoryPatten.FactoryMethod.BurgerFactory;

import DesignPatterns.FactoryPatten.FactoryMethod.Burger.*;

public class KingBurgerFactory implements BurgerFactory{
    @Override
    public Burger createBurger(String type) {
        if(type == null) {
            throw new IllegalArgumentException("Burger type cannot be null");
        }

        if(type.equals("basic")) {
            return new BasicWheatBurger();
        } else if(type.equals("standard")) {
            return new StandardWheatBurger();
        } else if (type.equals("premium")) {
            return new PremiumWheatBurger();
        } else {
            System.out.println("Invalid burger type");
            System.out.println("Singh Burger only serves basic, standard and premium burger with wheat buns");
            return null;
        }
    }
}
