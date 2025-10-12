package DesignPatterns.FactoryPatten.FactoryMethod.BurgerFactory;

import DesignPatterns.FactoryPatten.FactoryMethod.Burger.BasicBurger;
import DesignPatterns.FactoryPatten.FactoryMethod.Burger.Burger;
import DesignPatterns.FactoryPatten.FactoryMethod.Burger.PremiumBurger;
import DesignPatterns.FactoryPatten.FactoryMethod.Burger.StandardBurger;

public class SinghBurgerFactory implements BurgerFactory{
    @Override
    public Burger createBurger(String type) {
        if(type == null) {
            throw new IllegalArgumentException("Burger type cannot be null");
        }

        if(type.equals("basic")) {
            return new BasicBurger();
        } else if(type.equals("standard")) {
            return new StandardBurger();
        } else if (type.equals("premium")) {
            return new PremiumBurger();
        } else {
            System.out.println("Invalid burger type");
            System.out.println("Singh Burger only serves basic, standard and premium burger without wheat buns");
            return null;
        }
    }
}
