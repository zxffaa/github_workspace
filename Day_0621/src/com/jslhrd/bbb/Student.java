package com.jslhrd.bbb;

public class Student { //사용자 정의 데이터 타입=클래스
	//매개변수와 setter/getter만 있는 파일은 데이터파일을 주고받는 용도이다 
	//JavaBeans(약자:Beans),ValueObject(약자:VO),DataTransforObject(약자:DTO)
	private int bun;
	private String name;
	//private int score[]=new int[5]
	private int score[];

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

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}
}
