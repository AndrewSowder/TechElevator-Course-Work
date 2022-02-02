package com.techelevator.farm.card;

public class CardApp {


    public static void main(String[] args) {
        CardSuit someSuit = CardSuit.DIAMONDS;

        Card someCard = new Card(someSuit);

        if ( someCard.getSuit()== CardSuit.DIAMONDS){
            System.out.println("It's a Diamond!");
        }

        switch (someCard.getSuit()){
            case CLUBS:
                System.out.println("clubs");
                break;
            case DIAMONDS:
                System.out.println("diamonds");
                break;
            case HEARTS:
                System.out.println("hearts");
            case SPADES:
                System.out.println("spades");
                break;
        }
    }
}


