package com.ofd.exception;

public class RestaurantIdNotFoundException extends  RuntimeException {
	
	public RestaurantIdNotFoundException(String message) {
		super(message);
	}

}
