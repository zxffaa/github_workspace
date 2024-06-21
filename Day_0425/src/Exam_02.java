/* 키보드로 양의 정수 10개를 입력 받아서  합계, 평균을 출력 
 [ 입력예시 ]
  입력  : 10  0  8 -7 5 3 7 -3 0 -4 6 4  5 8 -9 8 7 -9 -5 9 9 5 7    
 * 
 */

import java.util.Scanner;
//무한LOOP
public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum=0;//합계
		int cnt=0;//갯수
		System.out.print("입력:");
		while(true) {
			int score = scn.nextInt();
			if(score <= 0) {
				continue;
			}
			cnt++;
			sum += score;
			if(cnt==10) {//EOF
				break;
			}
		}
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", sum/10.);
		System.out.printf("평균 : %.2f\n", (double)sum/cnt);
	}

}
