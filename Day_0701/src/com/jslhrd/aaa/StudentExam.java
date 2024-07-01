package com.jslhrd.aaa;
import java.io.*;
import java.util.*;
public class StudentExam {

	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(new File("src/data.txt"));
		int tot=0,ktot=0,etot=0,mtot=0;
		String bin="";
		List<Student> list=new ArrayList<Student>();
		Student stu=null;
		while(input.hasNextLine()) {
			//String line=input.nextLine();
			String str[]=input.nextLine().split(",");
			int bun=Integer.parseInt(str[0]);
			String name=str[1];
			int kor=Integer.parseInt(str[2]);
			int eng=Integer.parseInt(str[3]);
			int mat=Integer.parseInt(str[4]);
			tot=kor+eng+mat;
			double ave=tot/3.;
			double aa=Math.round(ave);
			int a=(int)aa;
			if(a>90) {
				bin="A";
			}else if(a>80) {
				bin="B";
			}else if(a>70) {
				bin="C";
			}else if(a>60) {
				bin="D";
			}else {
				bin="F";
			}
			stu=new Student(bun,name,kor,eng,mat,tot,a,bin);
			list.add(stu);
		}
		System.out.print("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급\n");
		for(int i=0;i<list.size();i++) {
			Student stu1=list.get(i);
			System.out.print(stu1.getBun()+"\t");
			System.out.print(stu1.getName()+"\t");
			System.out.print(stu1.getKOR()+"\t");
			System.out.print(stu1.getENG()+"\t");
			System.out.print(stu1.getMATH()+"\t");
			System.out.print(stu1.getTot()+"\t");
			System.out.print(stu1.getAve()+"\t");
			System.out.print(stu1.getGrade()+"\n");
			ktot+=stu1.getKOR();
			etot+=stu1.getENG();
			mtot+=stu1.getMATH();
		}
		System.out.print(ktot+"\t");
		System.out.print(etot+"\t");
		System.out.print(mtot+"\n");
		System.out.print((ktot/list.size())+"\t");
		System.out.print((etot/list.size())+"\t");
		System.out.print((mtot/list.size())+"\n");
	}
	/* 강사님식 총점,평균,등급 계산식
	//개인별 총점,평균,등급 계산
	for(int i=0; i<sList.size();i++) {
		sList.get(i).setTot(sList.get(i).getKor() + 
							sList.get(i).getKor() + 
							sList.get(i).getKor());
		sList.get(i).setAve(sList.get(i).getTot()/3.0);
		//등급계산
		
	}
*/		

}
