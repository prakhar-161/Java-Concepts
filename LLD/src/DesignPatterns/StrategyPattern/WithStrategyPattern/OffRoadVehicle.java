package DesignPatterns.StrategyPattern.WithStrategyPattern;

import DesignPatterns.StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}


// basically, when its created, it injects a SportsDriveStrategy into parent class constructor
// So an OffRoadVehicle automatically gets sports driving behavior.

// Basically this happens -
// DriveStrategy driveObj = new SportsDriveStrategy()  (constructor injection from child to parent)
// When vehicle.drive() is called, then driveObj.drive() is called inside the function