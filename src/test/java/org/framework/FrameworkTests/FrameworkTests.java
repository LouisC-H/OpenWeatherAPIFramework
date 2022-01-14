package org.framework.FrameworkTests;

import org.framework.Injector;
import org.framework.JsonTests.DTOValueChecker;
import org.framework.connection_manager.ConnectionManager;
import org.framework.openWeatherDTO.OpenWeatherDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FrameworkTests {
    private static OpenWeatherDTO openWeatherDTO;

    @BeforeAll
    static void prepare(){
        ConnectionManager.setEndpointAsCityName("London");
        openWeatherDTO = Injector.injectDTO(ConnectionManager.getURL());
    }

    @Test
    @DisplayName("stuff")
    void stuff() {
        Assertions.assertTrue(DTOValueChecker.checkTimezoneValue(openWeatherDTO));
    }
}
