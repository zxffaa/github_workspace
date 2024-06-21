//입력 받은 값이 80 ~ 90 사이 이거나 7의 배수이면 true, 
//아니면 false 출력

import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력:");
		int val = scn.nextInt();
		boolean bool = val>=80&&val<=90||val%7==0;
		//boolean bool = (val>=80&&val<=90)||(val%7==0);
		System.out.println(val + " : " + bool);
		
		boolean bool1 = val>=80&&val<=90;
		boolean bool2 = val%7==0;
		boolean bool3 = bool1 || bool2;
		System.out.println(val + " : " + bool3);

	}

}
