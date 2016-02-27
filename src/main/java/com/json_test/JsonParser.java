package com.json_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		InputStream inp = new FileInputStream("src/main/resources/myFiles/test.json");
		ObjectMapper obMapper = new ObjectMapper();
		obMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		obMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		JsonObject json = obMapper.readValue(inp, JsonObject.class);
		System.out.println(json.getDrivers()[0].getId());
		System.out.println(json.getDrivers()[0].getName());
		System.out.println(json.getDrivers()[0].getAge());
		System.out.println(json.getDrivers()[0].getCar());

	}
}
