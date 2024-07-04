package com.jslhrd.aaa;

import java.io.*;

public class Exam_02 {

	public static void main(String[] args)throws Exception {
		//File dir = new File("src/object.txt");
				File dir = new File("src/");
				File file = new File(dir,"object.txt");
				FileInputStream fis = new FileInputStream(file);
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis);
				
				//Point p = ois.readObject();
				Object obj = ois.readObject();
				Point p = (Point)obj;
				
				System.out.print("x= " + p.x);
				System.out.print("y= " + p.y);


	}

}
