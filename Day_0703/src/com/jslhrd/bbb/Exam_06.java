package com.jslhrd.bbb;
import java.io.*;
public class Exam_06 {

	public static void main(String[] args) throws Exception {
		BufferedReader br=
				new BufferedReader(
						new FileReader(new File("src/output.txt")));
		String str="";
		while((str= br.readLine())!=null) {
			System.out.println(str);
		}
	}

}
