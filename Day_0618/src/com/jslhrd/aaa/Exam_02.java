package com.jslhrd.aaa;

public class Exam_02 {
	// 문자열 결합:concat()
	public static void main(String[] args) {
		String str = "";
		for (int i = 1; i <= 5; i++) {
			str += i;// str=str+1;
		}
		System.out.println("str=" + str);
		String str2 = "12345";
		String str3 = str2.concat(":54321");
		System.out.println("str3=" + str3);
		String str4= "";
		for (int i = 1; i <= 5; i++) {
			str4=str.concat(""+i);
		}
		System.out.println("str4=" + str4);
	}

}
