package DesignPatterns.ObserverPattern.Example2.Observer;

import DesignPatterns.ObserverPattern.Example2.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is now in stock. Hurry up to get yours!");
    }

    void sendMail(String emailId, String msg) {
        System.out.println("mail sent to: " + emailId);
    }
}
