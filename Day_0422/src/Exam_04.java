//키보드로 정수입력 홀수, 짝수 판별

import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력:");
		int score = scn.nextInt();
		if(score < 0 || score >100) {
			System.out.println("입력오류");
			System.exit(1);//프로그램종료
		}
		String str="";
		if(score%2==0) {
			str="짝수";
		}else {
			str="홀수";
		}
		System.out.println(score +"는" + str +"입니다.");
		System.out.printf("%d는 %s입니다.", score,str);
		
	}

}
