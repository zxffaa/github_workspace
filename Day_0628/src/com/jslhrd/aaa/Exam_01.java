package com.jslhrd.aaa;
import java.util.*;
public class Exam_01 {

	public static void main(String[] args) {
		/*Map map=new HashMap();
		기본적인 key는 object이다 value:Object
		map.put("aaa", 90);
		map.put(1, 90);
		map.put(3.14, "aaa");
		map.put('A', 90);*/
		
		Map<String,Integer>map=new HashMap<String,Integer>();
		//map.put(1, 90) 불가
		System.out.println("비어있습니까?"+map.isEmpty());
		map.put("A", 90);
		map.put("B", 80);
		map.put("C", 70);
		map.put("D", 60);
		map.put("A", 60);
		map.put("F", 90);
		System.out.println("map:"+map);
		System.out.println("객체수:"+map.size());
		System.out.println("키 A값:"+map.get("A"));
		System.out.println("키 B포함:"+map.containsKey("B"));
		System.out.println("값 90포함:"+map.containsValue(90));	
	}

}
