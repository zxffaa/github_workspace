package com.jslhrd.ccc;

import java.io.Serializable;

public class Student implements Serializable{
	private int bun;
	private String name;
	private int KOR;
	private int ENG;
	private int math;
	private int tot;
	private double ave;
	private String grade;
	
	Student(){}
	Student(int bun,String name,int KOR,int ENG,int math,int tot,double ave,String grade){
		this.bun=bun;
		this.name=name;
		this.KOR=KOR;
		this.ENG=ENG;
		this.math=math;
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
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAve() {
		return ave;
	}
	public void setAve(double ave) {
		this.ave = ave;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public int hashCode() {
		return bun;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return bun==s.bun;
		}else {
			return false;
		}
	}
}
