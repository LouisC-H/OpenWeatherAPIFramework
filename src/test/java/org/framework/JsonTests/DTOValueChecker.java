package org.framework.JsonTests;

import org.framework.openWeatherDTO.OpenWeatherDTO;
import org.framework.openWeatherDTO.WeatherItem;

import java.util.Locale;

public class DTOValueChecker {

    public static boolean checkLongitudeValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasCoordinates(openWeatherDTO)) {
            double longitude = openWeatherDTO.getCoord().getLon();

            return longitude > -180 && longitude < 180 ;
        } else {
            return false;
        }
    }

    public static boolean checkLatitudeValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasCoordinates(openWeatherDTO)) {
            double latitude = openWeatherDTO.getCoord().getLat();

            return latitude >= -90 && latitude < 90 ;
        } else {
            return false;
        }
    }

    public static boolean checkWeatherIDValue(WeatherItem weatherItem){
        if(DTOValueExistChecker.hasWeatherId(weatherItem)) {
            int ID= weatherItem.getId();

            return ID >= 200 && ID <= 804 ;
        } else {
            return false;
        }
    }

//    weather.main - as there are different languages, I don't think we should check anything here

//    weather.description - as there are different languages, I don't think we should check anything here

    public static boolean checkWeatherIconValue(WeatherItem weatherItem){
        if(DTOValueExistChecker.hasWeatherIcon(weatherItem)) {
            String icon= weatherItem.getIcon();
            //consider making an enum and comparing icon to those values?
            return icon.length() == 3 ;
        } else {
            return false;
        }
    }

//    base - string with unknown possible values

    public static boolean checkTemperatureValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasTemperature(openWeatherDTO)) {
            double temperature = openWeatherDTO.getMain().getTemp();

            return temperature > -100 && temperature < 350;
        } else {
            return false;
        }
    }

    public static boolean checkFeelsLikeValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasFeelsLike(openWeatherDTO)) {
            double feelsLikeTemp= openWeatherDTO.getMain().getFeelsLike();

            return feelsLikeTemp > -100 && feelsLikeTemp < 350 ;
        } else {
            return false;
        }
    }

    public static boolean checkPressureValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasPressure(openWeatherDTO)) {
            int pressure = openWeatherDTO.getMain().getPressure();

            return pressure > 870 &&  pressure < 1100;
        } else {
            return false;
        }
    }

    public static boolean checkHumidityValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasHumidity(openWeatherDTO)) {
            int humidity= openWeatherDTO.getMain().getHumidity();

            return humidity >= 0 && humidity <= 100 ;
        } else {
            return false;
        }
    }

    public static boolean checkMinTemperatureValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasMinTemp(openWeatherDTO)) {
            double tempMin = openWeatherDTO.getMain().getTempMin();

            return tempMin > -100 && tempMin < 350;
        } else {
            return false;
        }
    }

    public static boolean checkMaxTemperatureValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasMaxTemp(openWeatherDTO)) {
            double tempMax  = openWeatherDTO.getMain().getTempMax();

            return tempMax > -100 && tempMax < 350;
        } else {
            return false;
        }
    }

    public static boolean checkSeaLevelPressureValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasSeaLevelPressure(openWeatherDTO)) {
            double seaLevel= openWeatherDTO.getMain().getSeaLevelPressure();

            return seaLevel >= 870 && seaLevel <= 1100;
        } else {
            return false;
        }
    }

    public static boolean checkGroundLevelPressureValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasGroundLevelPressure(openWeatherDTO)) {
            double grndLevel= openWeatherDTO.getMain().getGrndLevelPressure();

            return grndLevel >= 870 && grndLevel <= 1100;
        } else {
            return false;
        }
    }

    public static boolean checkVisibilityValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasVisibility(openWeatherDTO)) {
            double visibility = openWeatherDTO.getVisibility();
            return visibility >= 0;
        } else {
            return false;
        }
    }

    public static boolean checkWindSpeedValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasWindSpeed(openWeatherDTO)) {
            double windSpeed = openWeatherDTO.getWind().getSpeed();
            //highest recorded wind speed is 103 m/s or 231 miles/hour
            return windSpeed >= 0 && windSpeed <= 300;
        } else {
            return false;
        }
    }

    public static boolean checkWindDirectionValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasWindDirection(openWeatherDTO)) {
            double windDeg = openWeatherDTO.getWind().getDeg();

            return windDeg >= 0 && windDeg <= 360;
        } else {
            return false;
        }
    }

    public static boolean checkGustValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasWindGust(openWeatherDTO)) {
            double gust = openWeatherDTO.getWind().getGust();
            //highest recorded wind speed is 103 m/s or 231 miles/hour
            return gust >= 0 && gust < 300;
        } else {
            return false;
        }

    }

    public static boolean checkCloudsValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasClouds(openWeatherDTO)) {
            int cloudiness = openWeatherDTO.getClouds().getAll();

            return cloudiness >= 0 && cloudiness <= 100;
        } else {
            return false;
        }
    }

    public static boolean checkRain1HValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasRain(openWeatherDTO)) {
            double rain1H= openWeatherDTO.getRain().getRain1h();
            return rain1H >= 0;
        } else {
            return false;
        }

    }

    public static boolean checkRain3HValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasRain(openWeatherDTO)) {
            double rain3H= openWeatherDTO.getRain().getRain3h();

            return rain3H >= 0;
        } else {
            return false;
        }
    }

    public static boolean checkSnow1HValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasSnow(openWeatherDTO)) {
            double snow1H= openWeatherDTO.getSnow().getSnow1H();

            return snow1H >= 0;
        } else {
            return false;
        }
    }

    public static boolean checkSnow3HValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasSnow(openWeatherDTO)) {
            double snow3H= openWeatherDTO.getSnow().getSnow3H();

            return snow3H >= 0;
        } else {
            return false;
        }
    }

    public static boolean checkTimeValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasTime(openWeatherDTO)) {
            int timeDataCreated= openWeatherDTO.getTime();
            int timeNow = Math.toIntExact(System.currentTimeMillis() / 1000);
            int time24HAgo = timeNow - 86400;

            return timeDataCreated >= time24HAgo && timeDataCreated <= timeNow;
        } else {
            return false;
        }
    }

//    sys.type

//    sys.id

//    sys.message

    public static boolean checkCountryCodeValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasCountryCode(openWeatherDTO)) {
            boolean testsResult = true;
            String countryCode = openWeatherDTO.getSys().getCountryCode();
            if (countryCode.length() != 2) {
                // 2 character code
                testsResult = false;
            } else if (countryCode.toUpperCase(Locale.ROOT).equals(countryCode)){
                // all uppercase
                testsResult = false;
            }
            return testsResult;
        } else {
            return false;
        }

    }

    public static boolean checkSunriseDateTimeValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasSunrise(openWeatherDTO)) {
            Integer sunriseTime = openWeatherDTO.getSys().getSunrise();
            Integer timeCalculated = openWeatherDTO.getTime();
            //within 24H
            return Math.abs(sunriseTime - timeCalculated) <= 86400;
        } else {
            return false;
        }
    }

    public static boolean checkSunsetDateTimeValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasSunset(openWeatherDTO)) {
            Integer sunsetTime = openWeatherDTO.getSys().getSunset();
            Integer timeCalculated = openWeatherDTO.getTime();
            //within 24H
            return Math.abs(sunsetTime - timeCalculated) <= 86400;
        } else {
            return false;
        }

    }

    public static boolean checkTimezoneValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasTimezone(openWeatherDTO)) {
            int timezone = openWeatherDTO.getTimezone();
            //within 14H (the largest time zone)
            return Math.abs(timezone) <= 50400;
        } else {
            return false;
        }
    }

    public static boolean checkCityIDValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasCityId(openWeatherDTO)) {
            int cityID = openWeatherDTO.getCityId();
            //must be positive
            return cityID >= 0;
        } else {
            return false;
        }
    }

    //city name

    public static boolean checkCodValue(OpenWeatherDTO openWeatherDTO){
        if(DTOValueExistChecker.hasCod(openWeatherDTO)) {
            int cod = openWeatherDTO.getCod();
            //must be a 3-digit code
            return Integer.toString(cod).length() == 3;
        } else {
            return false;
        }
    }

    // error message
}
