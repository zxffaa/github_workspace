package com.jslhrd.emp.exam;

import java.util.List;

import com.jslhrd.emp.model.*;

public class Exam_05 {

	public static void main(String[] args) {
		EmpDAO Five=new EmpDAO();
		List<EmpDTO>list=Five.FivePrint();
		System.out.print("직급\t\t최대월급\t최소월급\t\n");
		for(EmpDTO Job:list) {
			if(Job.getJob().length()>7) {
				System.out.print(Job.getJob()+"\t");
			}else {
				System.out.print(Job.getJob()+"\t"+"\t");
			}
			System.out.print(Job.getMax()+"\t");
			System.out.print(Job.getMin()+"\n");
		}
		System.out.print("월급 2000미만 그룹 제외");
	}

}
