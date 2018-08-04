package in.co.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.app.CalculatorApp;
//test case of two number subtraction
public class CalcTestSub {

	@Test
	public void testSubTwoNegative() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.sub(-2.0,-2.0);
		Assert.assertEquals(0, ans, 0);
	}
	
	@Test
	public void testSubTwoPositive() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.sub(2.0,2.0);
		Assert.assertEquals(0, ans, 0);
	}
	
	//Subtraction of two 0s
	@Test
	public void testSubTwoZero() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.sub(0.0,0.0);
		Assert.assertEquals(0, ans, 0);
	}
	
	@Test
	public void testSubPosNeg() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.sub(2.0,-2.0);
		Assert.assertEquals(4, ans, 0);
	}
	
	@Test
	public void testSubNegPos() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.sub(-2.0,2.0);
		Assert.assertEquals(-4, ans, 0);
	}
	
}
