package org.config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static final Properties config;
    static {
        config = new Properties();

        try {
            config.load(new BufferedReader(new FileReader("src/test/java/org/resources/config.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getBaseURL(){
        return config.getProperty("baseURL");
    }

    public static String getApiKey(){
        return config.getProperty("apiKey");
    }
}
