package SOLIDPrinciples.L.Bad;

public class Bicycle implements Bike{
    public void turnOnEngine() {
        throw new AssertionError("there is no engine");
    }

    public void accelerate() {
        //
    }
}

// this breaks the L principle
// as object of Bicycle class will not be able to replace object of bike if there was any.
