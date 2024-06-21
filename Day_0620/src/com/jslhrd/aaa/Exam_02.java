package com.jslhrd.aaa;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_02 {

	public static void main(String[] args) throws Exception {
		StringTokenizer st = null;
		Scanner scn = new Scanner(new File("src/student.txt"));
		int cnt = 0;
		int ktot = 0, etot = 0, mtot = 0, ttot = 0;
		while (scn.hasNextLine()) {
			String str = scn.nextLine();
			st = new StringTokenizer(str, ", ");
			int bun = Integer.parseInt(st.nextToken());// 번호
			String name = st.nextToken();// 이름
			int kor = Integer.parseInt(st.nextToken());// 국어
			int eng = Integer.parseInt(st.nextToken());// 영어
			int mat = Integer.parseInt(st.nextToken());// 수학
			int tot = kor + eng + mat;
			double ave = tot / 3.;
			String grade = "F";
			if (ave >= 90)
				grade = "A";
			else if (ave >= 80)
				grade = "B";
			else if (ave >= 70)
				grade = "C";
			else if (ave >= 60)
				grade = "D";
			ktot = kor + ktot;
			etot = eng + etot;
			mtot = kor + mtot;
			ttot = ktot + etot + mtot;

			System.out.print(bun + "\t" + name + "\t");
			System.out.print(kor + "\t" + eng + "\t");
			System.out.print(mat + "\t" + tot + "\t");
			// System.out.print(ave + "\t" + grade + "\n");
			System.out.print(String.format("%.1f", ave) + "\t" + grade + "\n");
			cnt++;
		}
		System.out.println("전체총점 : \t" + ktot + "\t" + etot + "\t" + mtot + "\t" + ttot);
		System.out.print("전체평균 : \t");
		System.out.print(String.format("%.1f", (double) ktot / cnt) + "\t");
		System.out.print(String.format("%.1f", (double) etot / cnt) + "\t");
		System.out.print(String.format("%.1f", (double) mtot / cnt) + "\t");
		System.out.print(String.format("%.1f", (double) ttot / (cnt * 3)) + "\n");

	}

}
