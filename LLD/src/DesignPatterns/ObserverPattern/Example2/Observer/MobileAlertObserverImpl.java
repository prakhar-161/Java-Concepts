package DesignPatterns.ObserverPattern.Example2.Observer;

import DesignPatterns.ObserverPattern.Example2.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String emailId, StockObservable observable) {
        this.userName = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "Product is now in stock. Hurry up to get yours!");
    }

    public void sendMsgOnMobile(String userName, String msg) {
        System.out.println("Msg sent to: " + userName);
    }
}
