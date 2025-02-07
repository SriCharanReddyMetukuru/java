package com.wipro.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	private final Calculator calculator = new Calculator();
	
	@Test 
	public void testAdd() {
        int result = calculator.add(20, 22);
        assertEquals(42, result);
    }
	
	@Test
	public void testSub() {
        int result = calculator.subtract(89, 9);
        assertEquals(50, result);
    }
	
	@Test
	public void testAddWithNegative() {
        int result = calculator.add(-38, -32);
        assertEquals(-70, result);
    }
	
	@Test
	public void testSubWithNegative() {
        int result = calculator.subtract(-35, -30);
        assertEquals(-5, result);
    }

}