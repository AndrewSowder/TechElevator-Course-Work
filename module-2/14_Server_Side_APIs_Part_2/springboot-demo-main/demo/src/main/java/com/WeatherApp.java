package com;

import com.Weather.Services.ConsoleService;
import com.Weather.Services.GeoService;
import com.Weather.Services.WeatherService;
import com.Weather.model.Location;
import com.Weather.model.Weather;


public class WeatherApp {

    private final ConsoleService consoleService = new ConsoleService();
    private final WeatherService weatherService = new WeatherService();
    private final GeoService geoService = new GeoService();

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
                consoleService.printLocation(geoService.getLocations(cityName));
            } else if (menuSelection == 2) {
                String cityName = consoleService.promptForCityName();
                Location[] location = geoService.getLocations(cityName);
                String lat = location[0].getLatitude();
                String lon = location[0].getLongitude();
                Weather weather = weatherService.getWeather(lat, lon);
                consoleService.printWeather(weather);
                continue;
            } else {
                System.out.println("Invalid Selection");
            }
            consoleService.pause();
        }
    }
          /*  private void handleCityInfo() {
                String cityName = consoleService.promptForCityName();
                if (cityName != null) {
                    consoleService.printLocation(geoService.getLocations(cityName));
                } else {
                    consoleService.printErrorMessage();
                }
            }*/


}