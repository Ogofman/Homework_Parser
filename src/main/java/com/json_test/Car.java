package com.json_test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {
	private String name;
	private int age;

	@JsonCreator
	public Car(@JsonProperty("name") String name, @JsonProperty("age") int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	}


