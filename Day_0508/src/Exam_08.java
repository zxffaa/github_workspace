import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int count[] = new int[6];
		System.out.print("점수입력:");
		while(true) {
			int score = scn.nextInt();
			if(score == -99) {
				break;
			}
			int row;
			if(score>=90) {
				row=0;
			}else if(score>=80) {
				row=1;
			}else if(score>=70) {
				row=2;
			}else if(score>=60) {
				row=3;
			}else if(score>=50) {
				row=4;
			}else {
				row=5;
			}
			count[row]++;
		}
		System.out.println("100 ~ 90 : " + count[0]);
		System.out.println("89 ~ 80 : " + count[1]);
		System.out.println("79 ~ 70 : " + count[2]);
		System.out.println("69 ~ 60 : " + count[3]);
		System.out.println("59 ~ 50 : " + count[4]);
		System.out.println("49 ~ 0 : " + count[5]);

	}

}
