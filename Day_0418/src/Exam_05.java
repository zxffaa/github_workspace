//키보드로 정수입력 입력된 정수가 80 ~ 90 사이면 true
//아니면 false 출력

import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력:");
		int val = scn.nextInt();
		
		System.out.println(val + " : " + (val >=80 && val <= 90));
		
		boolean bool = val >=80 && val <= 90;
		System.out.println(val + " : " + bool);
		
		boolean bool1 = val >=80;
		boolean bool2 = val <=90;
		boolean bool3 = bool1 && bool2;
		System.out.println(val + " : " + bool3);
		
	}

}
