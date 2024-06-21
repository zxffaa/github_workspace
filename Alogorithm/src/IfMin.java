//정수 3개입력 최대값 찾기

import java.util.Scanner;

public class IfMin {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("3개의 정수입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		//첫번째 데이터는 최소값
		int min = a;
		if(min > b) {
			min=b;
		}
		if(min > c) {
			min=c;
		}
		System.out.printf("%d, %d, %d min=%d", a,b,c,min);
	}

}
