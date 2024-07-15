package com.jslhrd.test;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.model.*;

public class Exam_11 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("포함된 문자 검색:");
		String a=input.next();
		ExamDAO k=new ExamDAO();
		List<CommDTO>list=k.Like(a);
		for(CommDTO aaa:list) {
			System.out.println("사원번호:"+aaa.getEno());
			System.out.println("이름:"+aaa.getEname());
			System.out.println("연봉:"+aaa.getSalary());
			System.out.println();
		}

	}

}
