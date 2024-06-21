package com.jslhrd.ccc;
import java.util.Scanner;

public class StudentProcess {
	Scanner input=new Scanner(System.in);
	Strudent aa1[]=new Strudent[10];
	int i=0,k=0,cnt=0;
	void input_s() {
		for(i=0;i<10;i++) {
			aa1[i]=new Strudent();
			System.out.print("등록:");
			String bun=input.next();
			if(bun.equals("0000")) {
				i--;
				break;
			}
			String Name=input.next();
			String Gen=input.next();
			int Scores=input.nextInt();
			aa1[i].setHakbun(bun);
			aa1[i].setName(Name);
			aa1[i].setGender(Gen);
			aa1[i].setScore(Scores);
		}
	}
	void print() {
		System.out.print("학번\t이름\t성별\t점수\n");
		for(k=0;k<10;k++) {
			aa1[k]=new Strudent();
			aa1[k].stuPrint();
		}
	}
	
}
