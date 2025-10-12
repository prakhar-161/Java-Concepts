package DesignPatterns.FactoryPatten.FactoryMethod;

import DesignPatterns.FactoryPatten.FactoryMethod.Burger.Burger;
import DesignPatterns.FactoryPatten.FactoryMethod.BurgerFactory.BurgerFactory;
import DesignPatterns.FactoryPatten.FactoryMethod.BurgerFactory.KingBurgerFactory;
import DesignPatterns.FactoryPatten.FactoryMethod.BurgerFactory.SinghBurgerFactory;

public class Main {
    public static void main(String[] args) {
        // Use SinghBurgerFactory
        BurgerFactory singhFactory = new SinghBurgerFactory();
        Burger singhBasic = singhFactory.createBurger("basic");
        if (singhBasic != null) singhBasic.prepare();

        Burger singhPremium = singhFactory.createBurger("premium"); // Not served
        if (singhPremium != null) singhPremium.prepare();

        System.out.println();

        // Use KingBurgerFactory
        BurgerFactory kingFactory = new KingBurgerFactory();
        Burger kingPremium = kingFactory.createBurger("premium");
        if (kingPremium != null) kingPremium.prepare();

        Burger kingStandard = kingFactory.createBurger("standard");
        if (kingStandard != null) kingStandard.prepare();
    }
}
