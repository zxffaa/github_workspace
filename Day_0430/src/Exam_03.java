/* 키보드로 줄수를 입력   "*" 정삼가형 출력
 * [입력]
 *  줄수 : 5
 *      *
 *     ***
 *    *****
 *   *******
 *  *********
 *  
 * 
 */

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("줄수 : " );
		int row = scn.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int k=1; k<=row-i;k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
