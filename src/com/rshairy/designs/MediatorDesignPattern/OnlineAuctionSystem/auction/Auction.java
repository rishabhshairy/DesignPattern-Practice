package com.rshairy.designs.MediatorDesignPattern.OnlineAuctionSystem.auction;

import com.rshairy.designs.MediatorDesignPattern.OnlineAuctionSystem.bidder.Bidder;
import com.rshairy.designs.MediatorDesignPattern.OnlineAuctionSystem.bidder.Colleague;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {

    List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void sendMessage(String message) {

    }

    @Override
    public void addBidder(Bidder bidder) {
        colleagues.add(bidder);
    }

    /**
     * For every non bidder they will get notification
     * @param bidder
     * @param amount
     */
    @Override
    public void placeBid(Colleague bidder, double amount) {
        for (Colleague colleague : colleagues) {
            if (!colleague.getName().equals(bidder.getName())) {
                colleague.receiveBidNotification(amount);
            }
        }
    }

}
