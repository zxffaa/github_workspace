//배열 복제

import java.util.Arrays;

public class Exam_03 {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		//1. for
		int b[] = new int[a.length];
		for(int i=0; i<a.length;i++) {
			b[i] = a[i];
		}
		System.out.println("a 배열 : " + Arrays.toString(a));
		System.out.println("b 배열 : " + Arrays.toString(b));
		
		a[1] = 100;
		System.out.println("a 배열 : " + Arrays.toString(a));
		System.out.println("b 배열 : " + Arrays.toString(b));
		
		//Object 클래스의 clone() 메소드 이용
		int c[] = a.clone();
		System.out.println("a 배열 : " + Arrays.toString(a));
		System.out.println("c 배열 : " + Arrays.toString(c));
		
	}

}
