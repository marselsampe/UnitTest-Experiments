package com.marselsampe.unittest.basic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.marselsampe.unittest.basic.Calculator;

public class CalculatorTest {
	Calculator calculator = new Calculator();
	
	@Test
	public void testAdd() {
		assertEquals(2, calculator.add(1,1));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(4, calculator.multiply(2, 2));
	}
}
