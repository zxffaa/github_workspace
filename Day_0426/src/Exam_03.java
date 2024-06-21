//키보드입력 소수(1과 자신외의 수로 나누어지지 않는 수) 판별하기

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력:");
		int val = scn.nextInt();
		boolean bool=false;
		for(int i=2; i<val; i++) {
			if(val % i == 0) {
				bool=true;
				break;
			}
		}
		if(bool) {
			System.out.print(val+" 는 소수가 아님");
		}else {
			System.out.print(val+" 는 소수");
		}
	}

}
