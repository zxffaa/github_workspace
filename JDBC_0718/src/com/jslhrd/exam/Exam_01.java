package com.jslhrd.exam;

import com.jslhrd.model.*;
import java.util.*;

public class Exam_01 {

	public static void main(String[] args) {
		ExamDAO Sawon=new ExamDAO();
		Scanner input=new Scanner(System.in);
		String SawonName=input.next().toUpperCase();
		List<ExamDTO>list=Sawon.SawonSerch(SawonName);
		for(ExamDTO all:list) {
			System.out.print(all.getEno()+"\t");
			System.out.print(all.getEname()+"\t");
			System.out.print(all.getDno()+"\t");
			System.out.print(all.getDname()+"\t");
			System.out.println();
		}
	}
}
