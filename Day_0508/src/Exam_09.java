import java.util.Scanner;

public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score[] = new int[10];
		System.out.print("점수입력:");
		for(int i=0; i<score.length; i++) {
			score[i] = scn.nextInt();
			if(score[i]<1 && score[i] > 100) {
				i--;
				continue;
			}
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
