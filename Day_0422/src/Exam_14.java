//문자열 비교

import java.util.Scanner;

public class Exam_14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("문자열 입력:");
		String s = scn.next();
		System.out.println("입력된 문자열 : " + s);
		if(s=="Korea") {
			System.out.print("OK");
		}else {
			System.out.print("NO");
		}
		if(s.equals("Korea")) {
			System.out.print("OK");
		}else {
			System.out.print("NO");
		}
		//s.equalsIgnoreCase("korea");// 대소문자 구분 없음
	}

}
