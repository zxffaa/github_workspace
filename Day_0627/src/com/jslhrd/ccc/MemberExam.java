package com.jslhrd.ccc;
import java.util.*;
public class MemberExam {

	public static void main(String[] args) {
		List<Member> list=new ArrayList<Member>();
		list.add(new Member(7,"BBB"));
		list.add(new Member(3,"AAA"));
		list.add(new Member(4,"CCC"));
		list.add(new Member(6,"EEE"));
		list.add(new Member(2,"DDD"));
		
		System.out.println("list : " + list);
		Collections.sort(list);
		System.out.println("list Sort: " + list);
	}

}
