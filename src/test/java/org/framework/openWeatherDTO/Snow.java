package org.framework.openWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Snow{

	@JsonProperty("1h")
	private double Snow1h;
	@JsonProperty("3h")
	private double Snow3h;

	public double getSnow1H(){
		return Snow1h;
	}

	public double getSnow3H(){
		return Snow3h;
	}
}