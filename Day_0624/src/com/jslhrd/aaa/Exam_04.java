package com.jslhrd.aaa;

import java.util.*;

class person {
	private int bun;// 번호
	private String name;// 이름
	private String gender;// 성별(M/F)

	person() {
	}

	person(int bun, String name, String gender) {
		this.bun = bun;
		this.name = name;
		this.gender = gender;
	}

	public int getBun() {
		return bun;
	}

	public void setBun(int bun) {
		this.bun = bun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}

public class Exam_04 {

	public static void main(String[] args) {
		List<person> pList = new ArrayList();
		person p = new person();
		p.setBun(1101);
		p.setName("김학생");
		p.setGender("M");
		pList.add(p);
		
		p = new person(1102,"이학생","F");
		pList.add(p);
		
		pList.add(new person(1103,"오학생", "F"));
		pList.add(new person(1104,"유학생", "M"));
		pList.add(new person(1105,"강학생", "M"));
		
		//확인
		System.out.println("pList : " + pList);
		
		//기본 for()
		for(int i=0; i<pList.size();i++) {
			person  pr = pList.get(i);
			System.out.print(pr.getBun()+ "\t");
			System.out.print(pr.getName()+ "\t");
			System.out.print(pr.getGender()+ "\n");
		}
		System.out.println("--------------------확장 for()------------");
		for(person pp:pList) {
		
			System.out.print(pp.getBun()+ "\t");
			System.out.print(pp.getName()+ "\t");
			System.out.print(pp.getGender()+ "\n");
		}
		System.out.println("--------------------반복자 Iterator------------");
		Iterator<person>iter =pList.iterator();
		while(iter.hasNext()) {
			person it=iter.next();
			System.out.print(it.getBun()+"\t");
			System.out.print(it.getName()+"\t");
			System.out.print(it.getGender()+"\n");
		}
	}
}
