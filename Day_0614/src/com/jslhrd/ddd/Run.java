package com.jslhrd.ddd;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Cal cal = new CalExam();
		CalExam cx = new CalExam();
		Scanner input = new Scanner(System.in);
		int number, a, b, cnt = 0;
		String bin = "";
		int k[] = new int[10];
		boolean sw = true;
		while (sw) {
			cx.First_print();
			number = input.nextInt();
			switch (number) {
			case 1:
				System.out.print("두개 이상더할겁니까?(Yes/No)");
				bin = input.next();
				if (bin.equals("Yes")) {
					for (int i = 0; i < k.length; i++) {
						k[i] = input.nextInt();
					}
					cx.addMulti(k);
				} else {
					System.out.print("점수입력:");
					a = input.nextInt();
					b = input.nextInt();
					cx.add(a, b);
				}
				if (1 == cx.End_print()) {
					sw = false;
				}
				break;
			case 2:
				System.out.print("두개 뺼겁니까?(Yes/No)");
				bin = input.next();
				if (bin.equals("Yes")) {
					for (int i = 0; i < k.length; i++) {
						k[i] = input.nextInt();
					}
					cx.addsub(k);
				} else {
					System.out.print("점수입력:");
					a = input.nextInt();
					b = input.nextInt();
					cx.sub(a, b);
				}
				if (1 == cx.End_print()) {
					sw = false;
				}
				break;
			case 3:
				System.out.print("두개 곱할겁니까?(Yes/No)");
				bin = input.next();
				if (bin.equals("Yes")) {
					for (int i = 0; i < k.length; i++) {
						k[i] = input.nextInt();
					}
					cx.addmul(k);
				} else {
					System.out.print("점수입력:");
					a = input.nextInt();
					b = input.nextInt();
					cx.mul(a, b);
				}
				if (1 == cx.End_print()) {
					sw = false;
				}
				break;
			case 4:
				a = input.nextInt();
				b = input.nextInt();
				cx.div(a, b);
				if (1 == cx.End_print()) {
					sw = false;
				}
				break;
			case 5:
				a = input.nextInt();
				b = input.nextInt();
				cx.rem(a, b);
				if (1 == cx.End_print()) {
					sw = false;
				}
				break;
			default:
				System.out.print("번호를 잘못입력했습니다");
				break;
			}

		}

	}

}
