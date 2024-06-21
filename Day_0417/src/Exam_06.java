/* 키보드로 정수 실수입력(+,-,*,/,%) 연산
 *  예) 정수 실수 입력 : 7 5.3;
 *  7 + 5.3 = 12
 *   .  .   .
 *  7 / 5.3 =   (반올림, 소수이하 한자리까지 출력)
 *  7 % 5 = 2  (정수연산으로 변경) 
 */

import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 실수입력:");
		int a = scn.nextInt();
		double b = scn.nextDouble();
		System.out.printf("%d + %f = %f\n", a,b,(a+b));
		System.out.printf("%d - %f = %f\n", a,b,(a-b));
		
		double res = a * b;
		System.out.printf("%d * %f = %f\n", a,b,res);
		res = a / b;
		System.out.printf("%d / %f = %f\n", a,b,res);
		res = (int)(a / b * 10 + 0.5) / 10.0;//반올림
		System.out.printf("%d / %f = %f\n", a,b,res);
		
		//나머지
		System.out.printf("%d %% %d = %d\n", a,(int)b,a%(int)b);
		int r =  a%(int)b;
		System.out.printf("%d %% %d = %d\n", a,(int)b,r);

	}

}
