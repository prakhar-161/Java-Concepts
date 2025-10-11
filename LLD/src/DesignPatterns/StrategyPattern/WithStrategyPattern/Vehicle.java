package DesignPatterns.StrategyPattern.WithStrategyPattern;

import DesignPatterns.StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;

// Context class
public class Vehicle {
    DriveStrategy driveObject;

    // constructor injection
    Vehicle(DriveStrategy driveObj) {
        this.driveObject = driveObj;
    }

    public void drive() {
        driveObject.drive();
    }
}


// here, Vehicle has 'has-a' relationship with drive interface.
// composition is used here