package com.jslhrd.bbb;

import java.io.*;
import java.util.*;

public class PersonExam {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		File file = new File("src/person.txt");
		List<Person> pList = new ArrayList<Person>();
		if (file.exists()) {
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			pList = (List) ois.readObject();
			System.out.println("번호이름나이");
			for(int i=0;i<pList.size();i++) {
				System.out.println(pList.get(i));
			}
		}
		System.out.println("---------키보드 입력--------");
		System.out.print("등록 :");
		int bun = input.nextInt();//번호
		String name = input.next();//이름
		int age = input.nextInt();//나이
		Person p = new Person(bun,name,age);
		pList.add(p);
		
		//파일저장
		ObjectOutputStream oos = 
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(file)));
		oos.writeObject(pList);
		oos.close();


	}

}
