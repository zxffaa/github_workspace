package com.jslhrd.exam;

import java.text.DecimalFormat;
import java.util.*;

import com.jslhrd.model.*;

public class Exam_05 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String year=input.next();
		int cnt=0;
		if(year.length()>2) {
			year=year.substring(2,4);
		}
		EmpDAO one=new EmpDAO();
		List<EmpDTO>list=one.AllInOne(year);
		DecimalFormat df=new DecimalFormat("#,###");
		if(list.size()==0) {
			System.out.println("해당 사원은 없습니다");
		}else {
			System.out.print("번호\t이름\t업무명\t\t급여\t부서명\n");
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i).getEno()+"\t");
				System.out.print(list.get(i).getEname()+"\t");
				if(list.get(i).getJob().length()>7) {
					System.out.print(list.get(i).getJob()+"\t");
				}else {
					System.out.print(list.get(i).getJob()+"\t"+"\t");
				}
				System.out.print(df.format(list.get(i).getSalary())+"\t");
				switch(list.get(i).getDno()) {
				case 10:
					System.out.print("전산부");
					break;
				case 20:
					System.out.print("총무부");
					break;
				case 30:
					System.out.print("인사부");
					break;
				case 40:
					System.out.print("경영부");
					break;
				default:
					break;
				}
				System.out.println();
				cnt++;
			}
			if(year.length()<3) {
				System.out.print("19"+year+"년도 총 입사원수:"+cnt);
			}else {
				System.out.print(year+"년도 총 입사원수:"+cnt);
			}
			
		}
	}

}
