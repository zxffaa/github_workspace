package com.jslhrd.test;

import java.util.List;

import com.jslhrd.model.*;

public class Exam_04 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		int cnt=0;
		List<EmpDTO> list = dao.getDno(10);
		
		for(EmpDTO dto : list) {
			cnt++;
			System.out.println("번호 : " + dto.getEno());
			System.out.println("이름 : " + dto.getEname());
			System.out.println("업무 : " + dto.getJob());
			System.out.println("관리번호 : " + dto.getManager());
			System.out.println("입사날짜 : " + dto.getHiredate());
			System.out.println("연봉 : " + dto.getSalary());
			System.out.println("보너스연봉 : " + dto.getCommission());
			System.out.println("부서번호 : " + dto.getDno());
			System.out.print("\n");
		}
		System.out.println("사원번호가 10인 데이터베이스"+cnt+"명");

	}

}
