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

### Logging

## Contributors
Hanif Ali<br>
Louis Clement-Harris<br>
Pawel Djyak<br>
Tony Parsons
