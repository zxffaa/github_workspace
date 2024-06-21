//키보드로 10진수 입력 -> 2진수로 변환

import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("10진수:");
		int dec = scn.nextInt();
		String bin="";
		while(dec>0) {//while(dec !=0)
			int mok = dec / 2;
			int na = dec % 2;
			bin = na + bin;
			dec=mok;
		}
		System.out.println("2진수 : " + bin);
	}

}
