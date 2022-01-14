package org.framework.JsonTests;

import org.framework.openWeatherDTO.OpenWeatherDTO;
import org.framework.openWeatherDTO.WeatherItem;

public class DTOValueExistChecker {

    public static boolean hasCod(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getCityId()).length() > 0;
    }

    public static boolean hasCityName(OpenWeatherDTO openWeatherDTO) {
        return openWeatherDTO.getName() != null;
    }

    public static boolean hasCityId(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getCityId()).length() > 0;
    }


    public static boolean hasTimezone(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getTimezone()).length() > 0;
    }

    public static boolean hasSunset(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getSys().getSunset()).length() > 0;
    }

    public static boolean hasSunrise(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getSys().getSunrise()).length() > 0;
    }

    public static boolean hasCountryCode(OpenWeatherDTO openWeatherDTO) {
        return openWeatherDTO.getSys().getCountryCode() != null;
    }

    public static boolean hasTime(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getTime()).length() > 0;
    }

    public static boolean hasClouds(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getClouds()).length() > 0;
    }

    public static boolean hasWindSpeed(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getWind().getSpeed()).length()>0;
    }

    public static boolean hasWindGust(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getWind().getGust()).length()>0;
    }

    public static boolean hasWindDirection(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getWind().getDeg()).length()>0;
    }

    public static boolean hasVisibility(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getVisibility()).length()>0;
    }

    public static boolean hasHumidity(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getMain().getHumidity()).length()>0;
    }

    public static boolean hasPressure(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getMain().getPressure()).length()>0;
    }

    public static boolean hasMaxTemp(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getMain().getTempMax()).length()>0;
    }

    public static boolean hasMinTemp(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getMain().getTempMin()).length()>0;
    }

    public static boolean hasFeelsLike(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getMain().getFeelsLike()).length()>0;
    }

    public static boolean hasGroundLevelPressure(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getMain().getGrndLevelPressure()).length()>0;
    }

    public static boolean hasSeaLevelPressure(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getMain().getSeaLevelPressure()).length()>0;
    }

    public static boolean hasTemperature(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getMain().getTemp()).length()>0;
    }

    public static boolean hasBase(OpenWeatherDTO openWeatherDTO){
        return openWeatherDTO.getBase()!=null;
    }

    public static boolean hasWeatherIcon(WeatherItem weatherItem){
        return String.valueOf(weatherItem.getIcon()).length()>0;
    }

    public static boolean hasWeatherDescription(WeatherItem weatherItem){
        return String.valueOf(weatherItem.getDescription()).length()>0;
    }

    public static boolean hasWeatherMain(WeatherItem weatherItem){
        return String.valueOf(weatherItem.getMain()).length()>0;
    }

    public static boolean hasWeatherId(WeatherItem weatherItem){
        return String.valueOf(weatherItem.getId()).length()>0;
    }

    public static boolean hasCoordinates(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getCoord().getLat()).length()>0 && String.valueOf(openWeatherDTO.getCoord().getLon()).length()>0;
    }

    public static boolean hasRain(OpenWeatherDTO openWeatherDTO) {
        return openWeatherDTO.getRain()!=null;
    }


    public static boolean hasSnow(OpenWeatherDTO openWeatherDTO) {
        return openWeatherDTO.getSnow()!=null;
    }

}
