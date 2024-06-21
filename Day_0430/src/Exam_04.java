/*  키보드로 줄수를 입력 다음과 같이 출력
 *  [입력]
 *  줄수 : 5
 *             1
 *          2  3  4
 *       5  6  7  8  9
 *   10 11 12 13 14 15 16
 *17 18 19 20 21 22 23 24 25 
 * 
 */

import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("줄수 : ");
		int row = scn.nextInt();
		int cnt=0;//1 2 3 4 5 . . . 
		for(int x=1; x<=row; x++) {
			for(int k=1; k<=row-x;k++) {
				System.out.printf("%3s"," ");
			}
			for(int y=1; y<=x*2-1; y++) {
				cnt++;
				System.out.printf("%3d",cnt);
			}
			System.out.print("\n");
		}
	}

}
