package com.jslhrd.aaa;

import java.util.*;

public class StudentExam {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt=0;
		Set<Student> stuSet = new HashSet<Student>();
		// 입력
		while (true) {
			System.out.print("입력:");
			String line[] = scn.nextLine().split(",");
			int bun = Integer.parseInt(line[0]);
			if (bun == 0) {
				break;
			}
			String name = line[1];
			int kor = Integer.parseInt(line[2]);
			int eng = Integer.parseInt(line[3]);
			int mat = Integer.parseInt(line[4]);

			Student stu = new Student(bun, name, kor, eng, mat);

			if (stuSet.contains(stu)) {
				System.out.println("이미 등록된 학생입니다");
			} else {
				stuSet.add(stu);
			}
			cnt++;
		} // 입력종료
			// 총점, 평균 등급 계산
		for (Student s : stuSet) {
			s.setTot(s.getKor() + s.getEng() + s.getMat());
			s.setAve(s.getTot()/cnt);
		}
		for(Student s : stuSet) {
			if(s.getAve()>90) {
				s.setGrade("수");
			}else if(s.getAve()>80){
				s.setGrade("우");
			}else if(s.getAve()>70){
				s.setGrade("미");
			}else if(s.getAve()>60){
				s.setGrade("양");
			}else {s.setGrade("가");}			
		}
		// 출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
		for (Student s : stuSet) {
			System.out.print(s.getBun() + "\t");
			System.out.print(s.getName() + "\t");
			System.out.print(s.getKor() + "\t");
			System.out.print(s.getEng() + "\t");
			System.out.print(s.getMat() + "\t");
			System.out.print(s.getTot() + "\t");
			System.out.print(s.getAve() + "\t");
			System.out.print(s.getGrade() + "\n");
		}
		System.out.println();
		List<Student> stuu = new ArrayList<>(stuSet);
		Collections.sort(stuu);
		System.out.print("list Sort: " + stuu+"\n");
	}

}
