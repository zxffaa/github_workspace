package com.jslhrd.aaa;

import java.util.*;

public class Exam_03 {

	public static void main(String[] args) {
		List<String>list=new ArrayList();
		list.add("Java");
		list.add("Oracle");
		list.add("Servlet");
		list.add("JSP");
		list.add("Spring");
		System.out.println("-------------List출력------------");
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println("-------------Lambda출력------------");
		list.forEach(x->System.out.println(x));
	}

}
