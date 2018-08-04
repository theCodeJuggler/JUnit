package in.co.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.app.CalculatorApp;
//test case of two number multiplication
public class CalcTestMul {

	@Test
	public void testMulTwoZero() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.mul(0.0,0.0);
		Assert.assertEquals(0, ans,0);
	}
	
	@Test
	public void testMulOneZero() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.mul(2.0,0.0);
		Assert.assertEquals(0.0, ans,0);
	}

	@Test
	public void testMulTwoPositive() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.mul(2.0,4.2);
		Assert.assertEquals(8.4, ans,0);
	}
	
	@Test
	public void testMulTwoNegative() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.mul(-2.0,-4.0);
		Assert.assertEquals(8.0, ans,0);
	}
	
	@Test
	public void testMulPosMul() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.mul(2.0,-4.0);
		Assert.assertEquals(-8.0, ans,0);
	}
}
