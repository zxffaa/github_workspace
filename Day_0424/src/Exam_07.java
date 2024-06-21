//키보드로 정수 5개 입력 합계, 평균 구하기

import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//System.out.print("정수입력:");
		/*int a1=scn.nextInt();
		int a2=scn.nextInt();
		int a3=scn.nextInt();
		int a4=scn.nextInt();
		int a5=scn.nextInt();
*/
		int s=0;
		for(int i=1; i<=5; i++) {
			System.out.print("정수입력("+i+"):");
			int a = scn.nextInt();
			s +=a;
		}
		//System.out.println("a="+a);
		System.out.println("s="+s);
		
	}

}
