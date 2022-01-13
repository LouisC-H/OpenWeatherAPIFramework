package org.framework.Tests;

import org.framework.connection_manager.ConnectionManager;
import org.framework.openWeatherDTO.OpenWeatherDTO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FrameworkTests {
    OpenWeatherDTO openWeatherDTO;

    @BeforeAll
    static void prepare(){

    }

    @Test
    @DisplayName("connection")
    void connection() {
        ConnectionManager.generateEndpointCityName("alshdfklasjdhfls");
//        ConnectionManager.getURL();
        System.out.println(ConnectionManager.getResponse().statusCode());
    }

}
