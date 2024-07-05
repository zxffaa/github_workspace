package com.jslhrd.ccc;

import java.io.*;
import java.util.*;

public class StudentListExam2 {

	public static void main(String[] args) throws Exception {
		StudentFution SFM=new StudentFution();
		Scanner input = new Scanner(System.in);
		int cnt=0;
		boolean sw = true;
		while (sw) {
			SFM.First_Intro();
			int button = input.nextInt();
			switch (button) {
			case 1:
				cnt=SFM.as();
				break;
			case 2:
				SFM.List_Print(cnt);
				break;
			case 3:
				sw=SFM.saveToFile();
				break;
			default:
				System.out.println("잘못입력하셨습니다");
			}
		}
	}
}
