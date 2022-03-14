package com.Weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.jackson.JsonComponent;

public class Weather {

    @JsonProperty("name")
    private String name;
    @JsonProperty("temp")
    private String temp;
    @JsonProperty("temp_min")
    private String temp_min;
    @JsonProperty("temp_max")
    private String temp_max;


    @Override
    public String toString() {
        return "\n--------------------------------------------" +
                "\n Today in " + getCityName() +
                "\n It currently feels like " + temp +
                "\n Today's high will be " + temp_max +
                "\n With a low of " + temp_min;


    }



    public String getCityName() {
        return name;
    }

    public void setCityName(String name) {
        this.name = name;
    }

    public String getCurrentTemp() {
        return temp;
    }

    public void setCurrentTemp(String temp) {
        this.temp = temp;
    }

    public String getLowestTemp() {
        return temp_min;
    }

    public void setLowestTemp(String temp_min) {
        this.temp_min = temp_min;
    }

    public String getHighestTemp() {
        return temp_max;
    }

    public void setHighestTemp(String temp_max) {
        this.temp_max = temp_max;
    }

}
