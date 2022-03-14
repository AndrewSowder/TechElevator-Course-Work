package com.Weather.Services;

import com.Weather.model.Location;

import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;


public class GeoService {

    private static final String API_Temp_URL = "http://api.openweathermap.org/geo/1.0/direct?q=";
    private static final String API_KEY = "5609a5f720c0a785cdaa501535994815";
    private final RestTemplate restTemplate = new RestTemplate();



    public Location[] getLocations(String cityName) {
        Location[] locations = null;
        try {
            final String url = API_Temp_URL + cityName + "&appid=" + API_KEY;
            locations = restTemplate.getForObject(url, Location[].class);
        } catch (RestClientResponseException e) {
            System.out.println(e.getMessage());
        }
        return locations;


    }
}

