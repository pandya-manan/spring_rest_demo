package com.manan.springdemo.rest;

@SuppressWarnings("serial")
public class StudentNotFoundException extends RuntimeException {

	
	public StudentNotFoundException(String message)
	{
		super(message);
	}

}
