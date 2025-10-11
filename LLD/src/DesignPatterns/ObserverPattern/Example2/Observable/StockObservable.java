package DesignPatterns.ObserverPattern.Example2.Observable;

import DesignPatterns.ObserverPattern.Example2.Observer.NotificationAlertObserver;

// subject
public interface StockObservable {
    public void addObserver(NotificationAlertObserver observer);

    public void removeObserver(NotificationAlertObserver observer);

    public void notifyObservers();  // calls update function of NotificationAlertObserver

    public void setStockCount(int newStockAdded);

    public int getStockCount();
}
