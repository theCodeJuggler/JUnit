package com.abinc.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.abinc.app.TaxCalculator;

public class TaxTest {

	// test case to check for non indian nationality
	@Test
	public void testIsIndianFalse() throws Exception {
		TaxCalculator calculator = new TaxCalculator();
		double ans = calculator.calculateTax("Ron", 34000, false);
		Assert.assertEquals(0, ans, 0);
	}

	// test case to check tax not eligible
	@Test
	public void testTaxNotEligible() throws Exception {
		TaxCalculator calculator = new TaxCalculator();
		double ans = calculator.calculateTax("Tim", 1000, true);
		Assert.assertEquals(0, ans, 0);
	}

	// test case to check valid case
	@Test
	public void testValidCase() throws Exception {
		TaxCalculator calculator = new TaxCalculator();
		double ans = calculator.calculateTax("Jack", 30000, true);
		Assert.assertEquals(1500, ans, 0);
	}

	// test case to check name is null or not valid
	@Test
	public void testNullName() throws Exception {
		TaxCalculator calculator = new TaxCalculator();
		double ans = calculator.calculateTax("", 30000, true);
		Assert.assertEquals(0, ans, 0);
	}

}
