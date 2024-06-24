package com.jslhrd.ccc;

public class student {
	private int bun;
	private String name;// 이름
	private int KOR;
	private int ENG;
	private int MATH;
	private int tot;
	private double ave;
	private String Score;
	student(){}
	student(int bun,String name,int KOR,int ENG,int MATH,int tot,double ave,String Score){
		this.bun=bun;
		this.name=name;
		this.KOR=KOR;
		this.ENG=ENG;
		this.MATH=MATH;
		this.tot=tot;
		this.ave=ave;
		this.Score=Score;
	}
	public String getScore() {
		return Score;
	}
	public void setScore(String score) {
		Score = score;
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
	public double getAve() {
		return ave;
	}
	public void setAve(double ave) {
		this.ave = ave;
	}
	

}
