package com.jslhrd.aaa;

public class AA {
	private int a=10;
	int b=20;//default
	protected int c=30;
	public int d=40;
	private void printA() {
		System.out.println("a="+a);
		System.out.println("a="+b);
		System.out.println("a="+c);
		System.out.println("a="+d);
	}
	void printB() {
		System.out.println("a="+a);
		System.out.println("a="+b);
		System.out.println("a="+c);
		System.out.println("a="+d);
	}
	protected void printC() {
		System.out.println("a="+a);
		System.out.println("a="+b);
		System.out.println("a="+c);
		System.out.println("a="+d);
	}
	public void printD() {
		System.out.println("a="+a);
		System.out.println("a="+b);
		System.out.println("a="+c);
		System.out.println("a="+d);
	}
}
