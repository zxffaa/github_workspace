import java.util.Scanner;
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int totCnt=0;//입력자료 건수
		int cnt=0;//소수개수
		while(true) {
			System.out.print("입력:");
			int val = scn.nextInt();
			if(val <= 1) {
				break;
			}
			totCnt++;//입력자료수 카운트
			int x;
			for(x=2; x<val; x++) {
				if(val % x == 0) {
					break;
				}
			}
			if(x==val) {
				System.out.println(val+"는 소수");
				cnt++;// 소수카운트
			}else {
				System.out.println(val+"는 소수아님");
			}
		}
		System.out.println("입력자료 건수 : " + totCnt);
		System.out.println("소수자료 건수 : " + cnt);

	}

}
