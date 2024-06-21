/*  구구단 출력
 *  키보드로 단입력 -> 구구단 출력
 *  구구단 : 3
 *  3단 출력
 *  3 * 1 = 3
 *    .
 *  3 * 9 = 27
 *  
 *  구구단 : 5
 *  5단 출력
 *  5 * 1 = 5
 *    .
 *  5 *8 9 = 45
 *  
 *  구구단 : 0--> 종료
 * 
 */

import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("구구단 : ");
			int dan = scn.nextInt();
			if(dan == 0) {//EOF
				break;
			}
			System.out.println(dan +"단 출력");
			for(int i=1; i<=9; i++) {
				System.out.printf("%3d * %3d = %3d\n",dan,i,(dan*i));
			}
			
		}
	}

}
