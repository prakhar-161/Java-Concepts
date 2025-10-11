package DesignPatterns.ObserverPattern.Example1.Observer;

//The "Observer" interface defines a contract for objects that want to be notified about changes in the subject ("WeatherStation" in this case).
//It includes a method "update" that concrete observers must implement to receive and handle updates.
public interface Observer {
    public void update(String weather);
    public void display();
}
