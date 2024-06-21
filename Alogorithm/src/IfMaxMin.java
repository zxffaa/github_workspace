//정수 4개입력 최대값, 최소값 찾기

import java.util.Scanner;

public class IfMaxMin {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("4개의 정수입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
		
		//첫번째 데이터는 최대, 최소
		int max = a;
		int min = a;
		if(max < b) {
			max = b;
		}else if(min > b) {
			min = b;
		}
		if(max < c) {
			max=c;
		}else if(min > c) {
			min = c;
		}
		if(max < d) {
			max = d;
		}else if(min > d) {
			min = d;
		}
		System.out.printf("%d, %d, %d, %d  max=%d,  min=%d",a,b,c,d,max,min);
	}

}
