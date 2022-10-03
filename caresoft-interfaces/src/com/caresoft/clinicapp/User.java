package com.caresoft.clinicapp;

public class User {
//	attributes
	protected Integer id;
    protected int pin;
    
//  instance of User
    public User (){}
    
//  implementing constructor that takes in an ID
    public User (Integer id) {
    	this.id = id;
    }
    
    
//    getter
    public Integer getId() {
		return id;
	}
    
//    setter
	public void setId(Integer id) {
		this.id = id;
	}
	
//	getter
	public int getPin() {
		return pin;
	}
	
//	setter
	public void setPin(int pin) {
		this.pin = pin;
	}

}

