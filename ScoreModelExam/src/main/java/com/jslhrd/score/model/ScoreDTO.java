package com.jslhrd.score.model;

public class ScoreDTO {
	private String hakbun;
	private String gender;
	private String name;
	private String clases;
	private int kor;
	private int eng;
	private int mat;
	private int kortot;
	private int engtot;
	private int mattot;
	
	private double koravg;
	private double engavg;
	private double matavg;
	
	private int sum;
	private int avg;
	
	public int getKortot() {
		return kortot;
	}
	public void setKortot(int kortot) {
		this.kortot = kortot;
	}
	public int getEngtot() {
		return engtot;
	}
	public void setEngtot(int engtot) {
		this.engtot = engtot;
	}
	public int getMattot() {
		return mattot;
	}
	public void setMattot(int mattot) {
		this.mattot = mattot;
	}
	public double getKoravg() {
		return koravg;
	}
	public void setKoravg(double koravg) {
		this.koravg = koravg;
	}
	public double getEngavg() {
		return engavg;
	}
	public void setEngavg(double engavg) {
		this.engavg = engavg;
	}
	public double getMatavg() {
		return matavg;
	}
	public void setMatavg(double matavg) {
		this.matavg = matavg;
	}
	public String getClases() {
		return clases;
	}
	public void setClases(String clases) {
		this.clases = clases;
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
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
}
