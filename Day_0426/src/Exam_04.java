//10진수 입력 2,8,16변환

import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("10진수 :");
			int dec = scn.nextInt();
			if(dec == 0) {
				break;
			}
			if(dec<1) {
				System.out.println("10진수 입력오류");
				continue;
			}
			int con;
			while(true) {//2,8,16 변환 수치 입력
				System.out.print("변환 수 입력(2,8,16) :");
				con = scn.nextInt();
				if(con==2 || con==8 || con==16) {
					break;
				}
				System.out.print("변환진수 입력오류");
			}//while(true) {//2,8,16 변환 수치 입력 끝
			//진법변환 시작
			String str="";
			while(dec != 0) {
				int na = dec % con;
				dec = dec / con;
				switch(na) {
					case 10:
						str = "A" + str; break;
					case 11:
						str = "B" + str; break;
					case 12:
						str = "C" + str; break;
					case 13:
						str = "D" + str; break;
					case 14:
						str = "E" + str; break;
					case 15:
						str = "F" + str; break;
					default:
						str = na + str;
				}
			}//while(dec != 0)끝
			//출력
			System.out.println(con +"진수 : " + str);
		}//while(true)끝
	}

}
