package com.abinc.exceptions;

//exception class for invalid country entry
public class CountryNotValidException extends Exception{

	@Override
	public String toString() {
		return "The employee should be an Indian";
	}
}
