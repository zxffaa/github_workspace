//키보드로 번호, 이름, 국어, 영어, 수학 입력
//총점, 평균을 구하여 번호, 이름, 총점, 평균을 출력하는 프로그램

import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("번호:");
		int bun = s.nextInt();
		System.out.print("이름:");
		String name = s.next();
		System.out.print("국어:");
		int kor = s.nextInt();
		System.out.print("영어:");
		int eng = s.nextInt();
		System.out.print("수학:");
		int mat = s.nextInt();
		
		int tot = kor + eng + mat;
		double ave = tot / 3.0;
		
		System.out.println("번호:" + bun);
		System.out.println("이름:" + name);
		System.out.println("총점:" + tot);
		System.out.println("평균:" + ave);
		
	}

}
