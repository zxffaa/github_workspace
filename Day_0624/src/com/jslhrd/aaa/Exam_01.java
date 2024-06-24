package com.jslhrd.aaa;

import java.util.*;

public class Exam_01 {

	public static void main(String[] args) {
		//크기와 데이터타입에 상관없이 사용가능하다
		List list =new ArrayList();
		ArrayList aList=new ArrayList();
		
		list.add(1);
		list.add("Korea");
		list.add(3.14);
		
		System.out.println("list:"+list);
		int a=(Integer)list.get(0);
		Object obj = list.get(1);
		String str=(String)list.get(1);
		list.set(1, "JSL");
		System.out.println(list.size());
		boolean bool=list.remove((Object)1);
		if(bool) {
			System.out.println("삭제성공");
		}
		System.out.println("list:"+list);
	}

}
