package com.Weather.Services;


import com.Weather.model.Location;
import com.Weather.model.Weather;

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
        System.out.println("1: Display location info by city name");
        System.out.println("2: Get current weather info by city name");
        System.out.println("0: Exit");
        System.out.println();
    }


    public String promptForCityName() {
        String cityName;
        System.out.println("--------------------------------------------");
        System.out.print("Enter city to search for: ");
        cityName = scanner.nextLine();
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
            System.out.println(weather.toString());

        }

    }

    public void printLocation(Location[] locations) {
        System.out.println("--------------------------------------------");
        System.out.println("Location");
        System.out.println("--------------------------------------------");
        if (locations == null) {
            System.out.println("No info to print");
        } else {
            for (Location location : locations) {
                System.out.println(location.toString());
            }
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
