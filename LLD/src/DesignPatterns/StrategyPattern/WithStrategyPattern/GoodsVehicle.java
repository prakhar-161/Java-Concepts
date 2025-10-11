package DesignPatterns.StrategyPattern.WithStrategyPattern;

import DesignPatterns.StrategyPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
