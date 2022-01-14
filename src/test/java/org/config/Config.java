package org.config;

import org.logging.OpenWeatherLogger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;

public class Config {
    private static final Properties config;
    static {
        config = new Properties();

        try {
            config.load(new BufferedReader(new FileReader("src/test/java/org/resources/config.properties")));
            OpenWeatherLogger.writeLog(Level.CONFIG, "config file loaded");
        } catch (IOException e) {
            OpenWeatherLogger.writeLog(Level.WARNING, "config file not found");
            e.printStackTrace();
        }
    }

    public static String getBaseURL(){
        if(!config.getProperty("baseURL").isEmpty()){
            OpenWeatherLogger.writeLog(Level.CONFIG, "baseURL found in config file");
        } else{
            OpenWeatherLogger.writeLog(Level.WARNING, "baseURL not found in config file");
        }
        return config.getProperty("baseURL");
    }

    public static String getApiKey(){
        if(!config.getProperty("apiKey").isEmpty()){
            OpenWeatherLogger.writeLog(Level.CONFIG, "apiKey found in config file");
        } else{
            OpenWeatherLogger.writeLog(Level.WARNING, "apiKey not found in config file");
        }
        return config.getProperty("apiKey");
    }
}
