package com.jslhrd.exam;

import java.util.*;

import com.jslhrd.model.*;

public class Exam_02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("검색할 사원이름:");
		String IN=input.next().toUpperCase();
		System.out.println();
		EmpDAO out=new EmpDAO();
		List<EmpDTO>list=out.SawonNameSerch(IN);
		if(list.size()==0) {
			System.out.println("비어있습니다");
		}else {
			System.out.print("사원번호\t이름\n");
			for(int i=0;list.size()>i;i++) {
				System.out.print(list.get(i).getEno()+"\t");
				System.out.print(list.get(i).getEname()+"\n");
			}
		}

	}

}
