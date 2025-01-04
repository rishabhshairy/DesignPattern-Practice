package com.rshairy.designs.MediatorDesignPattern.OnlineAuctionSystem.bidder;

/**
 * This will serve as purpose for bidder interface
 */
public interface Colleague {
    void placeBid(double amount);
    void receiveBidNotification(double amount);
    String getName();
}
