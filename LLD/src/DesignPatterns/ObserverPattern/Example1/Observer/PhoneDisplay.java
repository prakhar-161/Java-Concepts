package DesignPatterns.ObserverPattern.Example1.Observer;

public class PhoneDisplay implements Observer{
    private String weather;

    @Override
    public void display() {
        System.out.println("Phone Display: Weather updated - " + weather);
    }

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }
}
