package com.Weather;


import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.awt.*;


public class WeatherService {

    public static final String API_Temp_URL = "http://api.openweathermap.org/data/2.5/weatherq=";
    public static final String API_KEY = "5609a5f720c0a785cdaa501535994815";
    private RestTemplate restTemplate = new RestTemplate();
    private HttpHeaders headers = new HttpHeaders();
    public Weather weather = new Weather();


    public Weather getWeather(String cityName) {
        try {
            final String url = API_Temp_URL + cityName + "&appid=" + API_KEY ;
            weather = restTemplate.getForObject(url, Weather.class);
        }catch (RestClientResponseException e){
            System.out.println(e.getMessage());
        }
        return weather;
    }

}
