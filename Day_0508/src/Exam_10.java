import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[10];
		//입력
		int cnt=0;
		System.out.print("점수입력:");
		while(cnt<10) {
			int val = scn.nextInt();
			if(val < 1 || val > 100) {
				continue;
			}
			score[cnt] = val;
			cnt++;
		}
				
		//출력, 총점
		int tot=0;//총점
		System.out.print("Data : ");
		for(int i=0; i<score.length;i++) {
			System.out.print(score[i] +"\t");
			tot += score[i];
		}
		System.out.println();
		System.out.println("총점 : " + tot) ;
		System.out.println("평균 : " + tot/10.);
	}

}
