package com.techelevator.view;

public class MenuApp  {
    public static final String RED = "red";
    public static final String BLUE = "blue";
    public static final String GREEN = "green";
    public static final String [] COLORS = new String []{"red", "blue", "green"} ;
    public static void main(String[] args) {
        Menu menu = new Menu(System.in,System.out);

        String [] colors = new String[] {"red", "blue", "green"};

        System.out.println("Please pick your favorite color");
        String favoriteColor = (String)menu.getChoiceFromOptions(COLORS);

        System.out.println("You picked " + favoriteColor);

        switch (favoriteColor) {
            case RED:
                System.out.println("Do the red thing...");
            case BLUE:
                System.out.println("Do the blue thing...");
            case GREEN:
                System.out.println("Do the green thing...");
        }
    }
}
