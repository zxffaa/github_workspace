package com.jslhrd.ddd;

import java.util.Scanner;

public class CalExam implements Cal {
	
	public void First_print() {
		System.out.println("계산기");
		System.out.println("[(1)더하기]");
		System.out.println("[(2)빼기]");
		System.out.println("[(3)곱하기]");
		System.out.println("[(4)나누기]");
		System.out.println("[(5)나머지]");
		System.out.print("계산방법입력:");
	}
	
	public int End_print() {
		Scanner input=new Scanner(System.in);
		System.out.print("끝내시겠습니까?");
		String bin=input.next();
		if(bin.equals("Yes")) {
			return 1;
		}else {
			return 0;
		}
	}
	
	@Override
	public void add(int a, int b) {
		int sum=a+b;
		System.out.printf("%d+%d=%d\n",a,b,sum);
	}
	//추가(n개의 데이터 덧셈)
	public void addMulti(int ...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=a[i]+sum;
			if(i==a.length-1) {
				System.out.print(a[i]+"=");
			}else {
				System.out.print(a[i]+"+");
			}
		}
		System.out.println(sum);
	}
	
	public void addsub(int ...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=a[i]-sum;
			if(i==a.length-1) {
				System.out.print(a[i]+"=");
			}else {
				System.out.print(a[i]+"-");
			}
		}
		System.out.println(sum);
	}
	
	public void addmul(int ...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=a[i]*a[i+1];
			if(i==a.length-1) {
				System.out.print(a[i]+"=");
			}else {
				System.out.print(a[i]+"*");
			}
		}
		System.out.println(sum);
	}
	
	@Override
	public void sub(int a, int b) {
		int sum=a-b;
		System.out.printf("%d+%d=%d\n",a,b,sum);

	}

	@Override
	public void mul(int a, int b) {
		int sum=a+b;
		System.out.printf("%d+%d=%d\n",a,b,sum);
	}

	@Override
	public void div(int a, int b) {
		if(b==0) {
			System.out.println("잘못입력하셨습니다");
		}else {
			int sum=a/b;
			System.out.printf("%d/d=%d\n",a,b,sum);

		}
	}

	@Override
	public void rem(int a, int b) {
		if(b==0) {
			System.out.println("잘못입력하셨습니다");
		}else {
			int sum=a%b;
			System.out.printf("%d%d=%d\n",a,b,sum);

		}

	}

}
