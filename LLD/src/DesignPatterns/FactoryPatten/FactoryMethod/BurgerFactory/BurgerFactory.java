package DesignPatterns.FactoryPatten.FactoryMethod.BurgerFactory;

import DesignPatterns.FactoryPatten.FactoryMethod.Burger.Burger;

public interface BurgerFactory {
    public Burger createBurger(String type);
}
