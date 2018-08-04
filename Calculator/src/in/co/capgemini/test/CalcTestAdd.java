package in.co.capgemini.test;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.app.CalculatorApp;

public class CalcTestAdd {

	//Addition of two positive numbers
	@Test
	public void testAddTwoPositive() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.add(2.2,2.4);
		Assert.assertEquals(4.6, ans,0);
	}
	
	//Addition of two negative numbers 
	@Test
	public void testAddTwoNegative() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.add(-2.0,-2.0);
		Assert.assertEquals(-4.0, ans,0);
	}
	
	//Addition of two zeros
	@Test
	public void testAddTwoZero() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.add(0.0,0.0);
		Assert.assertEquals(0.0, ans,0);
	}
	
	//Addition of two unequal numbers of different signs
	@Test
	public void testAddNegPosUnEq() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.add(-4.0,6.0);
		Assert.assertEquals(2.0, ans,0);
	}

	//Addition of two equal numbers of different signs
	@Test
	public void testAddPosNegEq() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.add(-2.0,2.0);
		Assert.assertEquals(0.0, ans,0);
	}
}
