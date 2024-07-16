package com.jslhrd.exam;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.model.*;

public class Exam_04 {

	public static void main(String[] args) {
		System.out.print("급여입력:");
		Scanner input=new Scanner(System.in);
		int Money=input.nextInt();
		int Allmoney=0;
		EmpDAO SalaryMO=new EmpDAO();
		List<EmpDTO> SalaryMOR=SalaryMO.SalaryMore(Money);
		DecimalFormat df=new DecimalFormat("#,###");
				
		if(SalaryMOR.size()==0) {
			System.out.println("등록된사원없음");
		}else {
			System.out.print("번호\t이름\t입사년도\t\t급여\t\n");
			for(EmpDTO All:SalaryMOR) {
				System.out.print(All.getEno()+"\t");
				System.out.print(All.getEname()+"\t");
				System.out.print(All.getHiredate().substring(0, 4)+"년"+All.getHiredate().substring(5, 7)+"월"+All.getHiredate().substring(8, 10)+"일"+"\t");
				System.out.print(df.format(All.getSalary())+"\t");
				System.out.println();
				Allmoney=Allmoney+All.getSalary();
			}
		}
		System.out.print("총금액:"+df.format(Allmoney));
	}

}
