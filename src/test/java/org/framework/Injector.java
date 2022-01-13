package org.framework;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.framework.openWeatherDTO.OpenWeatherDTO;

import java.io.IOException;
import java.net.URL;

public class Injector {

    public static OpenWeatherDTO injectDTO(String URL) {
        OpenWeatherDTO activityDTO = new OpenWeatherDTO();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            activityDTO =  objectMapper.readValue(new URL(URL), OpenWeatherDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return activityDTO;
    }

}
