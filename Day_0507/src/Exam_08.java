import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int dec = 0;//10진수
		String bin="";// 2진수
		while(true) {
			System.out.print("10진수 입력:");
			dec = scn.nextInt();
/*			if(dec < 1 || dec > 1024) {
				System.out.print("입력오류");
				continue;
			}else {
				break;
			}
*/
			if(dec>=1 && dec < 1024) {
				break;
			}
			System.out.println("입력오류");
		}
		//변환시작
		while(dec != 0) {
			int na = dec % 2;
			bin = na + bin;
			dec = dec / 2;
		}
		System.out.println("2진수 : " + bin);
		
	}

}
