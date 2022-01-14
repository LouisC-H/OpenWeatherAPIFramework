package org.framework.openWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain{

	@JsonProperty("1h")
	private double Rain1h;

	@JsonProperty("3h")
	private double Rain3h;

	public double getRain1H(){
		return Rain1h;
	}

	public double getRain3H(){
		return Rain3h;
	}
}