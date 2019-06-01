package com.marselsampe.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

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
