/* 키보드로 10개의 점수를 입력 받어서 홀수의 합과 개수 출력하는 프로그램 작성
   [입력예시]
   점수: 2 5 4 6 7 9 6 4 5 6 7 8 9

  [출력예시]
  홀수 합 : 26
  홀수 개수: 4 
 */

import java.util.Scanner;

public class Exam_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt=0;//홀수 개수 카운트
		int tot=0;//홀수합
		System.out.print("입력:");
		for(int i=1; i<=10; i++) {
			int a = scn.nextInt();
			if(a%2==1) {
				cnt++;
				tot += a;
			}
		}
		System.out.println("홀수 합 :" + tot);
		System.out.println("홀수 개수 :" + cnt);
	}

}
