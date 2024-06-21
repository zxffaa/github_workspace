package com.jslhrd.bbb;

import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("사원입력:");
		String str = scn.nextLine();
		String arr[] = str.split(",");
		String a="",strGender="";
		//String arr[] = scn.nextLine().split(",");

		String name = arr[0];
		String birth = arr[1];
		String strBirth = birth.substring(0,2)+"년" + 
				birth.substring(3,4)+"월" + 
				birth.substring(5,6)+"일";
		String gender = birth.substring(7,8);
		int agetest=Integer.parseInt(birth.substring(0,2));
		if(agetest>10) {
			a="19"+Integer.toString(agetest);
		}else {
			a="20"+Integer.toString(agetest);
		}
		int age = 2024-Integer.parseInt(a);
		if(gender.equalsIgnoreCase("9")||gender.equalsIgnoreCase("1")||gender.equalsIgnoreCase("3")) {
			strGender ="남자";
		}else if(gender.equalsIgnoreCase("5")||gender.equalsIgnoreCase("7")) {
			strGender ="외국인 남자";
		}else if(gender.equalsIgnoreCase("6")||gender.equalsIgnoreCase("8")) {
			strGender ="외국인 여성";
		}else {
			strGender ="여자";
		}
		
		System.out.println("이름\t생년월일\t\t나이\t성별");
		System.out.print(name +"\t"+strBirth+"\t" +"\t" + age + "\t"+strGender+"\n");
		
	}
}



