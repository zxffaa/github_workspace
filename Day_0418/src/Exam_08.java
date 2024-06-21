/* 키보드로 이름 국어 영어 수학 입력 다음과 같이 출력
 * [입력]
 *  학생자료입력 : 김학생 90 88 79
 * [출력]
 * 이름    총점   평균    판정  
 * 김학생  257   85.67  합격
 * 
 * [조건]
 *  평균은 소수이하 세째자리에서 반올림
 *  판정은 평균 80이상 합격 아니면 불합격
 */

import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("학생자료입력 : ");
		String name = scn.next();//이름
		int k = scn.nextInt();//국어
		int e = scn.nextInt();//영어
		int m = scn.nextInt();//수학
		
		int t = k + e + m;//총점
		double a = t / 3.;//평균
		String pass = (a>=80) ? "합격" : "불합격";
		
		//출력
		System.out.println("이름\t총점\t평균\t판정");
		System.out.print(name + "\t" + t + "\t");
		System.out.print(String.format("%.2f", a) + "\t" + pass + "\n");
	}

}
