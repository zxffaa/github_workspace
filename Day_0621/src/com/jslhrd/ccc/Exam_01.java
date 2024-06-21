package com.jslhrd.ccc;

import java.text.*;

public class Exam_01 {
	//숫자 형식화 클래스

		public static void main(String[] args) {
			// 0  # , . %
			//#은 숫자가 없으면 안찍는다
			DecimalFormat df = new DecimalFormat("#,###");
			//0은 없어도 찍는다
			//#,##0으로 하면 숫자가 없을시 찍는다
			DecimalFormat df2 = new DecimalFormat("0,000");
			String s = df.format(123456789);
			System.out.println("s = " + s);
			s = df.format(123);
			System.out.println("s = " + s);
			String s2 = df2.format(1234567);
			System.out.println("s2 = " + s2);
			s2 = df2.format(123);
			System.out.println("s2 = " + s2);
			
			
		}

	}

