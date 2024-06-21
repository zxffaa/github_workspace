package com.jslhrd.ddd;

public abstract class MathExam {
	public  abstract int max(int a, int b);
	public  abstract int min(int a, int b);
	public  abstract int max(int ... a);
	public  abstract int min(int ... a);
}

class SubExam extends MathExam{
	@Override
	public int max(int a, int b) {
		int c=0;
		if(a>b) {
			c=a;
		}else {
			c=b;
		}
		return c;
	}@Override
	public int min(int a, int b) {
		int c=0;
		if(a<b) {
			c=a;
		}else {
			c=b;
		}
		return c;
	}@Override
	public int max(int... a) {
		int c=a[0];
		for(int i=0;i<a.length;i++) {
			if(c<a[i]) {
				c=a[i];
			}		
		}
		return c;
	}@Override
	public int min(int... a) {
		int c=a[0];
		for(int i=0;i<a.length;i++) {
			if(c>a[i]) {
				c=a[i];
			}		
		}
		return c;
	}
}
