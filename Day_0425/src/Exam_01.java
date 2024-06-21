import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int score = scn.nextInt();
		int max=score;
		int min=score;
		int sum=score;
		int cnt=1;
		while(true) {
			score = scn.nextInt();
			if(score==-99) {//EOF
				break;
			}
			if(score>0 && score<=100) {
				//정상적인 데이터 입력
				cnt++;
				sum += score;
				if(max < score) {
					max=score;
				}else if(min > score) {
					min=score;
				}
			}
		}
		System.out.printf("최대점수 : %d\n", max);
		System.out.printf("최소점수 : %d\n", min);
		System.out.printf("합계점수 : %d\n", sum);
		System.out.printf("평균점수 : %.2f\n", (double)sum/cnt);
	}

}
