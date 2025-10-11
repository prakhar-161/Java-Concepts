package SOLIDPrinciples.L.Bad;

public class MotoCycle implements Bike {
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}
