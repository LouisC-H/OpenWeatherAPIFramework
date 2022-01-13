package org.framework.Tests;

import org.framework.Injector;
import org.framework.connection_manager.ConnectionManager;
import org.framework.openWeatherDTO.OpenWeatherDTO;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrameworkTests {
    OpenWeatherDTO openWeatherDTO;

    @BeforeEach
    void setup() {
        openWeatherDTO = Injector.injectDTO(ConnectionManager.getConnection());

    }

    @Test
    @DisplayName("Status code is 200")
    void statusCodeIs200() {
        assertEquals(200, ConnectionManager.getStatusCode());
    }

    @Test
    @DisplayName("Check Weather")
    void checkWeather() {
        System.out.println(openWeatherDTO.getWeather().get(0).getDescription());
    }


}
