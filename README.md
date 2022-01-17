# Open Weather API Framework

### Project 4 of Sparta Global's java engineering course.

Open Weather API Framework is a framework for testers to use when testing the Open Weather API.

## Table of contents
* [How To Use](#How-The-Open-Weather-API-Framework-Works)
*  - [Requirements](#Config-Property-Requirements)
*  - [Connecting](#Connection-Manager)
*  - [Data Transferring](#DTOs)
*  - [Logging](#Logging)
* [Contributors](#Contributors)


## How The Open Weather API Framework Works

### Config Property Requirements

In order to use the framework, a config file must first be made with 2 properties: "baseURL" and "apiKey" <br>
These properties are retrievable programmatically via the Config class and are used in construction of the full url of the API.
#### Properties:
- baseURL=Https://api.openweathermap.org/data/2.5/weather?
- apiKey=[Your API Key]

### Connection Manager

The ConnectionManager class is used to set the endpoint of the url and get responses from the API.

#### Setting Endpoints

The ConnectionManager class allows the tester to set the endpoint of the url to any of the allowed endpoints via its setters.


    ConnectionManager.setEndpointAsCityName(String cityName);
    ConnectionManager.setEndpointAsCityName(String cityName, String countyOrStateCode);
    ConnectionManager.setEndpointAsCityName(String cityName, String stateCode, String countryCode);
    ConnectionManager.setEndpointAsCityID(int cityID);
    ConnectionManager.setEndpointAsGeoCoord(double latitude, double longitude);
    ConnectionManager.setEndpointAsZIPCode(int zipCode, String countryCode);

Testers are also able to add the mode,units, and lang parameters to the url. <br>

    ConnectionManager.addModeParameter(ModeEnum mode);
    ConnectionManager.addUnitsParameter(UnitsEnum unit);
    ConnectionManager.addLangParameter(LanguageEnum lang);
Note: Although testers are able to keep adding different parameters of the same type to the endpoint, only the first will actually be used. <br>
If a tester wishes to use a different value for a parameter they will have to reconstruct the url starting with one of the provided setEndpoint methods.

Resetting to base url is provided.

    ConnectionManager.resetEndpoint();

#### Checking Correct URL Construction

We ensure that the ConnectionManager does work and has been thoroughly tested, but if there are any doubts, functionality is still provided to get the status code and full url for the testers convenience.

    ConnectionManager.getStatusCode();
    ConnectionManager.getURL();

#### Getting a Response
Testers are able to get responses from the API (after endpoint construction) using the getResponse() method.
  
    ConnectionManager.getResponse();

### DTOs

Our DTOs are based on a POJO object structure. One main class (OpenWeatherDTO) calls a number of smaller DTO classes to store the data retured from the API in the form of objects. This includes **Clouds, Coords, Main, Rain, Snow, Sys, WeatherIteam and Wind". After being populated by the Injector method Data can be retrieved from any of these using getters.

### Logging

The method below must be called at the start of your file in in the @BeforeAll to initialise and activate OpenWeatherAPIFramework's logger. Note that the method's parameter determines the logging level that will be outputted to the command line (all logs will also be saved to the file resources/log_file.log)

         OpenWeatherLogger.createLogger(Level ConsolePrintoutLevel);

#### Getting Header Info
Testers are able to get each value from the header using the following methods
    
    Header.getFullHeader();
    Header.getServer();
    Header.getDate();
    Header.getContentType();
    Header.getContentLength();
    Header.getConnection();
    Header.getXCacheKey();
    Header.getAccessControlAllowOrigin();
    Header.getAccessControlAllowCredentials();
    Header.getAccessControlAllowCredentials();
    
## Contributors
Hanif Ali<br>
Louis Clement-Harris<br>
Pawel Djyak<br>
Tony Parsons
