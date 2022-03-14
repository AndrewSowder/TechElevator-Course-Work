package com.Weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {



    @JsonProperty("name")
    private String name;
    @JsonProperty("state")
    private String state;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("lon")
    private String lon;


    @Override
    public String toString() {
        return "\n--------------------------------------------" +
                "\n Location Details" +
                "\n--------------------------------------------" +
                "\n Name: " + name +
                "\n State: " + state +
                "\n Latitude: " + lat +
                "\n Longitude: " + lon;
    }


    public String getCityName() {
        return name;
    }

    public void setCityName(String name) {
        this.name = name;
    }

    public String getStateName() {
        return state;
    }

    public void setStateName(String state) {
        this.state = state;
    }

    public String getLatitude() {
        return lat;
    }

    public void setLatitude(String lat) {
        this.lat = lat;
    }

    public String getLongitude() {
        return lon;
    }

    public void setLongitude(String lon) {
        this.lon = lon;
    }
}
