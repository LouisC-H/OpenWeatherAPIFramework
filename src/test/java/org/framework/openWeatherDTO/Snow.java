package org.framework.openWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Snow{

	@JsonProperty("1h")
	private double jsonMember1h;

	public double getJsonMember1h(){
		return jsonMember1h;
	}
}