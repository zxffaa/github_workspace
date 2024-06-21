package com.jslhrd.aaa;

public class Exam_02 {

	public static void main(String[] args) {
		Process pro = new DataProcess();
		int a = 7, b = 5;
		int result = pro.max1(a, b);
		System.out.printf("%d,%d max1=%d\n", a, b, result);
		result = pro.max2(1, 2, 3, 4, 5);
		System.out.printf("%d,%d max2=%d\n", a, b, result);
		result = pro.min1(a, b);
		System.out.printf("%d,%d min1=%d\n", a, b, result);
		result = pro.min2(new int[] { 1, 2, 3, 4, 5 });
		System.out.printf("%d,%d min2=%d\n", a, b, result);
		System.out.println("-------------------------------");
		DataProcess pro2 = new DataProcess();
	
		result = pro2.max1(a, b);
		System.out.printf("%d,%d max1=%d\n", a, b, result);
		result = pro2.max2(1, 2, 3, 4, 5);
		System.out.printf("%d,%d max2=%d\n", a, b, result);
		result = pro2.min1(a, b);
		System.out.printf("%d,%d min1=%d\n", a, b, result);
		result = pro2.min2(new int[] { 1, 2, 3, 4, 5 });
		System.out.printf("%d,%d min2=%d\n", a, b, result);
		
		
		
		
	}

}
