package org.framework.openWeatherDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain{

	@JsonProperty("1h")
	private double jsonMember1h;

	public double getJsonMember1h(){
		return jsonMember1h;
	}
}