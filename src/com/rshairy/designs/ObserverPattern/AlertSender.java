package com.rshairy.designs.ObserverPattern;

import com.rshairy.designs.ObserverPattern.Observable.IPhoneStockObservable;
import com.rshairy.designs.ObserverPattern.Observer.EmailAlertObserver;
import com.rshairy.designs.ObserverPattern.Observer.MsgAlertObserver;
import com.rshairy.designs.ObserverPattern.Observer.NotificationAlertObserver;

public class AlertSender {
    public static void main(String[] args) {

        IPhoneStockObservable iPhoneStockObservable = new IPhoneStockObservable();
        NotificationAlertObserver emailObs1 = new EmailAlertObserver(iPhoneStockObservable,"test@mail.com");
        NotificationAlertObserver emailObs2 = new EmailAlertObserver(iPhoneStockObservable,"test222@mail.com");
        NotificationAlertObserver msgObs1 = new MsgAlertObserver(iPhoneStockObservable,"shairy");

        // add observers
        iPhoneStockObservable.add(emailObs1);
        iPhoneStockObservable.add(emailObs2);
        iPhoneStockObservable.add(msgObs1);

        iPhoneStockObservable.setStockCount(10);
        // reduce stock count
        iPhoneStockObservable.setStockCount(-10);

        // re-new stock
        iPhoneStockObservable.setStockCount(100);
    }
}
