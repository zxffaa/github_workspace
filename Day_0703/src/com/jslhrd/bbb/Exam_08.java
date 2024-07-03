package com.jslhrd.bbb;
//파일로부터 읽기(Scanner)
import java.util.*;
import java.io.*;
public class Exam_08 {

	public static void main(String[] args)throws Exception {
		Scanner input=new Scanner(new File("src/student.txt"));
		//파일로 부터 읽기
		String data[]=null;
		while(input.hasNextLine()) {
			data = input.nextLine().split(",");
			System.out.print(data[0] + "\t");
			System.out.print(data[1] + "\t");
			System.out.print(data[2] + "\t");
			System.out.print(data[3] + "\t");
			System.out.print(data[4] + "\n");
			int tot = Integer.parseInt(data[2]) +
					Integer.parseInt(data[3]) +
					Integer.parseInt(data[4]);
			double ave = tot / 3.0;
			System.out.print(tot + "\t");
			System.out.print(String.format("%.2f", ave) + "\n");
		}
	}

}
