package com.jslhrd.bbb;

public class Score {
	private int kor,eng,mat,tot,ave;
	public Score() {}
	public Score(int kor,int eng,int mat,int tot,int ave) 
	{this.ave=ave;this.eng=eng;this.kor=kor;this.mat=mat;this.tot=tot;}
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
	
}
