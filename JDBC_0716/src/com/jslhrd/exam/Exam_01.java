package com.jslhrd.exam;

import com.jslhrd.model.*;

public class Exam_01 {

	public static void main(String[] args) {
		EmpDAO SawonCount=new EmpDAO();
		System.out.print("사원수:"+SawonCount.SawonCount());
	}

}
