package com.learning;

import java.util.Arrays;

public class Calc {
	public int area(int a) {
		return a*a;
	}
	public int radius(int a) {
		return 2*a;
	}
	// sure file plugins hum is lia use krta ha kuka jb hmra pass eclipse ide na ho to code ko independetly run krna ho to surefireplugins use krain ga

	
	public int[] arraySort(int sorted[]) {
		Arrays.sort(sorted);
		return sorted;
		
	}
	public int[] arraySort1(int sorted[]) {
		for(int i=0;i<100000;i++) {
		Arrays.sort(sorted);
		
		}
		return sorted;
	}
	
}
