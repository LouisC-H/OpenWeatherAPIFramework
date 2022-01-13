package org.framework.Tests;

import org.framework.openWeatherDTO.OpenWeatherDTO;
import org.junit.jupiter.api.BeforeEach;

public class FrameworkTests {
    OpenWeatherDTO openWeatherDTO;

    @BeforeEach
    void setup() {
        openWeatherDTO = injectDTO(getConnection());

    }


}
