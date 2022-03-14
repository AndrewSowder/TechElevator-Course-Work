package com.Weather.Services;


import com.Weather.model.Location;
import com.Weather.model.Weather;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;


public class WeatherService {

    public static final String API_Temp_URL = "http://api.openweathermap.org/data/2.5/weather?lat=";
    public static final String API_KEY = "5609a5f720c0a785cdaa501535994815";
    private final RestTemplate restTemplate = new RestTemplate();


    public Weather getWeather(String lat, String lon) {
        try {
            final String url = API_Temp_URL + lat + "&lon=" + lon + "&appid=" + API_KEY ;
            Weather weather = restTemplate.getForObject(url, Weather.class);
            return weather;
        }catch (RestClientResponseException e){
            System.out.println(e.getMessage());
        }return null;
    }

}
