//배열 공유와 복제

import java.util.Arrays;

public class Exam_02 {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int b[] = a;
		
		System.out.println("a 배열 요소 : " + Arrays.toString(a));
		System.out.println("b 배열 요소 : " + Arrays.toString(b));
		
		a[1]=200;
		b[2]=300;
		System.out.println("a 배열 요소 : " + Arrays.toString(a));
		System.out.println("b 배열 요소 : " + Arrays.toString(b));
		
	}

}
