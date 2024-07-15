package com.jslhrd.test;

import java.util.*;

import com.jslhrd.model.*;

//키보드로 급여를 입력(예시:2000)
public class Exam_05 {

	public static void main(String[] args) {
		ExamDAO CTO = new ExamDAO();
		int cnt=0;
		Scanner input =new Scanner(System.in);
		System.out.print("일정급여 이상인 사람을 검색:");
		int money=input.nextInt();
		List<CommDTO> list = CTO.getSalary(money);
		
		for(CommDTO CO : list) {
			cnt++;
			System.out.println("번호 : " + CO.getEno());
			System.out.println("이름 : " + CO.getEname());
			System.out.println("업무 : " + CO.getJob());
			System.out.println("관리번호 : " + CO.getManager());
			System.out.println("입사날짜 : " + CO.getHiredate());
			System.out.println("연봉 : " + CO.getSalary());
			System.out.println("보너스연봉 : " + CO.getCommission());
			System.out.println("부서번호 : " + CO.getDno());
			System.out.print("\n");
		}
	}
}
