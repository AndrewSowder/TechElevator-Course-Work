package com.Weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.jackson.JsonComponent;

public class Weather {

    private int id;

    @JsonProperty("name")
    private String cityName;
    //private String stateName;
    @JsonProperty("temp")
    private int currentTemp;
    @JsonProperty("temp_min")
    private int lowestTemp;
    @JsonProperty("temp_max")
    private int highestTemp;

    public Weather(int id, String cityName, int currentTemp, int lowestTemp, int highestTemp){
        this.id = id;
        this.cityName = cityName;
        //this.stateName = stateName;
        this.currentTemp = currentTemp;
        this.lowestTemp = lowestTemp;
        this.highestTemp = highestTemp;

    }

    public Weather() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public int getLowestTemp() {
        return lowestTemp;
    }

    public void setLowestTemp(int lowestTemp) {
        this.lowestTemp = lowestTemp;
    }

    public int getHighestTemp() {
        return highestTemp;
    }

    public void setHighestTemp(int highestTemp) {
        this.highestTemp = highestTemp;
    }

    @Override
    public String toString() {
        return "The current temperature in " + cityName + " is " + currentTemp +  '\'' +
                "The high of today will be " + highestTemp + '\'' +
                "With a low of " + lowestTemp;

    }
}
