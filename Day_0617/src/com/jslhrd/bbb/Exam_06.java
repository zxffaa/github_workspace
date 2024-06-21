package com.jslhrd.bbb;

public class Exam_06 {

	public static void main(String[] args) {
		//문자열이 같아서 가르키는 주소도 같다
		String str1="Korea"; 
		String str2="Korea";
		// new를 쓰면 객체가 생성되서 주소가 다름
		String str3=new String("Korea");
		int len=str1.length();
		System.out.println(len);
		System.out.println("123456789".length());
		//문자열을 소문자로, 대문자로
		System.out.println("소문자로:"+str1.toLowerCase());
		System.out.println("대문자로:"+str1.toUpperCase());
		
		//1개의 문자씩 분리=charAt
		for(int i=0;i<len;i++) {
			System.out.println(str1.charAt(i));
		}
		String k=str2.substring(0,5);
		System.out.println("k:"+k);
	}

}
