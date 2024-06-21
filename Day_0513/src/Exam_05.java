import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[10];
		//입력작업
		int cnt;
		for(cnt=0; cnt<score.length;cnt++) {//cnt<10
			System.out.print((cnt+1)+".점수:");
			score[cnt] = scn.nextInt();
			if(score[cnt] == 0) {
				break;
			}
		}
		//출력작업
		System.out.print("학생점수 : ");
		for(int i=0; i<cnt; i++) {
			System.out.printf("%3d", score[i]);
		}
		System.out.println();//줄바꿈
		//내림차순 정렬
		for(int i=0; i<cnt-1; i++) {
			for(int j=i+1; j<cnt; j++) {
				if(score[i] < score[j]) {
					int t = score[i];
					score[i] = score[j];
					score[j] = t;
				}
			}
		}
		//정렬후 출력
		System.out.print("학생점수 : ");
		for(int i=0; i<cnt; i++) {
			System.out.printf("%3d", score[i]);
		}
		System.out.println();//줄바꿈
		
	}

}
