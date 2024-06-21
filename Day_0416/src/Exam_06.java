//키보드로 번호, 이름, 국어, 영어, 수학 입력
//총점, 평균을 구하여 번호, 이름, 총점, 평균을 출력하는 프로그램

import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력(번호, 이름, 국어, 영어, 수학) :");
		int bun = scn.nextInt();
		String name = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		
		int tot = kor + eng + mat;
		double ave = tot / 3.0;
		
		System.out.println("번호:" + bun);
		System.out.println("이름:" + name);
		System.out.println("총점:" + tot);
		System.out.println("평균:" + ave);
		
		
	}

}
