package com.jslhrd.test;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.model.*;

public class Exam_06 {

	public static void main(String[] args) {
		ExamDAO da=new ExamDAO();
		Scanner input =new Scanner(System.in);
		int UpMoney=input.nextInt();
		List<EmpDTO>list=da.getUpSalary(UpMoney);
		for(EmpDTO all:list) {
			System.out.println("번호 : " + all.getEno());
			System.out.println("이름 : " + all.getEname());
			System.out.println("연봉 : " + all.getSalary());
			System.out.println("연봉된연봉 : " + all.getBonus());
			System.out.println("부서번호 : " + all.getDno());
			System.out.print("\n");
		}

	}

}
