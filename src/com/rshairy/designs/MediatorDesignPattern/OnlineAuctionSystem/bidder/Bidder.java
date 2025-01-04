package com.rshairy.designs.MediatorDesignPattern.OnlineAuctionSystem.bidder;

import com.rshairy.designs.MediatorDesignPattern.OnlineAuctionSystem.auction.AuctionMediator;

public class Bidder implements Colleague {

    String name;
    AuctionMediator mediator;

    public Bidder(String name, AuctionMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addBidder(this); // here this refers to current instance of bidder, and it will add it to bidders list
    }

    /**
     * Bidder will place bid through mediator
     * passing its own instance and amount
     * @param amount
     */
    @Override
    public void placeBid(double amount) {
        mediator.placeBid(this, amount);
    }

    @Override
    public void receiveBidNotification(double amount) {
        System.out.println("Bidder " + this.name + " got the notification that someone has put bid of : " + amount);
    }

    @Override
    public String getName() {
        return this.name;
    }

}
