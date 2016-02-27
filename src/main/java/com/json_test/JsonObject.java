package com.json_test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.json_test.Drivers;

public class JsonObject {
	public Drivers[] drivers;
	
	@JsonCreator
		public JsonObject (@JsonProperty ("drivers") Drivers[] drivers) {
		this.drivers = drivers;
	}

	public Drivers[] getDrivers() {
		return drivers;
	}

	public void setDrivers(Drivers[] drivers) {
		this.drivers = drivers;
	}
}
	

