package org.framework.openWeatherDTO;

public class OpenWeatherDTOValueExistChecker {

    public boolean hasCod(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getCityId()).length() > 0;
    }

    public boolean hasCodValueCorrect(OpenWeatherDTO openWeatherDTO) {
        return openWeatherDTO.getCod() > 0;
    }

    public boolean hasCityName(OpenWeatherDTO openWeatherDTO) {
        return openWeatherDTO.getCityName() != null;
    }

    public boolean hasCityId(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getCityId()).length() > 0;
    }


    public boolean hasTimezone(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getTimezone()).length() > 0;
    }

    public boolean hasSunset(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getSys().getSunset()).length() > 0;
    }

    public boolean hasSunrise(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getSys().getSunrise()).length() > 0;
    }

    public boolean hasCountry(OpenWeatherDTO openWeatherDTO) {
        return openWeatherDTO.getSys().getCountry() != null;
    }

    public boolean hasTime(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getTime()).length() > 0;
    }

    public boolean hasClouds(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getClouds()).length() > 0;
    }

    public boolean hasWindSpeedValue(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getWind().getSpeed()).length()>0;
    }

    public boolean hasWindGustValue(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getWind().getGust()).length()>0;
    }

    public boolean hasWindDirectionValue(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getWind().getDeg()).length()>0;
    }

    public boolean hasVisibility(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getVisibility()).length()>0;
    }

    public boolean hasHumidity(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getMain().getHumidity()).length()>0;
    }

    public boolean hasPressure(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getMain().getPressure()).length()>0;
    }

    public boolean hasMaxTemp(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getMain().getTempMax()).length()>0;
    }

    public boolean hasMinTemp(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getMain().getTempMin()).length()>0;
    }

    public boolean hasFeelsLike(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getMain().getFeelsLike()).length()>0;
    }

    public boolean hasTemperature(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getMain().getTemp()).length()>0;
    }

    public boolean hasBase(OpenWeatherDTO openWeatherDTO){
        return openWeatherDTO.getBase()!=null;
    }

    public boolean hasWeatherIcon(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getWeather().get(0)).length()>0;
    }

    public boolean hasWeatherDescription(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getWeather().get(1)).length()>0;
    }

    public boolean hasWeatherMain(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getWeather().get(2)).length()>0;
    }

    public boolean hasWeatherId(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getWeather().get(3)).length()>0;
    }

    public boolean hasCoordinates(OpenWeatherDTO openWeatherDTO){
        return String.valueOf(openWeatherDTO.getCoord().getLat()).length()>0 && String.valueOf(openWeatherDTO.getCoord().getLon()).length()>0;
    }


    public boolean hasARain(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getRain().getJsonMember1h()).length() > 0 || String.valueOf(openWeatherDTO.getRain().getJsonMember3h()).length() > 0;
    }

    public boolean hasASnow(OpenWeatherDTO openWeatherDTO) {
        return String.valueOf(openWeatherDTO.getSnow().getJsonMember1h()).length() > 0 || String.valueOf(openWeatherDTO.getSnow().getJsonMember3h()).length() > 0;
    }
}
