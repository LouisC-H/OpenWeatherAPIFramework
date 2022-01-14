package org.framework.openWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Sys{

	@JsonProperty("country")
	private String country;

	@JsonProperty("sunrise")
	private int sunrise;

	@JsonProperty("sunset")
	private int sunset;

	@JsonProperty("id")
	private int id;

	@JsonProperty("type")
	private int type;

	@JsonProperty("message")
	private double message;

	public String getCountryCode(){
		return country;
	}

	public int getSunrise(){
		return sunrise;
	}

	public LocalDateTime getSunriseDateTime(OpenWeatherDTO openWeatherDTO){
		return LocalDateTime.ofEpochSecond(sunrise,0, ZoneOffset.ofTotalSeconds(openWeatherDTO.getTimezone()));
	}

	public int getSunset(){
		return sunset;
	}

	public LocalDateTime getSunsetDateTime(OpenWeatherDTO openWeatherDTO){
		return LocalDateTime.ofEpochSecond(sunset,0, ZoneOffset.ofTotalSeconds(openWeatherDTO.getTimezone()));
	}

	public int getId(){
		return id;
	}

	public int getType(){
		return type;
	}

	public double getMessage(){
		return message;
	}
}