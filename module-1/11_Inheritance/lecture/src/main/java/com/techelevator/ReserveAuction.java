package com.techelevator;

import java.util.List;

public class ReserveAuction extends Auction {

    private int reserveAmount;
    // Inherited from base class
//    private String itemForSale;
//    private Bid currentHighBid;
//    private List<Bid> allBids;

    public ReserveAuction(String itemForSale, int reserveAmount) {
        super(itemForSale);
        this.reserveAmount = reserveAmount;


    }

    public int getReserveAmount() {
        return reserveAmount;
    }

    @Override
    public boolean placeBid(Bid reserveAuctionBid) {
        if(reserveAuctionBid.getBidAmount() <  this.reserveAmount){
            //Bid doesn't exceed or equal reserve amount.
            return false;
    }
       return super.placeBid(reserveAuctionBid);
}




}

