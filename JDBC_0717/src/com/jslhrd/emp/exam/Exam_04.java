package com.jslhrd.emp.exam;

import java.util.*;

import com.jslhrd.emp.model.*;

public class Exam_04 {

	public static void main(String[] args) {
		EmpDAO Four=new EmpDAO();
		List<EmpDTO>list=Four.FourPrint();
		int CntAll=0;
		System.out.print("부서번호\t총인원\t부서평균월급\n");
		for(EmpDTO Sawon:list) {
			System.out.print(Sawon.getEno()+"\t");
			System.out.print(Sawon.getCnt()+"\t");
			System.out.print(Sawon.getAvg()+"\n");
			CntAll+=Sawon.getCnt();
		}
		System.out.print("총사원수:"+CntAll);

	}

}
