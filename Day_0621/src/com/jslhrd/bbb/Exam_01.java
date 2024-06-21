package com.jslhrd.bbb;

import java.io.*;
import java.util.*;

public class Exam_01 {

	public static void main(String[] args)throws Exception {
		Scanner input=new Scanner(new File("src/student.txt"));
		StringTokenizer str=null;
		int cnt = 0,all=0;
		int ktot = 0, etot = 0, mtot = 0, ttot = 0,jtot=0,max=0,min=0;
		while(input.hasNextLine()) {
			int tot=0;
			double AVE=0;
			int Score[]=new int[5];
			String line=input.nextLine();
			str=new StringTokenizer(line,", ");
			int bun=Integer.parseInt(str.nextToken());
			String name=str.nextToken();
			/**
			 * 
			int Score1=Integer.parseInt(str.nextToken());
			int Score2=Integer.parseInt(str.nextToken());
			int Score3=Integer.parseInt(str.nextToken());
			int Score4=Integer.parseInt(str.nextToken());
			int Score5=Integer.parseInt(str.nextToken());
			*/
			for(int i=0;i<5;i++) {
				Score[i]=Integer.parseInt(str.nextToken());
				tot=Score[i]+tot;
			}
			Student stu=new Student();
			stu.setBun(bun);
			stu.setName(name);
			stu.setScore(Score);
			process(stu);
		}
		System.out.println("전체총점 : \t" + ktot + "\t" + etot + "\t" + mtot + "\t" + ttot+"\t"+ jtot+"\t"+ ttot+"\t");
		System.out.print("전체평균 : \t");
		System.out.print(String.format("%.1f", (double) ktot / cnt) + "\t");
		System.out.print(String.format("%.1f", (double) etot / cnt) + "\t");
		System.out.print(String.format("%.1f", (double) mtot / cnt) + "\t");
		System.out.print(String.format("%.1f", (double) ttot / cnt) + "\t");
		System.out.print(String.format("%.1f", (double) jtot / cnt) + "\t");
		System.out.print(String.format("%.1f", (double) all / (cnt * 6)) + "\n");
		
	}
	static void process(Student stu) {
		//최대, 최소, 합계, 평균
		int max = stu.getScore()[0], min = stu.getScore()[0], sum = stu.getScore()[0];
		for(int i=1; i<5; i++) {
			if(max < stu.getScore()[i])
				max = stu.getScore()[i];
			else if(min > stu.getScore()[i])
				min=stu.getScore()[i];
			sum += stu.getScore()[i];
		}
		sum = sum - max - min;
		double ave = sum / 3.0;
		//출력
		System.out.print(stu.getBun() + "\t" + stu.getName() + "\t");
		for(int i=0; i<5; i++) {
			System.out.print(stu.getScore()[i] + "\t");
		}
		System.out.print(max + "\t" + min + "\t");
		System.out.print(sum + "\t" + String.format("%.2f", ave) + "\n");
	}

}
