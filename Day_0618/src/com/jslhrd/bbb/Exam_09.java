package com.jslhrd.bbb;

import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("자료입력:");
		String str = scn.nextLine();
		String arr[] = str.split(",");
		//String arr[] = scn.nextLine().split(",");
	
		String name = arr[0];
		String birth = arr[1];
		String Phone = arr[2];
		String strBirth = birth.substring(0,4)+"년" + 
				birth.substring(4,6)+"월" + 
				birth.substring(6)+"일";
		int age = 2024-Integer.parseInt(birth.substring(0,4));
		String gender = birth.substring(0,4);
		String strGender ="여자";
		if(gender.equalsIgnoreCase("0")) {
			strGender ="남자";
		}
	
		
		System.out.println("이름\t생년월일\t\t나이\t성별\t급여");
		System.out.print(name + "\t");
		System.out.print(strBirth+"\t" + age + "\t");
		System.out.print(strGender+"\t" +"\n");
	}
}
