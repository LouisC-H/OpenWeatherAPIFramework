package org.frameworkTests;

import org.config.Config;
import org.framework.connection_manager.ConnectionManager;
import org.framework.connection_manager.LanguageEnum;
import org.framework.connection_manager.ModeEnum;
import org.framework.connection_manager.UnitsEnum;
import org.junit.jupiter.api.*;

public class ConnectionManagerTests {

    //Do the setters work correctly and do they all return status codes
    @Test
    @DisplayName("Set City Name Test")
    void setCityNameTest(){
        ConnectionManager.setEndpointAsCityName("London");
        Assertions.assertEquals("Https://api.openweathermap.org/data/2.5/weather?q=London&appid=" + Config.getApiKey(), ConnectionManager.getURL());
        Assertions.assertEquals(200, ConnectionManager.getStatusCode());
        System.out.println(ConnectionManager.getURL());
    }

    @Test
    @DisplayName("Set Invalid City Name Test")
    void setInvalidCityNameTest(){
        ConnectionManager.setEndpointAsCityName("Disneyland");
        Assertions.assertEquals(200, ConnectionManager.getStatusCode());
        System.out.println(ConnectionManager.getURL());
    }

    @Test
    @DisplayName("Set City Name W/ State Code Test")
    void setCityAndCodeTest(){
        ConnectionManager.setEndpointAsCityName("London", "uk");
        Assertions.assertEquals(200, ConnectionManager.getStatusCode());
        System.out.println(ConnectionManager.getURL());
    }

    @Test
    @DisplayName("Set Invalid State Code Test")
    void setInvalidStateCodeTest(){
        ConnectionManager.setEndpointAsCityName("London", "es");
        Assertions.assertEquals(200, ConnectionManager.getStatusCode());
        System.out.println(ConnectionManager.getURL());
    }

    @Test
    @DisplayName("Set City Name W/ State and Country Code Test")
    void setCityStateAndCountryCodeTest(){
        ConnectionManager.setEndpointAsCityName("London", "uk","GB");
        Assertions.assertEquals(200, ConnectionManager.getStatusCode());
        System.out.println(ConnectionManager.getURL());
    }

    @Test
    @DisplayName("Set City Name W/ State and Invalid Country Code Test")
    void setCityStateAndInvalidCountryCodeTest(){
        ConnectionManager.setEndpointAsCityName("London", "uk","DR");
        Assertions.assertEquals(200, ConnectionManager.getStatusCode());
        System.out.println(ConnectionManager.getURL());
    }

    @Test
    @DisplayName("Set City ID Test")
    void setCityIdTest(){
        ConnectionManager.setEndpointAsCityID(2172797);
        Assertions.assertEquals(200, ConnectionManager.getStatusCode());
        System.out.println(ConnectionManager.getURL());
    }

    @Test
    @DisplayName("Set Invalid City ID Test")
    void setInvalidCityIdTest(){
        ConnectionManager.setEndpointAsCityID(4206969);
        Assertions.assertEquals(200, ConnectionManager.getStatusCode());
        System.out.println(ConnectionManager.getURL());
    }

    @Test
    @DisplayName("Set GeoCoord Test")
    void setGeoCoordTest(){
        double lon = 139;
        double lat = 35;
        ConnectionManager.setEndpointAsGeoCoord(lat,lon);
        Assertions.assertEquals(200, ConnectionManager.getStatusCode());
        System.out.println(ConnectionManager.getURL());
    }

    @Test
    @DisplayName("Set Invalid GeoCoord Test")
    void setInvalidGeoCoordTest(){
        double lon = 9001;
        double lat = 182;
        ConnectionManager.setEndpointAsGeoCoord(lat,lon);
        Assertions.assertEquals(200, ConnectionManager.getStatusCode());
        System.out.println(ConnectionManager.getURL());
    }

    @Test
    @DisplayName("Set Zip Code Test")
    void setZipCodeTest(){
        ConnectionManager.setEndpointAsZIPCode(94040,"us");
        Assertions.assertEquals(200, ConnectionManager.getStatusCode());
        System.out.println(ConnectionManager.getURL());
    }

    @Test
    @DisplayName("Set Invalid Zip Code Test")
    void setInvalidZipCodeTest(){
        ConnectionManager.setEndpointAsZIPCode(64209,"us");
        Assertions.assertEquals(200, ConnectionManager.getStatusCode());
        System.out.println(ConnectionManager.getURL());
    }

    //You can add a completely made up parameter key and/or value and it will just ignore and use default

    @Test
    @DisplayName("Add Mode Parameter Test")
    void addModeParameterTest(){
        for(ModeEnum mode : ModeEnum.values())
        {
            ConnectionManager.setEndpointAsCityName("London");
            ConnectionManager.addModeParameter(mode);
            Assertions.assertEquals(200, ConnectionManager.getStatusCode());
            System.out.println(ConnectionManager.getURL());
        }
    }

    @Test
    @DisplayName("Add Units Parameter Test")
    void addUnitsParameterTest() {
        for (UnitsEnum unit : UnitsEnum.values())
        {
            ConnectionManager.setEndpointAsCityName("London");
            ConnectionManager.addUnitsParameter(unit);
            Assertions.assertEquals(200, ConnectionManager.getStatusCode());
            System.out.println(ConnectionManager.getURL());
        }
    }

    @Test
    @DisplayName("Add Lang Parameter Test")
    void addLangParameterTest() {

        for (LanguageEnum lang : LanguageEnum.values())
        {
            ConnectionManager.setEndpointAsCityName("London");
            ConnectionManager.addLangParameter(lang);
            Assertions.assertEquals(200, ConnectionManager.getStatusCode());
            System.out.println(ConnectionManager.getURL());
        }
        System.out.println(ConnectionManager.getURL());
    }
}
