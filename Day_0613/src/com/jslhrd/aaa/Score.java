package com.jslhrd.aaa;

public class Score extends Student {

	int kor = 0, eng = 0, mat = 0, tot = 0;

	public Score(int bun, String name, int kor, int eng, int mat) {
		super(bun, name);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot = kor + eng + mat;
	}

	void scorePrint() {
		System.out.print(bun + "\t" + name + "\t");
		System.out.print(kor + "\t" + eng + "\t");
		System.out.print(mat + "\t" + tot + "\n");
	}

	void scorePrint2() {
		super.stuPrint();
		System.out.print(kor + "\t" + eng + "\t");
		System.out.print(mat + "\t" + tot + "\n");
	}
	/*
	@Override
	void stuPrint() {
		super.stuPrint();
		System.out.print(kor + "\t" + eng + "\t");
		System.out.print(mat + "\t" + tot + "\n");
	}*/
}
