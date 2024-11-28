package com.rshairy.designs.ObserverPattern.Observer;

import com.rshairy.designs.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    // declare observable for constructor injection
    StockObservable observable;
    String emailId;

    public EmailAlertObserver(StockObservable observable, String _emailId) {
        this.observable = observable;
        this.emailId = _emailId;
    }

    @Override
    public void update() {
        sendMail(emailId, "product is back in stock!!! buy now");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("Mail sent to::" + emailId);
    }
}
