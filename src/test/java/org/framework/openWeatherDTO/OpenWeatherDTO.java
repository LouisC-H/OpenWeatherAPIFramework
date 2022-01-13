package org.framework.openWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OpenWeatherDTO {

    @JsonProperty("rain")
    private Rain rain;

    @JsonProperty("visibility")
    private int visibility;

    @JsonProperty("timezone")
    private int timezone;

    @JsonProperty("main")
    private Main main;

    @JsonProperty("clouds")
    private Clouds clouds;

    @JsonProperty("sys")
    private Sys sys;

    @JsonProperty("dt")
    private int dt;

    @JsonProperty("coord")
    private Coord coord;

    @JsonProperty("snow")
    private Snow snow;

    @JsonProperty("weather")
    private List<WeatherItem> weather;

    @JsonProperty("name")
    private String name;

    @JsonProperty("cod")
    private int cod;

    @JsonProperty("id")
    private int id;

    @JsonProperty("base")
    private String base;

    @JsonProperty("wind")
    private Wind wind;


    public Rain getRain(){
        return rain;
    }

    public int getVisibility(){
        return visibility;
    }

    public int getTimezone(){
        return timezone;
    }

    public Main getMain(){
        return main;
    }

    public Clouds getClouds(){
        return clouds;
    }

    public Sys getSys(){
        return sys;
    }

    public int getTimeDataCreated(){
        return dt;
    }

    public Coord getCoord(){
        return coord;
    }

    public Snow getSnow(){
        return snow;
    }

    public List<WeatherItem> getWeather(){
        return weather;
    }

    public String getName(){
        return name;
    }

    public int getCod(){
        return cod;
    }

    public int getCityId(){
        return id;
    }

    public String getBase(){
        return base;
    }

    public Wind getWind(){
        return wind;
    }
}