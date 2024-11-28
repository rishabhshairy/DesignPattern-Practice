package com.rshairy.designs.ObserverPattern.Observable;

import com.rshairy.designs.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneStockObservable implements StockObservable {

    List<NotificationAlertObserver> notificationAlertObservers = new ArrayList<>();
    int currentStock = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        notificationAlertObservers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObservers.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        System.out.println("notify");
        for (NotificationAlertObserver observer :
                notificationAlertObservers) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStock) {
        if (currentStock == 0) {
            notifySubscriber();
        }
        currentStock += newStock;
    }

    @Override
    public int getStockCount() {
        return currentStock;
    }
}
