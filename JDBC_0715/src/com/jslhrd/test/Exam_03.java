package com.jslhrd.test;

import com.jslhrd.model.*;

public class Exam_03 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		//String name = "SCOTT";//키보드입력
		//EmpDTO dto = dao.getName(name);
		EmpDTO dto = dao.getName("SCOTT");
		System.out.println("번호 : " + dto.getEno());
		System.out.println("이름 : " + dto.getEname());
		System.out.println("업무 : " + dto.getJob());
		System.out.println("관리번호 : " + dto.getManager());
		System.out.println("입사날짜 : " + dto.getHiredate());
		System.out.println("연봉 : " + dto.getSalary());
		System.out.println("보너스연봉 : " + dto.getCommission());
		System.out.println("부서번호 : " + dto.getDno());
	}

}
