package com.jslhrd.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.model.*;

//키보드로 사원번호 입력 입력된 사원번화 같은 같은부서에 근무하는 사원의
//번호 이름 업무(직급) 입사일자 급여를 출력
public class Exam_01 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("사원번호 입력:");
		EmpDAO Exam01=new EmpDAO();
		int IN=input.nextInt();
		List<EmpDTO>list=Exam01.getExam01(IN);
		if(list.size()==0) {
			System.out.println("비어있습니다");
		}else {
			System.out.print("번호\t이름\t업무\t입사일\t\t급여\n");
			for(EmpDTO all:list) {
				System.out.print(all.getEno()+"\t");
				System.out.print(all.getEname()+"\t");
				System.out.print(all.getJob()+"\t");
				System.out.print(all.getHiredate().substring(0, 10)+"\t");
				System.out.print(all.getSalary()+"\n");
			}
		}
	}

}
