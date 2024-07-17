package com.jslhrd.emp.exam;

import java.text.*;
import java.util.*;

import com.jslhrd.emp.model.*;

public class Exam_01 {

	public static void main(String[] args) {
		EmpDAO First=new EmpDAO();
		List<EmpDTO>list=First.FirstPrint();
		DecimalFormat df=new DecimalFormat("#,###");
		int totSalary=0;
		if (list.size()==0) {
			System.out.print("등록된사원이 없습니다");
		}else {
			System.out.print("사원번호\t이름\t직무\t\t고용날자\t\t급여\n");
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i).getEno()+"\t");
				System.out.print(list.get(i).getEname()+"\t");
				
				if(list.get(i).getJob().length()>7) {
					System.out.print(list.get(i).getJob()+"\t");	
				}else {
					System.out.print(list.get(i).getJob()+"\t"+"\t");
				}
				System.out.print(list.get(i).getHiredate().substring(2, 4)+"년"+list.get(i).getHiredate().substring(5, 7)+"월"+list.get(i).getHiredate().substring(8, 10)+"일"+"\t");	
				System.out.print(df.format(list.get(i).getSalary())+"\t");
				totSalary+=list.get(i).getSalary();
				System.out.println();
			}
			System.out.print("총 급여합계:"+df.format(totSalary));
		}
		
	}

}
