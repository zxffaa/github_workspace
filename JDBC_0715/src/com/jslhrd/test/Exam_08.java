package com.jslhrd.test;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.model.EmpDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_08 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("커미션비 입력:");
		int ComSerch=input.nextInt();
		ExamDAO ETO=new ExamDAO();
		List<EmpDTO>list=ETO.ComUpSerch(ComSerch);
		for(EmpDTO rs:list) {
			System.out.println("이름:"+rs.getEname());
			System.out.println("봉급:"+rs.getSalary());
			System.out.println("커미션비:"+rs.getCommission());
			System.out.println();
		}
	}

}
