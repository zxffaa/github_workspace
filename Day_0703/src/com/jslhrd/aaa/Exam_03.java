package com.jslhrd.aaa;

import java.io.*;
import java.util.*;

public class Exam_03 {

	public static void main(String[] args)throws Exception{
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(new File("src/data.txt"))));
		/*
		 * File f = new File("src/data.txt"); FileOutputStream fos = new
		 * FileOutputStream(f); BufferedOutputStream bos = new
		 * BufferedOutputStream(fos); DataOutputStream dos = new DataOutputStream(bos);
		 */
		dos.writeInt(100);
		dos.writeDouble(3.14);
		dos.writeBytes("Hello World!");

		dos.close();

	}

}
