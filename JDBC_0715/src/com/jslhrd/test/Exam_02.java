package com.jslhrd.test;

import com.jslhrd.model.ExamDAO;

public class Exam_02 {

	public static void main(String[] args) {
		ExamDAO dao=new ExamDAO();
		System.out.print("사원수:"+dao.empCount());
		
	}

}
