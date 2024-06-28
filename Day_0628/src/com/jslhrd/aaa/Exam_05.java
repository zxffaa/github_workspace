package com.jslhrd.aaa;
import java.util.*;
public class Exam_05 {

	public static void main(String[] args) {
		Map<String,String>map=new HashMap();
		map.put("java", "1234");
		map.put("spring", "1234");
		map.put("servlet", "1234");
		map.put("oracle", "1234");
		map.put("webjava", "1234");
		//keyset()-->key를 set에서 담아 반환
		//entrySet()-->Map.Entry 객체(키와 값이 동시에 반환)-->Set 반환
		Set<Map.Entry<String,String>>set=map.entrySet();
		Iterator<Map.Entry<String,String>>iter=set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String,String>entry=iter.next();
			System.out.print(entry.getKey()+"\t");
			System.out.print(entry.getValue()+"\t");
		}
			
	}
}
