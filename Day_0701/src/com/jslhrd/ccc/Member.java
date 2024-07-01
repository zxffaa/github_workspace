package com.jslhrd.ccc;

public class Member {

	private String name; // 이름
	private String phone; // 전화
	private String gender; // 성별(m:남자,f:여자
	private String joindata; // 가입일자
	private String grade; // 고객등급
	private String citycode; // 도시코드

	Member() {
	}

	Member(String name, String phone, String gender, String joindata, String grade, String citycode) {
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.joindata = joindata;
		this.grade = grade;
		this.citycode = citycode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJoindata() {
		return joindata;
	}

	public void setJoindata(String joindata) {
		this.joindata = joindata;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
}
