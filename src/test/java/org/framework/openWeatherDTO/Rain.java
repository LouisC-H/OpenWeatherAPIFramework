package org.framework.openWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain{

	@JsonProperty("1h")
	private double Rain1h;

	@JsonProperty("3h")
	private double Rain3h;

	public double getRain1h(){
		return Rain1h;
	}

	public double getRain3h(){
		return Rain3h;
	}
}