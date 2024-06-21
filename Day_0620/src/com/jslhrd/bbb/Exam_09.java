package com.jslhrd.bbb;

import java.util.*;

import java.text.SimpleDateFormat;

//날짜/ 시간
public class Exam_09 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("now = " + now);
		//날자 형식화 클래스 SimpleDateFormat
		//형식화 문자: y(년) M(월)d(d일) h(시)m(분)s(초)
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String now2 = sdf.format(now);
		System.out.println("now2 = " + now2);
	}

}

