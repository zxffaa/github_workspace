/*  키보드로 10진수 입력 2, 8, 16진수로 변환
 *  1. 입력 값이 0보다 작거나 같으면 종료 한다
 *  2. 변환진수가 2 8 16이외의 값은 "오류" 출력후 재입력
 *  3. 입력예시
 *     10진수 : 10
 *     변환진수 : 2
 *     2진수 : 1010

 *     10진수 : 15
 *     변환진수 : 16
 *     16진수 : F

 *     10진수 : 12
 *     변환진수 : 8
 *     8진수 : 14
 *     
 *     10진수 : 0  --> 종료
 * 
 */

import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("10진수 : ");
			int dec = scn.nextInt();
			if(dec < 1) {
				break;
			}
			int con;
			while(true) {//변환진수입력
				System.out.print("변환진수 : ");
				con = scn.nextInt();
				if(con==2 || con==8 || con==16) {
					break;
				}
				System.out.print("변환진수는 (2,8,16)만 가능입력오류");
			}//while(true) 변환진수 끝
			//변환시작
			String str="";
			while(dec != 0) {
				int na = dec % con;//나머지
				dec = dec / con;//몫
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
			}//변환종료
			System.out.println(con + "변환 값 : " + str);
			
		}//while(true)끝 10진수입력
	}

}
