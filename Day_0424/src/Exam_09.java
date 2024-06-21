//키보드로 정수 7개입력 최대, 최소값을 구하여 출력
/* [입력형식]
 * 정수 7개입력: 90 77 88 67 89 95 66 77 55 44 33
 * [출력형식]
 * 최대값 : 95
 * 최소값 : 67
 * (입력값의 범위는 0~100)
 */

import java.util.Scanner;

public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//int max=-1,min=101;
		System.out.print("정수7개입력:");
		int max = scn.nextInt();
		int min=max;
		for(int i=1; i<=6;i++) {
		//for(int i=2; i<=7;i++) {
			int a = scn.nextInt();
			if(max < a) {
				max=a;
			}else if(min > a) {
				min=a;
			}
		}
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);

	}

}
