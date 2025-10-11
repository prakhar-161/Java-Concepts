package DesignPatterns.ObserverPattern.Example1.Subject;

import DesignPatterns.ObserverPattern.Example1.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

//"WeatherStation" is the concrete subject implementing the "Subject" interface.
//It maintains a list of observers ("observers") and provides methods to manage this list.
//"notifyObservers" iterates through the observers and calls their "update" method, passing the current weather
//"setWeather" method updates the weather and notifies observers of the change.

public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String weather = "";

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(weather);
        }
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }
}
