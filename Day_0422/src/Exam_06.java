//키보드로 번호 이름 국어 영어 수학 입력 총점 평균 판정을 구하여 출력
//판정은 평균 80이상 "합격" 아니면 "불합격"
/*  [입력형식]
 *  성적입력 : 1 김학생 90 88 79
 *  
 *  [출력형식]
 *  번호 : 1
 *  이름 : 김학생
 *  총점 :
 *  평균 :
 *  판정 :
 *  
 */

import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("성적입력:");
		int b = scn.nextInt();
		String n = scn.next();
		int k=scn.nextInt();
		int e=scn.nextInt();
		int m=scn.nextInt();
		
		int t = k+e+m;
		double a = t/3.;
		String p="불합격";
		if(a>=80) {
			p="합격";
		}
		String pp="";
		if(a>=80) {
			pp="합격";
		}else {
			pp="불합격";
		}
		System.out.println("번호 : " + b);
		System.out.println("이름 : " + n);
		System.out.println("총점 : " + t);
		System.out.println("평균 : " + a);
		System.out.println("판정 : " + p);
	}

}
