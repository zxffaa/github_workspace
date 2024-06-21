package com.jslhrd.aaa;

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
			ktot=ktot+Score[0];
			etot=etot+Score[1];
			mtot=mtot+Score[2];
			ttot=ttot+Score[3];
			jtot=jtot+Score[4];
			all=ktot+etot+mtot+ttot+jtot;
			AVE=tot/5.;
			max=Score[1];
			for(int i=0;i<5;i++) {
				if(max<Score[i]) {
					max=Score[i];
				}else {
					min=Score[i];
				}
			}
			cnt++;
			System.out.print(bun + "\t" + name + "\t"+Score[0]+"\t"+Score[1]+"\t"+Score[2]+"\t"+Score[3]+"\t"+Score[4]+"\t"+max+"\t"+min+"\t"+tot+"\t");
			System.out.print(String.format("%.1f", AVE) +"\n");
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

}
