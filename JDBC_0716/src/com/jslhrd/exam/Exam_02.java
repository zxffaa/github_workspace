package com.jslhrd.exam;

import com.jslhrd.model.EmpDAO;

public class Exam_02 {

	public static void main(String[] args) {
		EmpDAO DeptCount=new EmpDAO();
		System.out.print("부서수:"+DeptCount.DeptCount());
	}

}
