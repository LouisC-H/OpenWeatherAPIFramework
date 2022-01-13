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

    ///////////Getters

    public Rain getRain() {
        return rain;
    }

    public int getVisibility() {
        return visibility;
    }

    public int getTimezone() {
        return timezone;
    }

    public Main getMain() {
        return main;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Sys getSys() {
        return sys;
    }

    public int getTime() {
        return dt;
    }

    public Coord getCoord() {
        return coord;
    }

    public Snow getSnow() {
        return snow;
    }

    public List<WeatherItem> getWeather() {
        return weather;
    }

    public String getCityName() {
        return name;
    }

    public int getCod() {
        return cod;
    }

    public int getCityId() {
        return id;
    }

    public String getBase() {
        return base;
    }

    public Wind getWind() {
        return wind;
    }



    public boolean hasCod() {
        return String.valueOf(id).length() > 0;
    }


    public boolean hasCityName() {
        return name != null;
    }

    public boolean hasCityId() {
        return String.valueOf(id).length() > 0;
    }


    public boolean hasTimezone() {
        return String.valueOf(timezone).length() > 0;
    }


    public boolean hasSunset() {
        return String.valueOf(sys.getSunset()).length() > 0;
    }


    public boolean hasSunrise() {
        return String.valueOf(sys.getSunrise()).length() > 0;
    }


    public boolean hasCountry() {
        return sys.getCountry() != null;
    }


    public boolean hasTime() {
        return String.valueOf(dt).length() > 0;
    }


    public boolean hasClouds() {
        return String.valueOf(clouds).length() > 0;
    }


    public boolean hasWindSpeedValue(){
        return String.valueOf(wind.getSpeed()).length()>0;
    }

    public boolean hasWindGustValue(){
        return String.valueOf(wind.getGust()).length()>0;
    }

    public boolean hasWindDirectionValue(){
        return String.valueOf(wind.getDeg()).length()>0;
    }

    public boolean hasVisibility(){
        return String.valueOf(visibility).length()>0;
    }

    public boolean hasHumidity(){
        return String.valueOf(main.getHumidity()).length()>0;
    }

    public boolean hasPressure(){
        return String.valueOf(main.getPressure()).length()>0;
    }

    public boolean hasMaxTemp(){
        return String.valueOf(main.getTempMax()).length()>0;
    }

    public boolean hasMinTemp(){
        return String.valueOf(main.getTempMin()).length()>0;
    }

    public boolean hasFeelsLike(){
        return String.valueOf(main.getFeelsLike()).length()>0;
    }

    public boolean hasTemperature(){
        return String.valueOf(main.getTemp()).length()>0;
    }

    public boolean hasBase(){
        return base!=null;
    }

    public boolean hasWeatherIcon(){
        return String.valueOf(weather.get(0).getIcon()).length()>0;
    }

    public boolean hasWeatherDescription(){
        return String.valueOf(weather.get(0).getDescription()).length()>0;
    }

    public boolean hasWeatherMain(){
        return String.valueOf(weather.get(0).getMain()).length()>0;
    }

    public boolean hasWeatherId(){
        return String.valueOf(weather.get(0).getId()).length()>0;
    }

    public boolean hasCoordinates(){
        return String.valueOf(coord.getLat()).length()>0 && String.valueOf(coord.getLon()).length()>0;
    }


    public boolean hasARain() {
        return String.valueOf(rain.getJsonMember1h()).length() > 0 || String.valueOf(rain.getJsonMember3h()).length() > 0;
    }

    public boolean hasASnow() {
        return String.valueOf(snow.getJsonMember1h()).length() > 0 || String.valueOf(snow.getJsonMember3h()).length() > 0;
    }

}