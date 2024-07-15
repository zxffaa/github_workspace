package com.jslhrd.test;

import java.util.Scanner;

import com.jslhrd.model.*;

public class Exam_09 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ExamDAO dt=new ExamDAO();
		System.out.print("부서번호 입력:");
		int Dn=input.nextInt();
		System.out.print("총 합계:"+dt.SalarySum(Dn));

	}

}
