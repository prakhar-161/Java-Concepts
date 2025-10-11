package DesignPatterns.StrategyPattern.WithStrategyPattern.Strategy;

// concrete strategy
public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
