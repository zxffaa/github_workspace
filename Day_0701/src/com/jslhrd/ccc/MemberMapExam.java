package com.jslhrd.ccc;

import java.io.*;
import java.util.*;

public class MemberMapExam{

	public static void main(String[] args)throws Exception{
		Scanner input = new Scanner(new File("src/Member.txt"));
		Map<Integer,Member> meme=new HashMap();
		String name="",Phone="",gen="",join="",grade="",code="",year="",month="",day="",joindata="";
		int bun=0;
		while(input.hasNextLine()) {
			String[] str = input.nextLine().split(",");
			bun=Integer.parseInt(str[0]);
			name=str[1];Phone=str[2];gen=str[3];join=str[4];grade=str[5];code=str[6];
			year=join.substring(0,4);
			month=join.substring(4,6);
			day=join.substring(6,8);
			joindata=year+"년"+month+"월"+day+"일";
			if(gen.equalsIgnoreCase("M")) {
				gen="남성";
			}else {
				gen="여성";
			}
			if(grade.equalsIgnoreCase("A")) {
				grade="VIP";
			}else if(grade.equalsIgnoreCase("B")) {
				grade="일반";
			}else {
				grade="직원";
			}
			if(code.equals("01")) {
				code="서울";
			}else if(code.equals("02")) {
				code="경기";
			}else {
				code="제주";
			}
			meme.put(bun, new Member(name, Phone, gen, joindata,grade,code));
		}
		System.out.print("회원번호\t회원성명\t연락처\t\t성별\t가입일자\t\t고객등급\t거주지역\n");
		Set<Map.Entry<Integer, Member>> keySet = meme.entrySet();
		Iterator<Map.Entry<Integer, Member>> iter = keySet.iterator();
		while(iter.hasNext()) {
			Map.Entry<Integer, Member> entry = iter.next();
			System.out.print(entry.getKey()+"\t");
			System.out.print(entry.getValue().getName()+"\t");
			System.out.print(entry.getValue().getPhone()+"\t");
			System.out.print(entry.getValue().getGender()+"\t");
			System.out.print(entry.getValue().getJoindata()+"\t");
			System.out.print(entry.getValue().getGrade()+"\t");
			System.out.print(entry.getValue().getCitycode()+"\n");
		}
	}
}
