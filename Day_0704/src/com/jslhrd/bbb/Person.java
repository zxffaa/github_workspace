package com.jslhrd.bbb;

import java.io.Serializable;

public class Person implements Serializable{
	private int bun;
	private String name;
	private int age;
	public Person() {}
	public Person(int bun,String name,int age) {
		this.age=age;
		this.bun=bun;
		this.name=name;
	}
	@Override
	public String toString() {
		return bun+"\t"+name+"\t"+age;
	}
}
