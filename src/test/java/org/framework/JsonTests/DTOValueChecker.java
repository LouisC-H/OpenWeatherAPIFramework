package org.framework.JsonTests;

import org.framework.openWeatherDTO.OpenWeatherDTO;
import org.framework.openWeatherDTO.WeatherItem;

import java.util.List;
import java.util.Locale;

public class DTOValueChecker {

    public static boolean checkLongitudeValue(OpenWeatherDTO openWeatherDTO){
        double longitude = openWeatherDTO.getCoord().getLon();

        return longitude > -180 && longitude < 180 ;
    }

    public static boolean checkCoordLatitudeValue(OpenWeatherDTO openWeatherDTO){
        double latitude = openWeatherDTO.getCoord().getLat();

        return latitude >= -90 && latitude < 90 ;
    }

    public static boolean checkWeatherIDValue(WeatherItem weatherItem){
        int ID= weatherItem.getId();

        return ID >= 200 && ID <= 804 ;
    }

//    weather.main - as there are different languages, I don't think we should check anything here

//    weather.description - as there are different languages, I don't think we should check anything here

    public static boolean checkWeatherIconValue(WeatherItem weatherItem){
        String icon= weatherItem.getIcon();
        //consider making an enum and comparing icon to those values?
        return icon.length() == 3 ;
    }

    public static boolean checkMainTemperatureValue(OpenWeatherDTO openWeatherDTO){
        double temperature = openWeatherDTO.getMain().getTemp();

        return temperature > -100 && temperature < 350;
    }

    public static boolean checkMainFeelsLikeValue(OpenWeatherDTO openWeatherDTO){
        double feelsLikeTemp= openWeatherDTO.getMain().getFeelsLike();

        return feelsLikeTemp > -100 && feelsLikeTemp < 350 ;
    }

    public static boolean checkMainPressureValue(OpenWeatherDTO openWeatherDTO){
        int pressure = openWeatherDTO.getMain().getPressure();

        return pressure > 870 &&  pressure < 1100;
    }

    public static boolean checkMainHumidityValue(OpenWeatherDTO openWeatherDTO){
        int humidity= openWeatherDTO.getMain().getHumidity();

        return humidity >= 0 && humidity <= 100 ;
    }

    public static boolean checkMainMinTemperatureValue(OpenWeatherDTO openWeatherDTO){
        double tempMin = openWeatherDTO.getMain().getTempMin();

        return tempMin > -100 && tempMin < 350;
    }

    public static boolean checkMainMaxTemperatureValue(OpenWeatherDTO openWeatherDTO){
        double tempMax  = openWeatherDTO.getMain().getTempMax();

        return tempMax > -100 && tempMax < 350;
    }

    public static boolean checkMainSeaLevelPressureValue(OpenWeatherDTO openWeatherDTO){
        double seaLevel= openWeatherDTO.getMain().getSeaLevelPressure();

        return seaLevel >= 870 && seaLevel <= 1100;
    }

    public static boolean checkMainGroundLevelPressureValue(OpenWeatherDTO openWeatherDTO){
        double grndLevel= openWeatherDTO.getMain().getGrndLevelPressure();

        return grndLevel >= 870 && grndLevel <= 1100;
    }

    public static boolean checkWindSpeedValue(OpenWeatherDTO openWeatherDTO){
        double windSpeed = openWeatherDTO.getWind().getSpeed();
        //highest recorded wind speed is 103 m/s or 231 miles/hour
        return windSpeed >= 0 && windSpeed <= 300;
    }

    public static boolean checkWindDegreeValue(OpenWeatherDTO openWeatherDTO){
        double windDeg = openWeatherDTO.getWind().getDeg();

        return windDeg >= 0 && windDeg <= 360;
    }

    public static boolean checkWindGustValue(OpenWeatherDTO openWeatherDTO){
        double gust = openWeatherDTO.getWind().getGust();
        //highest recorded wind speed is 103 m/s or 231 miles/hour
        return gust >= 0 && gust < 300;
    }

    public static boolean checkCloudsValue(OpenWeatherDTO openWeatherDTO){
        int cloudiness = openWeatherDTO.getClouds().getAll();

        return cloudiness >= 0 && cloudiness <= 100;
    }

    public static boolean checkRain1HValue(OpenWeatherDTO openWeatherDTO){
        double rain1H= openWeatherDTO.getRain().getRain1h();

        return rain1H >= 0;
    }

    public static boolean checkRain3HValue(OpenWeatherDTO openWeatherDTO){
        double rain3H= openWeatherDTO.getRain().getRain3h();

        return rain3H >= 0;
    }

    public static boolean checkSnow1HValue(OpenWeatherDTO openWeatherDTO){
        double snow1H= openWeatherDTO.getSnow().getSnow1H();

        return snow1H >= 0;
    }

    public static boolean checkSnow3HValue(OpenWeatherDTO openWeatherDTO){
        double snow3H= openWeatherDTO.getSnow().getSnow3H();

        return snow3H >= 0;
    }

    public static boolean checkTimeDataCreatedValue(OpenWeatherDTO openWeatherDTO){
        int timeDataCreated= openWeatherDTO.getTimeDataCreated();
        int timeNow = Math.toIntExact(System.currentTimeMillis() / 1000);
        int time24HAgo = timeNow - 86400;

        return timeDataCreated >= time24HAgo && timeDataCreated <= timeNow;
    }

//    sys.type

//    sys.id

//    sys.message

    public static boolean checkSysCountryCodeValue(OpenWeatherDTO openWeatherDTO){
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
    }

    public static boolean checkSysSunriseDateTimeValue(OpenWeatherDTO openWeatherDTO){
        Integer sunriseTime = openWeatherDTO.getSys().getSunrise();
        Integer timeCalculated = openWeatherDTO.getTimeDataCreated();
        //within 24H
        return Math.abs(sunriseTime - timeCalculated) <= 86400;
    }

    public static boolean checkSysSunsetDateTimeValue(OpenWeatherDTO openWeatherDTO){
        Integer sunsetTime = openWeatherDTO.getSys().getSunset();
        Integer timeCalculated = openWeatherDTO.getTimeDataCreated();
        //within 24H
        return Math.abs(sunsetTime - timeCalculated) <= 86400;
    }

    public static boolean checkSysTimezoneValue(OpenWeatherDTO openWeatherDTO){
        int timezone = openWeatherDTO.getTimezone();
        //within 14H (the largest time zone)
        return Math.abs(timezone) <= 50400;
    }

    public static boolean checkCityIDValue(OpenWeatherDTO openWeatherDTO){
        int cityID = openWeatherDTO.getCityId();
        //must be positive
        return cityID >= 0;
    }

    //city name

    public static boolean checkCodValue(OpenWeatherDTO openWeatherDTO){
        int cod = openWeatherDTO.getCod();
        //must be a 3-digit code
        return Integer.toString(cod).length() == 3;
    }

    // error message
}
