package com;

import com.Weather.ConsoleService;
import com.Weather.Weather;
import com.Weather.WeatherService;

public class WeatherApp {

    private final ConsoleService consoleService = new ConsoleService();
    private final WeatherService weatherService = new WeatherService();

    public static void main(String[] args) {
        WeatherApp app = new WeatherApp();
        app.run();
    }

    private void run() {
        int menuSelection = -1;

        while (menuSelection != 0) {
            consoleService.printMainMenu();
            menuSelection = consoleService.promptForMenuSelection();
            if (menuSelection == 1) {
            String cityName = consoleService.promptForCityName();
            Weather weather = weatherService.getWeather(cityName);
            consoleService.printWeather(weather);
                continue;
            } else {
                System.out.println("Invalid Selection");
            }
            consoleService.pause();
        }
    }

}

