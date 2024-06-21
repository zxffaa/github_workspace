/* 키보드로 줄수 입력 다음과 같이 출력
 * 줄수 : 5
 * 25 24 23 22 21 20 19 18 17
 *    16 15 14 13 12 11 10
 *        9  8  7  6  5
 *           4  3  2
 *              1
 */

import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("줄수 : ");
		int row = scn.nextInt();
		int cnt = row * row;
		for(int x=row; x>=1; x--) {
			for(int k=1; k<=row-x; k++) {
				System.out.printf("%3s"," ");
			}
			for(int y=1; y<=x*2-1; y++) {
				System.out.printf("%3d", cnt--);
			}
			System.out.print("\n");
		}
	}

}
