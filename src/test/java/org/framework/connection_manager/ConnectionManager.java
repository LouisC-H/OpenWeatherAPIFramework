package org.framework.connection_manager;

import org.config.Config;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionManager {
    private static final String BASEURL = Config.getBaseURL();
    private static final String APIKEY = Config.getApiKey();
    private static String endPoint;

    public static HttpResponse<String> getResponse(){
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