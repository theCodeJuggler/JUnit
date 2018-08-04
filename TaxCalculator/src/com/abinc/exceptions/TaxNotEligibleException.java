package com.abinc.exceptions;

//exception class for tax exempted income
public class TaxNotEligibleException extends Exception{

	@Override
	public String toString() {
		return "The employee does not need to pay tax";
	}
	
}
