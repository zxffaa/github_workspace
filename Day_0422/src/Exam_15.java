//키보드로 정수 연산자 정수 입력 계산기 만들기
/*계산기 만들기(+, -, *, /, %, <<, >> ) 
 산술연산자 외에 입력된는 연산자는 입력오류

 [입력형식]
 계산기 :  7 * 8
 7 * 8 = 56

 계산기 :  9 % 2
 9 % 2 = 1

 계산기 :  9 / 2
 9 / 2 = 4

 * 
 * 
 */

import java.util.Scanner;

public class Exam_15 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("계산기 : ");
		int num1 = scn.nextInt();//정수
		String op = scn.next();//연산자
		int num2 = scn.nextInt();//정수
		int res=0;
		if(op.equals("+")) {
			res = num1 + num2;
			System.out.printf("%d + %d = %d\n", num1,num2,res);
		}else if(op.equals("-")) {
			
		}else if(op.equals("*")) {
			
		}else if(op.equals("/")) {
			if(num1==0 || num2==0) {
				System.out.println("0으로 나눌수 없음");
			}else {
				
			}
		}else if(op.equals("%")) {
			res = num1 % num2;
			System.out.printf("%d %% %d = %d\n", num1,num2,res);			
		}else if(op.equals("<<")) {
			
		}else if(op.equals(">>")) {
			
		}else {
			System.out.print("연산자 오류입니다.");
		}
		
	}

}
