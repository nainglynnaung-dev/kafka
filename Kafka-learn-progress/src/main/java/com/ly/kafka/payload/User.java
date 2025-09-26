package com.ly.kafka.payload;

public class User {
	private Long id;
	private String firstName;
	private String secondName;
	public User(Long id, String firstName, String secondName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
	}
	public User() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	
	
	

}
