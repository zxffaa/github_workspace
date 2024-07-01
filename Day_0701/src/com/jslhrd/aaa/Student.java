package com.jslhrd.aaa;

public class Student {
	private int bun;
	private String name;
	private int KOR;
	private int ENG;
	private int MATH;
	private int tot;
	private int ave;
	private String grade;
	Student(){}
	Student(int bun,String name,int KOR,int ENG,int MATH,int tot,int ave,String grade){
		this.bun=bun;
		this.name=name;
		this.KOR=KOR;
		this.ENG=ENG;
		this.MATH=MATH;
		this.tot=tot;
		this.ave=ave;
		this.grade=grade;
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
	public int getKOR() {
		return KOR;
	}
	public void setKOR(int kOR) {
		KOR = kOR;
	}
	public int getENG() {
		return ENG;
	}
	public void setENG(int eNG) {
		ENG = eNG;
	}
	public int getMATH() {
		return MATH;
	}
	public void setMATH(int mATH) {
		MATH = mATH;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public int getAve() {
		return ave;
	}
	public void setAve(int ave) {
		this.ave = ave;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
