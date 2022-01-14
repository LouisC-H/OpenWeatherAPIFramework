package org.framework.FrameworkTests;

import org.framework.Injector;
import org.framework.connection_manager.ConnectionManager;
import org.framework.openWeatherDTO.OpenWeatherDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.ZoneOffset;

public class DTOTests {
    @Test
    @DisplayName("Does getSunsetDateTime return the same time as getSunset?")
    void doesGetSunsetDateTimeReturnTheSameTimeAsGetSunset() {
        ConnectionManager.generateEndpointCityName("Vladivostok");
        OpenWeatherDTO openWeatherDTO = Injector.injectDTO(ConnectionManager.getURL());
        Assertions.assertEquals(openWeatherDTO.getSys().getSunset(), openWeatherDTO.getSys().getSunsetDateTime(openWeatherDTO).toEpochSecond(ZoneOffset.ofTotalSeconds(openWeatherDTO.getTimezone())));
    }
    @Test
    @DisplayName("Does getSunriseDateTime return the same time as getSunrise?")
    void doesGetSunriseDateTimeReturnTheSameTimeAsGetSunrise() {
        ConnectionManager.generateEndpointCityName("Vladivostok");
        OpenWeatherDTO openWeatherDTO = Injector.injectDTO(ConnectionManager.getURL());
        Assertions.assertEquals(openWeatherDTO.getSys().getSunrise(), openWeatherDTO.getSys().getSunriseDateTime(openWeatherDTO).toEpochSecond(ZoneOffset.ofTotalSeconds(openWeatherDTO.getTimezone())));
    }
}
