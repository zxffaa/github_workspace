package com.jslhrd.aaa;

public class Member {
	private String name;
	private int year;
	private int month;
	private int day;
	private String handnumber;
	private String gender;
	private int age;
	Member(){}
	Member(String name,int year,int month,int day,String handnumber,String gender,int age){
		this.name=name;
		this.month=month;
		this.day=day;
		this.year=year;
		this.handnumber=handnumber;
		this.gender=gender;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getHandnumber() {
		return handnumber;
	}
	public void setHandnumber(String handnumber) {
		this.handnumber = handnumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
