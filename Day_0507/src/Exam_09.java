import java.util.Scanner;

public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int dec = 0;//10진수
		int bin[] = new int[10];
		int cnt=0;//2진수 카운트용
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
			bin[cnt]=na;
			dec = dec / 2;
			cnt++;
		}
		System.out.print("2진수 : " );
		for(int i=10-1; i>=0; i--) {
			System.out.print(bin[i]+" ");
		}
		System.out.println();
		System.out.print("2진수 : " );
		for(int i=cnt-1; i>=0; i--) {
			System.out.print(bin[i]+" ");
		}

	}

}
