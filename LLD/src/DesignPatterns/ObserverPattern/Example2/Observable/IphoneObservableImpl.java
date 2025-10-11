package DesignPatterns.ObserverPattern.Example2.Observable;

import DesignPatterns.ObserverPattern.Example2.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{
    public List<NotificationAlertObserver> observers = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void addObserver(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver observer: observers) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0) {
            notifyObservers();
        }
        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }


}
