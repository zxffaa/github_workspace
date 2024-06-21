package com.jslhrd.aaa;

public class Exam_01 {

	public static void main(String[] args) {
		String str="Korea-Daejeng-JSKHRD";
		//문자열 길이
		int size=str.length();
		System.out.println("문자열 길이:"+size);
		//문자열 위치:indexOf(문자 또는 문자열) 찿으면 위치 못찾으면 -1
		System.out.println("D문자의 위치:"+str.indexOf('D'));
		System.out.println("JSL문자의 위치:"+str.indexOf("JSL"));
		//찾을떄 첫번쨰 문자를 먼져 찾음
		int n=str.indexOf('a');
		System.out.print("a문자의 위치:"+n);
		//지정된 위치부터 검색
		System.out.println("a문자의 위치:"+str.indexOf('a',5));
	}
}
