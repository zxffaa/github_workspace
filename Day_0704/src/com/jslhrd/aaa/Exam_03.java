package com.jslhrd.aaa;

import java.io.*;
import java.util.*;
public class Exam_03 {

	public static void main(String[] args)throws Exception{
		List<String>list=new ArrayList<String>();
		list.add("Java");
		list.add("Oracle");
		list.add("JSLHRD");
		list.add("DataBase");
		list.add("Spring");
		ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("src/listObject.txt"))));
		
		oos.writeObject(list);
		oos.close();
	}

}
