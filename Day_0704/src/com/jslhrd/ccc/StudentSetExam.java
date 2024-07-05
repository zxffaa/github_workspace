package com.jslhrd.ccc;

import java.io.*;
import java.util.*;

public class StudentSetExam {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		StudentFution SFM=new StudentFution();
		int cnt = 0;
		boolean sw=true;
		while (sw) {
			SFM.First_Intro();
			int button = input.nextInt();
			switch (button) {
			case 1:
				cnt=SFM.as2();
				break;
			case 2:
				SFM.Set_Print(cnt);
				break;
			case 3:
				sw =SFM.SetsaveToFile();
				break;
			default:
				System.out.println("잘못입력하셨습니다");
			}
		}
	}
}