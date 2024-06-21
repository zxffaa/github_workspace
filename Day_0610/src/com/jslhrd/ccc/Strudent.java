package com.jslhrd.ccc;

public class Strudent {
	private String hakbun=""; //학번
	private String name="";//이름
	private String gender="";//성별(M:남자,F:여자)
	private int score=0;//점수
	
	public Strudent() {}
	public Strudent(String hakbun,String name,String gender,int score) {
		this.hakbun=hakbun;
		this.name=name;
		this.gender=gender;
		this.score=score;
	}
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void stuPrint() {
		System.out.print(hakbun + "\t");
	    System.out.print(name + "\t");
	    if(gender.equalsIgnoreCase("m")) {
	    	System.out.print("남자" + "\t");
	    }else {
	    	System.out.print("여자" + "\t");
	    }
	    System.out.print(score + "\n");
	}

}
