package com.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator obj= new Calculator();
	int actual= obj.sum(100, 10);
	int expected=110;

	@Test
	public void test() {
		assertEquals(actual,expected);
	}

}
