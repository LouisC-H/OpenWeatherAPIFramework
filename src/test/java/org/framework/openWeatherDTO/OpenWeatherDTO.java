package org.framework.openWeatherDTO;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.logging.Level;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.logging.OpenWeatherLogger;

public class OpenWeatherDTO{

	@JsonProperty("rain")
	private Rain rain;

	@JsonProperty("visibility")
	private int visibility;

	@JsonProperty("timezone")
	private int timezone;

	@JsonProperty("main")
	private Main main;

	@JsonProperty("clouds")
	private Clouds clouds;

	@JsonProperty("sys")
	private Sys sys;

	@JsonProperty("dt")
	private int dt;

	@JsonProperty("coord")
	private Coord coord;

	@JsonProperty("snow")
	private Snow snow;

	@JsonProperty("weather")
	private List<WeatherItem> weather;

	@JsonProperty("name")
	private String name;

	@JsonProperty("cod")
	private int cod;

	@JsonProperty("id")
	private int id;

	@JsonProperty("base")
	private String base;

	@JsonProperty("wind")
	private Wind wind;

	public Rain getRain(){
		OpenWeatherLogger.writeLog(Level.FINE, "Fetching data from Rain DTO");
		return rain;
	}

	public int getVisibility(){
		return visibility;
	}

	public int getTimezone(){
		return timezone;
	}

	public ZoneOffset getTimezoneZoneOffset(){
		return ZoneOffset.ofTotalSeconds(timezone);
	}


	public Main getMain(){
		OpenWeatherLogger.writeLog(Level.FINE, "Fetching data from Main DTO");
		return main;
	}

	public Clouds getClouds(){
		OpenWeatherLogger.writeLog(Level.FINE, "Fetching data from Cloud DTO");
		return clouds;
	}

	public Sys getSys(){
		OpenWeatherLogger.writeLog(Level.FINE, "Fetching data from Sys DTO");
		return sys;
	}

	public int getTime(){
		return dt;
	}

	public LocalDateTime getTimeLocalDateTime(){
		return LocalDateTime.ofEpochSecond(dt,0, getTimezoneZoneOffset());
	}

	public Coord getCoord(){
		OpenWeatherLogger.writeLog(Level.FINE, "Fetching data from Coord DTO");
		return coord;
	}

	public Snow getSnow(){
		OpenWeatherLogger.writeLog(Level.FINE, "Fetching data from Snow DTO");
		return snow;
	}

	public List<WeatherItem> getWeatherList(){
		OpenWeatherLogger.writeLog(Level.FINE, "Fetching Weather DTO list");
		return weather;
	}

	public int getNumWeathers() {return  weather.size();}

	public WeatherItem getWeather(int index) {
		OpenWeatherLogger.writeLog(Level.FINE, "Fetching data from Weather DTO #" + index);
		return  weather.get(index);
	}

	public String getName(){
		return name;
	}

	public int getCod(){
		return cod;
	}

	public int getCityId(){
		return id;
	}

	public String getBase(){
		return base;
	}

	public Wind getWind(){
		OpenWeatherLogger.writeLog(Level.FINE, "Fetching data from Wind DTO");
		return wind;
	}
}