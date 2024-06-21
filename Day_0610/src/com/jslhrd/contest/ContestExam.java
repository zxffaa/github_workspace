package com.jslhrd.contest;

import java.util.Scanner;



public class ContestExam {

	public static void main(String[] args) {
		ContestProcess Main=new ContestProcess();
		Scanner input=new Scanner(System.in);
		boolean sw=true;
		int a=0;
		while(sw){
			System.out.println("<<학생관리프로그램>>");
			System.out.println("[1]학생등록");
			System.out.println("[2]입력자료순 출력");
			System.out.println("[3]성적순출력");
			System.out.println("[4]프로그램종료");
			System.out.print("메뉴선택:");
			a=input.nextInt();
			switch(a) {
			case 1:
				Main.input_s();
				break;
			case 2:
				Main.print();
				break;
			case 3:
				break;
			case 4:
				sw=false;
				break;
			default:
				System.out.println("잘못입력하셨습니다");
				break;
			}
		}

	}

}
