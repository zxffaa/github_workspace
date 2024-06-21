/*  키보드로 10진수를 입력 2진수로 변환
 *  10진수 입력 : 25
 *  2진수 : 11001
 *  
 *  10진수 : 10
 *  2진수 : 1010
 *  
 *  10진수 : 7
 *  2진수 : 111
 *  
 *  10진수 : 0
 *  프로그램종료
 * 
 */

import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("10진수:");
			int dec = scn.nextInt();
			if(dec <=0 ) {//EOF
				break;
			}
			//2진수 변환
			String bin="";
			
		}
		System.out.print("프로그램 종료");
	}

}
