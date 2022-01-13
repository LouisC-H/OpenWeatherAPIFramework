package org.framework.connection_manager;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionManager {
    private static final String BASEURL = "api.openweathermap.org/data/2.5/weather?";
    private static final String APIKEY = ""; // grab from config file
    private static String endPoint;
    private static String URL;

        private static HttpResponse<String> getResponse(){
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(BASEURL + endPoint)).build();
        HttpResponse<String> httpResponse = null;
        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return httpResponse;
    }

    public ConnectionManager(CallLocationByEnum callMethod, String val1, String val2){
        switch (callMethod) {
            case CITYNAME:
                generateEndpointCityName(val1,val2);
                break;
            case GEOCOORD:
                generateEndpointGeoCoord(val1,val2);
                break;
            case ZIPCODE:
                generateEndpointZIPCode(val1,val2);
                break;
            default:
                System.err.println("CONNECTION MANAGER: INVALID CALL BY METHOD!");
        }
    }

    public ConnectionManager(CallLocationByEnum callMethod, String val1){
        switch (callMethod) {
            case CITYNAME:
                generateEndpointCityName(val1);
                break;
            case CITYID:
                generateEndpointCityID(val1);
                break;
            default:
                System.err.println("CONNECTION MANAGER: INVALID CALL BY METHOD!");
        }
    }

    public static int getStatusCode() {
        return getResponse().statusCode();
    }

    public static String getURL() {
        return BASEURL + endPoint;
    }

    public static String getBaseURL() {
        return BASEURL;
    }

    public static void resetEndpoint(){
        endPoint = "";
    }

    public static void generateEndpointCityName(String cityName) {
        endPoint = "q=" + cityName + "&appid=" + APIKEY;
    }

    public static void generateEndpointCityName(String cityName, String countyOrStateCode) {
        endPoint = "q=" + cityName + "," + countyOrStateCode + "&appid=" + APIKEY;
    }

    public static void generateEndpointCityName(String cityName, String stateCode, String countryCode) {
        endPoint = "q=" + cityName + "," + stateCode + "," + countryCode + "&appid=" + APIKEY;
    }

    public static void generateEndpointCityID(String cityID) {
        endPoint = "id=" + cityID + "&appid=" + APIKEY;

    }

    public static void generateEndpointGeoCoord(String latitude, String longitude) {
        endPoint = "lat=" + latitude + "&lon=" + longitude + "&appid=" + APIKEY;
    }

    public static void generateEndpointZIPCode(String zipCode, String countryCode) {
        endPoint = "zip=" + zipCode + "," + countryCode + "&appid=" + APIKEY;
    }

    public static void addModeParameter() {
        endPoint = endPoint + "&mode=" + "";
    }

}
