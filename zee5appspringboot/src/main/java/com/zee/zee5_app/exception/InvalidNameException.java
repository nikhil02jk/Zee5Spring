package com.zee.zee5_app.exception;

import lombok.ToString;

@ToString(callSuper = true)
public class InvalidNameException extends Exception {

	public InvalidNameException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}