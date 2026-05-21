package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {
	Calc obj = new Calc();
	

	@Test
	void test() {
		assertEquals(100,obj.area(10));
		
	}
	@Test
	void radius_test() {
		assertEquals(20,obj.radius(10),()->"wrong"); // ya supplier functional interface ha 
		//is sa jb wrong hoga tb ya consider kia jia ga wrna ni 
	}

}
