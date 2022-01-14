package org.framework.connection_manager;
import org.config.Config;
import org.logging.OpenWeatherLogger;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;

public class ConnectionManager {
    private static final String BASEURL = Config.getBaseURL();
    private static final String APIKEY = Config.getApiKey();
    private static String endPoint;

    public static HttpResponse<String> getResponse(){
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(BASEURL + endPoint)).build();
        OpenWeatherLogger.writeLog(Level.INFO, "URL created");
        HttpResponse<String> httpResponse = null;

        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            OpenWeatherLogger.writeLog(Level.INFO, "http response received");
        } catch (IOException | InterruptedException e) {
            OpenWeatherLogger.writeLog(Level.WARNING, "http response not received");
            e.printStackTrace();
        }
        return httpResponse;
    }

    public static int getStatusCode() {
        return getResponse().statusCode();
    }

    public static String getURL() {
        return BASEURL + endPoint;
    }

    public static void resetEndpoint(){
        endPoint = "";
        OpenWeatherLogger.writeLog(Level.INFO, "endpoint reseted");
    }

    public static void setEndpointAsCityName(String cityName) {
        endPoint = "q=" + cityName + "&appid=" + APIKEY;
        OpenWeatherLogger.writeLog(Level.INFO, "city name endpoint generated");
    }

    public static void setEndpointAsCityName(String cityName, String countyOrStateCode) {
        endPoint = "q=" + cityName + "," + countyOrStateCode + "&appid=" + APIKEY;
        OpenWeatherLogger.writeLog(Level.INFO, "city name endpoint generated");
    }

    public static void setEndpointAsCityName(String cityName, String stateCode, String countryCode) {
        endPoint = "q=" + cityName + "," + stateCode + "," + countryCode + "&appid=" + APIKEY;
        OpenWeatherLogger.writeLog(Level.INFO, "city name endpoint generated");
    }

    public static void setEndpointAsCityID(int cityID) {
        endPoint = "id=" + cityID + "&appid=" + APIKEY;
        OpenWeatherLogger.writeLog(Level.INFO, "city id endpoint generated");

    }

    public static void setEndpointAsGeoCoord(double latitude, double longitude) {
        endPoint = "lat=" + latitude + "&lon=" + longitude + "&appid=" + APIKEY;
        OpenWeatherLogger.writeLog(Level.INFO, "geographic coordinates endpoint generated");
    }

    public static void setEndpointAsZIPCode(int zipCode, String countryCode) {
        endPoint = "zip=" + zipCode + "," + countryCode + "&appid=" + APIKEY;
        OpenWeatherLogger.writeLog(Level.INFO, "zip code endpoint generated");
    }

    public static void addModeParameter(ModeEnum mode) {
        endPoint += "&mode=" + mode.getModeAsString();
        OpenWeatherLogger.writeLog(Level.INFO, "mode parameter added");
    }

    public static void addUnitsParameter(UnitsEnum unit) {
        endPoint += "&units=" + unit.getUnitCode();
        OpenWeatherLogger.writeLog(Level.INFO, "unit parameter added");
    }
    public static void addLangParameter(LanguageEnum lang) {
        endPoint += "&lang=" + lang.getLanguageCode();
        OpenWeatherLogger.writeLog(Level.INFO, "language parameter added");
    }

}