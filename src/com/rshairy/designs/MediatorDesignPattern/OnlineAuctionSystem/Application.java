package com.rshairy.designs.MediatorDesignPattern.OnlineAuctionSystem;

import com.rshairy.designs.MediatorDesignPattern.OnlineAuctionSystem.auction.Auction;
import com.rshairy.designs.MediatorDesignPattern.OnlineAuctionSystem.auction.AuctionMediator;
import com.rshairy.designs.MediatorDesignPattern.OnlineAuctionSystem.bidder.Bidder;
import com.rshairy.designs.MediatorDesignPattern.OnlineAuctionSystem.bidder.Colleague;

public class Application {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();
        Colleague bidder1 = new Bidder("rishabh", auctionMediator);
        Colleague bidder2 = new Bidder("sourav", auctionMediator);

        bidder1.placeBid(10000);
        bidder2.placeBid(100002);

    }
}
