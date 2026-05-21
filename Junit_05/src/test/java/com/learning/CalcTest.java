package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

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
	@Test
    void test1() {
	int num[]= {1,2,3,4};
	int num2[]= {4,3,2,1};
	Arrays.sort(num2);
	assertArrayEquals(num,num2); // two arrays ko equal krna ka lia use hota ha
	//assertEquals(num,num2);  ya is lia ni use hoga kuka ya reference compare krta ha na ka data
	}
	
	@Test
	void test2() {
//		int unsort[]= {3,2,1,5};
//		int sorted[]= obj.arraySort(unsort);
//		int actual[]= {1,2,3,5};
//		
//		assertArrayEquals(actual,sorted);
//		try {
//		
		int unsort[]=null;
//		obj.arraySort(unsort);
//		// agr exception occur ho to necha wali lines ni chla gi
//		for (int n: unsort ) {
//			System.out.print(n);
//		}
//		
//		}
//		catch(NullPointerException e) {
//			System.out.print("Enter valid array");
//		}
		
		// short way likhana ka
		assertThrows(NullPointerException.class,()->obj.arraySort(unsort));
		
		
		
	}
	
	
}
