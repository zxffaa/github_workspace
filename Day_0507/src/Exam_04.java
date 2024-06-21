//배열요소 출력

import java.util.Arrays;

public class Exam_04 {
	public static void main(String[] args) {
		int a[] = {4,6,9,3,6,7};
		
		//Arrays.toString()// 단순 확인용도
		System.out.println("a 배열 : " + Arrays.toString(a));
		
		//기본 for()
		System.out.print("a 배열 : ");
		for(int i=0; i<4;i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
		//확장 for()
		System.out.print("a 배열 : ");
		for(int i : a) {
			System.out.printf("%3d", i);
		}
		
	}

}
