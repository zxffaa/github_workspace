package com.jslhrd.bbb;

import java.io.*;
import java.util.*;

public class Exam_04 {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		File file=new File(path);
		String[] flist=file.list();
		for(String str:flist) {
			System.out.println(str);
		}
		System.out.println("---------------------");
		File f2 = new File(file+"/src/com/jslhrd/aaa");
		String str2[] = f2.list();
		for(String str : str2) {
			System.out.println(str);
		}

	}

}
