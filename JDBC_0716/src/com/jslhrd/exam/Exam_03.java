package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.model.EmpDAO;
import com.jslhrd.model.EmpDTO;

public class Exam_03 {

	public static void main(String[] args) {
		EmpDAO DeptSawonCount=new EmpDAO();
		List<EmpDTO>list=DeptSawonCount.SawonDeptCount();
		System.out.println("부서명|사원수");
		int cnt=0;
		for(EmpDTO all:list) {
			switch(all.getDno()) {
			case 10:
				System.out.print("전산부:");
				break;
			case 20:
				System.out.print("총무부:");
				break;
			case 30:
				System.out.print("인사부:");
				break;
			case 40:
				System.out.print("경영부:");
				break;
			default:
				break;
			}
			System.out.print(all.getDnocount()+"명");
			System.out.println();
			cnt=cnt+all.getDnocount();
		}
		System.out.print("총 인원수:"+cnt+"명");
	}
}
