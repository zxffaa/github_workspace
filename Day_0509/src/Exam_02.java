import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[100];
		//입력
		int cnt;
		for(cnt=0; cnt<score.length;cnt++) {
			System.out.print("data " + (cnt+1) + ":");
			score[cnt] = scn.nextInt();
			if(score[cnt] == -99) {
				break;
			}
		}
		//출력
		System.out.print("Input Data");
		for(int i=0; i<cnt; i++) {
			System.out.printf("%3d", score[i]);
			if(i%10==0) {
				System.out.println();
			}
		}
		//최대, 최소, 합계, 평균
	}

}
