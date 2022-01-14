package org.framework.FrameworkTests;

import org.framework.Injector;
import org.framework.connection_manager.ConnectionManager;
import org.framework.openWeatherDTO.OpenWeatherDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.ZoneOffset;

public class DTOTests {

    private static OpenWeatherDTO openWeatherDTO;

    @BeforeAll
    static void setup(){
        ConnectionManager.generateEndpointCityName("Vladivostok");
        openWeatherDTO = Injector.injectDTO(ConnectionManager.getURL());
    }

    @Test
    @DisplayName("Does getSunsetDateTime return the same time as getSunset?")
    void doesGetSunsetDateTimeReturnTheSameTimeAsGetSunset() {
        Assertions.assertEquals(openWeatherDTO.getSys().getSunset(), openWeatherDTO.getSys().getSunsetDateTime(openWeatherDTO).toEpochSecond(openWeatherDTO.getTimezoneZoneOffset()));
    }
    @Test
    @DisplayName("Does getSunriseDateTime return the same time as getSunrise?")
    void doesGetSunriseDateTimeReturnTheSameTimeAsGetSunrise() {
        Assertions.assertEquals(openWeatherDTO.getSys().getSunrise(), openWeatherDTO.getSys().getSunriseDateTime(openWeatherDTO).toEpochSecond(openWeatherDTO.getTimezoneZoneOffset()));
    }

    @Test
    @DisplayName("Does getCalculatedDateTime return the same time as getCalculatedTimeEpoch?")
    void doesGetCalculatedDateTimeReturnTheSameTimeAsGetCalculatedTimeEpoch() {
        Assertions.assertEquals(openWeatherDTO.getCalculatedTimeEpoch(), openWeatherDTO.getCalculatedDateTime().toEpochSecond(openWeatherDTO.getTimezoneZoneOffset()));
    }
}
