package com.jslhrd.bbb;

import java.io.*;

public class Exam_09 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=
				new BufferedReader(
						new FileReader(new File("src/student.txt")));
		
		String str="";
		while((str= br.readLine())!=null) {
			String data[]= str.split(",");
			System.out.print(data[0] + "\t");
			System.out.print(data[1] + "\t");
			System.out.print(data[2] + "\t");
			System.out.print(data[3] + "\t");
			System.out.print(data[4] + "\t");
			int tot = Integer.parseInt(data[2]) +
					Integer.parseInt(data[3]) +
					Integer.parseInt(data[4]);
			double ave = tot / 3.0;
			System.out.print(tot + "\t");
			System.out.print(String.format("%.2f", ave) + "\n");
		}
	}

}
