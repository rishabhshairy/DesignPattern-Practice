package com.rshairy.designs.ObserverPattern.Observable;

import com.rshairy.designs.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscriber();

    void setStockCount(int newStock);

    int getStockCount();
}
