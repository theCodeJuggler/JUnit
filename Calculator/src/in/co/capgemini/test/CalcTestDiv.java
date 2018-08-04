package in.co.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import in.co.capgemini.app.CalculatorApp;
//test case of two number division
public class CalcTestDiv {

	@Test
	public void testDivTwoPositiveGreatByLess() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.div(5.0,2.0);
		Assert.assertEquals(2.5, ans, 0);
	}

	@Test
	public void testDivTwoPositiveLessByGreat() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.div(2.0,5.0);
		Assert.assertEquals(0.4, ans, 0);
	}
	
	@Test
	public void testDivTwoNegativeLessByGreat() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.div(-2.0,-5.0);
		Assert.assertEquals(0.4, ans, 0);
	}
	
	@Test
	public void testDivTwoNegativeGreatByLess() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.div(-5.0,-2.0);
		Assert.assertEquals(2.5, ans, 0);
	}
	
	@Test
	public void testDivTwoMixedGreatByLess() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.div(-5.0,2.0);
		Assert.assertEquals(-2.5, ans, 0);
	}
	
	@Test
	public void testDivTwoMixedLessByGreat() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.div(2.0,-5.0);
		Assert.assertEquals(-0.4, ans, 0);
	}
	
	@Test
	public void testDivDenominatorZero() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.div(5.0,0);
		Assert.assertEquals(Double.POSITIVE_INFINITY, ans, 0);
	}
	
	@Test
	public void testDivDenominatorZeroNeg() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.div(-5.0,0);
		Assert.assertEquals(Double.NEGATIVE_INFINITY, ans, 0);
	}
	
	@Test
	public void testDivNumeratorZero() {
		CalculatorApp app = new CalculatorApp();
		double ans = app.div(0,5.0);
		Assert.assertEquals(Double.NaN, ans, 0);
	}
}
