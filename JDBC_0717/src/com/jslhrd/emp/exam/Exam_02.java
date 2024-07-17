package com.jslhrd.emp.exam;

import java.text.*;
import java.util.*;

import com.jslhrd.emp.model.*;

public class Exam_02 {

	public static void main(String[] args) {
		System.out.print("찾고자하는 사원번호를 입력해주세요:");
		Scanner input = new Scanner(System.in);
		int SawonNum = input.nextInt();
		EmpDAO Two = new EmpDAO();
		DecimalFormat df = new DecimalFormat("#,###");

		
		if (Two.TwoPrint(SawonNum).getEname() == null) {
			System.out.print("등록된사원이 없습니다");
		} else {
			System.out.print("사원번호\t이름\t직무\t고용날자\t\t급여\n");
			System.out.print(Two.TwoPrint(SawonNum).getEno() + "\t");
			System.out.print(Two.TwoPrint(SawonNum).getEname() + "\t");
			System.out.print(Two.TwoPrint(SawonNum).getJob() + "\t");
			System.out.print(Two.TwoPrint(SawonNum).getHiredate().substring(2, 4) + "년"
					+ Two.TwoPrint(SawonNum).getHiredate().substring(5, 7) + "월"
					+ Two.TwoPrint(SawonNum).getHiredate().substring(8, 10) + "일" + "\t");
			System.out.print(df.format(Two.TwoPrint(SawonNum).getSalary()) + "\t");
			System.out.println();
		}

	}
}
