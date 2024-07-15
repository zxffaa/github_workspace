package com.jslhrd.test;

import java.util.*;

import com.jslhrd.model.*;

public class Exam_10 {

	public static void main(String[] args) {
		ExamDAO da=new ExamDAO();
		List<CommDTO>list=da.JobKategorie();
		for(CommDTO JK:list) {
			System.out.println("직업:"+JK.getJob());
			System.out.println("최대:"+JK.getMax());
			System.out.println("직업:"+JK.getMin());
			System.out.println("직업:"+JK.getAvg());
			System.out.println();
		}
		
	}

}
