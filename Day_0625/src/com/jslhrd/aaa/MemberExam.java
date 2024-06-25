package com.jslhrd.aaa;

import java.util.*;



public class MemberExam {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		List<Member> mem=new ArrayList<Member>();
		Member mems=null;
		int cnt=0;
		while(true) {
			System.out.print("자료입력:");
			String str[]=input.nextLine().split(",");
			if(str[0].equalsIgnoreCase("end")) {
				break;
			}
			String years=str[1].substring(0,2);
			String Month=str[1].substring(2,4);
			String day=str[1].substring(4,6);
			String genders=str[1].substring(7);
			String gen="남성";
			if(genders.equalsIgnoreCase("2")) {
				gen="여성";
			}
			if(Integer.parseInt(years)>20) {
				years="19"+years;
				
			}else {
				years="20"+years;
				
			}
			int age=2024-Integer.parseInt(years);
			
			mems = new Member(str[0],Integer.parseInt(years),Integer.parseInt(Month),Integer.parseInt(day),str[2],gen,age);
			mem.add(mems);
			
			cnt++;
		}
		System.out.print("이름\t년\t월\t일\t전화번호\t성별\t나이\n");
		for (int i = 0; i < mem.size(); i++) {
			Member one = mem.get(i);
			System.out.print(one.getName() + "\t");
			System.out.print(one.getYear() +"년"+ "\t");
			System.out.print(one.getMonth() +"월"+ "\t");
			System.out.print(one.getDay() +"일"+ "\t");
			System.out.print(one.getHandnumber() + "\t");
			System.out.print(one.getGender() + "\t");
			System.out.print(one.getAge() + "\n");
		}
		System.out.print("총인원"+cnt + "\n");

	}

}
