package DesignPatterns.ObserverPattern.Example1;

import DesignPatterns.ObserverPattern.Example1.Observer.Observer;
import DesignPatterns.ObserverPattern.Example1.Observer.PhoneDisplay;
import DesignPatterns.ObserverPattern.Example1.Observer.TVDisplay;
import DesignPatterns.ObserverPattern.Example1.Subject.WeatherStation;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        // simulating weather change
        weatherStation.setWeather("Rainy");
    }
}
