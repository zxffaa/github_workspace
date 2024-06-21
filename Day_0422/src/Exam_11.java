/* 키보드로 7개의 정수점수를 입력하여 평균 이상인 점수를 출력 하는 프로그램

 [입력형식]
 점수 : 90 79 80 88 67 78 65

 [출력형식]

 평균 : 78.1428…
 평균이상 점수 :  90 79 80 88 
 평균이상 자료 수 : 4 

 * 
 */

import java.util.Scanner;

public class Exam_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수7개입력 : ");
		int a1=scn.nextInt();
		int a2=scn.nextInt();
		int a3=scn.nextInt();
		int a4=scn.nextInt();
		int a5=scn.nextInt();
		int a6=scn.nextInt();
		int a7=scn.nextInt();
		double ave=(a1+a2+a3+a4+a5+a6+a7)/7.0;
		int cnt=0;//평균이상 카운트 변수
		String aveStr="";//평균이상 점수 결합용 변수
		if(a1>=ave) {
			cnt++;
			aveStr += a1+" ";
		}
		//.......(생략)
		if(a7>=ave) {
			cnt++;
			aveStr += a7+" ";
		}
		System.out.println("평균 :" + ave);
		System.out.println("평균이상 점수 :" + aveStr);
		System.out.println("평균이상 자료수 :" + cnt);
		
	}

}
