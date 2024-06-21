/*계산기 만들기(+, -, *, /, %, >>, <<) 
 산술연산자 외에 입력되는 연산자는 입력오류

 [입력형식]
 계산기 :  7 * 8
 7 * 8 = 56

 계산기 :  9 % 2
 9 % 2 = 1

 계산기 :  9 / 2
 9 / 2 = 4

 * 
 */

import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("계산기:");
		int a = scn.nextInt();
		String op = scn.next();
		int b=scn.nextInt();
		switch(op) {
			case "+":
				System.out.printf("%d + %d = %d", a,b,(a+b));
				break;
			case "-":
				int result = a-b;
				System.out.printf("%d + %d = %d", a,b,result);
				break;
			case "/":
				if(a==0 || b==0) {
					System.out.println("0으로 나눌수 없음");
					break;
				}
				result = a/b;
				System.out.printf("%d + %d = %d", a,b,result);
				break;
				
			default:
				System.out.print("연산자오류");
		}	
	}

}
