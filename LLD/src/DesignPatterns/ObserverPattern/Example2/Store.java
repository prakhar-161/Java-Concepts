package DesignPatterns.ObserverPattern.Example2;

import DesignPatterns.ObserverPattern.Example2.Observable.IphoneObservableImpl;
import DesignPatterns.ObserverPattern.Example2.Observable.StockObservable;
import DesignPatterns.ObserverPattern.Example2.Observer.EmailAlertObserverImpl;
import DesignPatterns.ObserverPattern.Example2.Observer.MobileAlertObserverImpl;
import DesignPatterns.ObserverPattern.Example2.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("abc_user", iphoneStockObservable);

        iphoneStockObservable.addObserver(observer1);
        iphoneStockObservable.addObserver(observer2);
        iphoneStockObservable.addObserver(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(100);
    }
}
