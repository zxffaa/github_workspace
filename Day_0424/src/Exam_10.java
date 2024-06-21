/* 키보드로 정수 10개를 입력 받아서 합과 평균을 구하여 출력
(단. 입력 자료에 1미만의 자료는 제외한다
 [입력예시]
 점수 : 1 2 0 0 3 4 5 6 7 8 9 0 0 10 11
[출력예시]
  합계 : 55
  평균 : 5
 * 
 */

import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tot=0;//합계
		System.out.print("점수입력:");
		for(int i=1; i<=10;i++) {
			int score = scn.nextInt();
			if(score<1) {
				i--;
				continue;
			}
			tot += score;
		}
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + tot/10);
	}

}
