package com.jslhrd.test;

import java.util.*;

import com.jslhrd.model.*;

public class Exam_07 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ExamDAO DO=new ExamDAO();
		System.out.println("찾고자하는 사원번호 입력:");
		int SawonNumber=input.nextInt();
		List<EmpDTO>list=DO.SawonSerch(SawonNumber);
		for(EmpDTO a:list) {
			System.out.println("이름:"+a.getEname());
			System.out.println("부서번호:"+a.getDno());
			System.out.println();
		}

	}

}
