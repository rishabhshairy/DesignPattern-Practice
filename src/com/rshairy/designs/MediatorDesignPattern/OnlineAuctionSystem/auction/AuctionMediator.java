package com.rshairy.designs.MediatorDesignPattern.OnlineAuctionSystem.auction;

import com.rshairy.designs.MediatorDesignPattern.OnlineAuctionSystem.bidder.Bidder;
import com.rshairy.designs.MediatorDesignPattern.OnlineAuctionSystem.bidder.Colleague;

public interface AuctionMediator {
    public void sendMessage(String message);

    void addBidder(Bidder bidder);

    void placeBid(Colleague bidder,double amount);

}
