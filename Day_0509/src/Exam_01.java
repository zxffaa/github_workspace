import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[10];
		//입력
		for(int i=0; i<score.length;i++) {
			System.out.print("data " + (i+1) + ":");
			score[i] = scn.nextInt();
		}
		//출력
		System.out.print("Input Data : ");
		for(int i=0; i<score.length;i++) {
			System.out.printf("%3d", score[i]);
		}
		System.out.println();
		//합계, 평균, 최대, 최소
		int max = score[0];//최대
		int min = score[0];//최소
		int sum = score[0];//합계
		for(int i=1; i<score.length;i++) {
			sum += score[i];
			if(max < score[i]) {
				max=score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/10.);
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
	}

}
