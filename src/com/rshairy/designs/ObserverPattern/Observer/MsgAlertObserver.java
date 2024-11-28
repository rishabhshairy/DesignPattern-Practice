package com.rshairy.designs.ObserverPattern.Observer;

import com.rshairy.designs.ObserverPattern.Observable.StockObservable;

public class MsgAlertObserver implements NotificationAlertObserver {

    StockObservable observable;
    String userName;

    public MsgAlertObserver(StockObservable observable, String userName) {
        this.observable = observable;
        this.userName = userName;
    }

    @Override
    public void update() {
        sendMsg(userName, "product is back in stock!!! buy now");
    }

    private void sendMsg(String userName, String msg) {
        // find user from DB and send msg
        System.out.println("Msg sent to user::" + userName);
    }
}
