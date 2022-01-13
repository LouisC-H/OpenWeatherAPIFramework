package org.framework.Tests;
import org.framework.Injector;
import org.framework.connection_manager.ConnectionManager;
import org.framework.openWeatherDTO.OpenWeatherDTO;
import org.junit.jupiter.api.BeforeAll;

public class FrameworkTests {
    private static OpenWeatherDTO openWeatherDTO;

    @BeforeAll
    static void prepare(){
        ConnectionManager.generateEndpointCityName("London");
        openWeatherDTO = Injector.injectDTO(ConnectionManager.getURL());
    }


}
