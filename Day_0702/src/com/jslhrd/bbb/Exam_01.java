package com.jslhrd.bbb;

import java.io.*;
import java.util.*;

public class Exam_01 {

	public static void main(String[] args) {
		File f1 = new File("C:/Users/김현규/JSL/data");
		if(f1.exists()) {
			f1.delete();
			System.out.println("삭제됨");
		}else {
			System.out.println("data 폴더가 없음");
			f1.mkdir();
		}

	}

}
