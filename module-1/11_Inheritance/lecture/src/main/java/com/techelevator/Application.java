package com.techelevator;

public class Application {

    public static void main(String[] args) {

        //Bid dummyBid = new Bid("Andrew",50);
        //System.out.println(dummyBid.toString());

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

        System.out.println("The Winning bid was: " + generalAuction.getHighBid().toString());



    ReserveAuction reserveAuction = new ReserveAuction(" TE Paperweight", 50);

    reserveAuction.placeBid(new Bid("Mike", 55));
    reserveAuction.placeBid(new Bid( "Monica", 100));
        System.out.println("Winning reserve auction bid is " + reserveAuction.getHighBid());


}


}
