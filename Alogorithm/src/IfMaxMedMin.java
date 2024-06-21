//키보드로 정수 3개입력 대, 중, 소 찾기

import java.util.Scanner;

public class IfMaxMedMin {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 3개입력 :");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		//교환법이용
		if(a<b) {
			int t = a;
			a = b;
			b = t;
		}
		if(a<c) {
			int t=a;
			a=c;
			c=t;
		}
		if(b<c) {
			int t=b;
			b=c;
			c=t;
		}
		System.out.printf("%d > %d > %d", a,b,c);
	}

}
