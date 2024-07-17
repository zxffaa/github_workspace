package com.jslhrd.emp.exam;

import java.text.DecimalFormat;
import java.util.List;

import com.jslhrd.emp.model.*;

public class Exam_06 {

	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("#,###");
		EmpDAO Six = new EmpDAO();
		List<EmpDTO> list = Six.SixPrint();
		System.out.print("부서번호\t부서명\t\t사원수\t평균급여\n");
		for (EmpDTO dept : list) {
			System.out.print(dept.getDno()+"\t");
			switch (dept.getDno()) {
			case 10:
				System.out.print("ACCOUNTING" + "\t");
				break;
			case 20:
				System.out.print("RESERCH" + "\t\t");
				break;
			case 30:
				System.out.print("SALES" + "\t\t");
				break;
			case 40:
				System.out.print("OPERATION" + "\t");
				break;
			default:
				System.out.print("없는부서입니다" + "\t");
				break;
			}
			System.out.print(dept.getCnt()+"\t");
			System.out.print(df.format((int)dept.getAvg())+"\n");
		}

	}

}
