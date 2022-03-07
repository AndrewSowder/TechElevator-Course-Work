package com.Weather;



import java.util.Scanner;

public class ConsoleService {

    private final Scanner scanner = new Scanner(System.in);

    public int promptForMenuSelection() {
        int menuSelection;
        System.out.print("Please choose an option: ");
        try {
            menuSelection = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            menuSelection = -1;
        }
        return menuSelection;
    }

    public void printMainMenu() {
        System.out.println();
        System.out.println("----Online Weather Service----");
        System.out.println("1: Display weather info by U.S City");
        System.out.println("0: Exit");
        System.out.println();
    }



    public String promptForCityName() {
        String cityName;
        System.out.println("--------------------------------------------");
        System.out.print("Enter city to search for: ");
        cityName =  scanner.nextLine();
        return cityName;
    }

    public String promptForStateName() {
        String stateName;
        System.out.println("--------------------------------------------");
        System.out.print("Enter the state to search for: ");
        stateName = scanner.nextLine();
        return stateName;

    }



    public void printWeather(Weather weather) {
        System.out.println("--------------------------------------------");
        System.out.println("Weather Details");
        System.out.println("--------------------------------------------");
        if (weather == null) {
            System.out.println("No info to print");
        } else {
            System.out.println("Id: " + weather.getId());
            System.out.println("City Name: " + weather.getCityName());
            System.out.println("Current Temperature: " + weather.getCurrentTemp());
            System.out.println("Highest Temperature: " + weather.getHighestTemp());
            System.out.println("Lowest Temperature: " + weather.getLowestTemp());

        }
    }


    public void pause() {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }

    public void printErrorMessage() {
        System.out.println("An error occurred. Check the log for details.");
    }

}
