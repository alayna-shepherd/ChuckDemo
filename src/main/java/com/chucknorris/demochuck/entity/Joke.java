package com.chucknorris.demochuck.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Joke {
	
	private Integer id;
	private String joke;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getJoke() {
		return joke;
	}
	public void setJoke(String joke) {
		this.joke = joke;
	}
	public Joke(Integer id, String joke) {
		super();
		this.id = id;
		this.joke = joke;
	}
	public Joke() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Joke [id=" + id + ", joke=" + joke + "]";
	}
	
	
	
	

}
