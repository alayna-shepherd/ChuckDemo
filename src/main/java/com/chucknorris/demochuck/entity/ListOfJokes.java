package com.chucknorris.demochuck.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfJokes {

	private List<Joke> value;

	public ListOfJokes(List<Joke> value) {
		super();
		this.value = value;
	}

	public ListOfJokes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Joke> getValue() {
		return value;
	}

	public void setValue(List<Joke> value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ListOfJokes [value=" + value + "]";
	}

	
	
}
