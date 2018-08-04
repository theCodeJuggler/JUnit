package com.abinc.exceptions;

//exception class for invalid employee name entry
public class EmployeeNameInvalidExceptions extends Exception{

	@Override
	public String toString() {
		return "The employee name cannot be empty";
	}
	
}
