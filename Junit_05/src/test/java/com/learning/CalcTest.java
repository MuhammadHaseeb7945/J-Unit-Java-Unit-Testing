package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // agr ma chata hon ka object sird class i base pr one time bna
class CalcTest {
	Calc obj = new Calc();
	CalcTest(){
		System.out.println("constructur object");
	}
	@BeforeAll
	static void run() {
		System.out.println("connection established");
	}
	@AfterAll
	static void run1() {
		System.out.println("connection terminated");
	}
	
  @BeforeEach
   void init() {
	   
	   System.out.println("Start");
   }
	@Test
	void test() {
		assertEquals(100,obj.area(10));
		System.out.println("Start 1");
		
	}
	@Test
	void radius_test() {
		assertEquals(20,obj.radius(10),()->"wrong"); // ya supplier functional interface ha 
		//is sa jb wrong hoga tb ya consider kia jia ga wrna ni 
		System.out.println("Start 2");
	}
	@Test
    void test1() {
	int num[]= {1,2,3,4};
	int num2[]= {4,3,2,1};
	Arrays.sort(num2);
	assertArrayEquals(num,num2); // two arrays ko equal krna ka lia use hota ha
	//assertEquals(num,num2);  ya is lia ni use hoga kuka ya reference compare krta ha na ka data
	System.out.println("Start 3");
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
		System.out.println("Start 4");
		
		
	}
	@ Test
	void test3() {
		int unsort[]= {1,2,3,4,5};
		// ma na perfomrance check krni ha agr test case mera define time ma pass ho ga to wo 
		// exceute ho ga wrna pass ni hoga
		assertTimeout(Duration.ofMillis(10),()->obj.arraySort1(unsort));
		System.out.println("Start 5");
		
	}
	@AfterEach  // ya udr use krta ha jdr cleanup ya recourse ko close krna ho
	void distory() {
		System.out.println("Finish");
	}
	
	
}
