//3개의 정수를 입력 최대값 찾기

import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 3개입력 : ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int max = (a>b) ? a : b;
		max = (max > c) ? max : c;
		
		System.out.printf("%d, %d, %d 중 최대값은 %d\n",a,b,c,max);
		//최소값
		
	}
}
