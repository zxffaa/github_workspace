package com.jslhrd.aaa;

import java.util.*;
import java.io.*;

public class Exam_04 {

	public static void main(String[] args)throws Exception {
		ObjectInputStream ois = 
				new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream(
										new File("src/listObject.txt"))));
		
		Object obj = ois.readObject();
		List list = (List)obj;
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
