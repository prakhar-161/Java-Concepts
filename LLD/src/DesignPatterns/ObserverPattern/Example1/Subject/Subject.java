package DesignPatterns.ObserverPattern.Example1.Subject;

import DesignPatterns.ObserverPattern.Example1.Observer.Observer;

// The "Subject" interface outlines the operations a subject (like "WeatherStation") should support
// "addObserver" and "removeObserver" are for managing the list of observers.
// "notifyObservers" is for informing observers about changes.
public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
