import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[100];
		int cnt;
		for(cnt = 0; cnt<score.length; cnt++) {
			System.out.print("입력:");
			score[cnt] = scn.nextInt();
			if(score[cnt] == -99) {
				break;
			}
		}
		//출력 및 총점
		int tot = 0;
		System.out.println("데이터 출력");
		for(int i=0; i<cnt; i++) {
			System.out.printf("%3d",score[i]);
			tot += score[i];
			if((i+1)%10==0) {
				System.out.println();
			}
		}
		//평균
		double ave = (double)tot / cnt;
		
		System.out.println();
		System.out.print("평균("+ave+") 이상 :");
		for(int i=0; i<cnt; i++) {
			if(score[i]>=ave) {
				System.out.printf("%3d", score[i]);
			}
		}	
		
	}

}
