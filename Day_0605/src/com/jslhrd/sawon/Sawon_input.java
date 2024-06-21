package com.jslhrd.sawon;
import java.util.Scanner;

public class Sawon_input {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Sawon_calculator[] a = new Sawon_calculator[10];
		String name="",gen="";
		int number=0,num=0,time=0;
		boolean sw=true;
		int cnt=0;
		while(sw) {
			a[cnt] = new Sawon_calculator();
			number=input.nextInt();
			if(number==9999) {
				break;
			}
			name=input.next();
			gen=input.next();
			num=input.nextInt();
			time=input.nextInt();
			a[cnt].number=number;
			a[cnt].name=name;
			a[cnt].gen=gen;
			a[cnt].num=num;
			a[cnt].time=time;
			cnt++;
			if(cnt==9) {
				sw=false;
			}
		}
		System.out.print("사원번호\t이름\t성별\t등급\t시급\t근무시간\t주간급여\t\n");
		for(int i=0;i<cnt;i++) {
		
			System.out.printf("%d",a[i].num);
			System.out.printf("%s",a[i].name);
			System.out.printf("%s",a[i].gen);
			System.out.printf("%d",a[i].number);
			System.out.printf("%d",a[i].count);
			System.out.printf("%d",a[i].time);
			System.out.printf("%d",a[i].tot);
		}
		Sawon_calculator s = new Sawon_calculator(a);
		System.out.print(s.tot);
		
	}

}
