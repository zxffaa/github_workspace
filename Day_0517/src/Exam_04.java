
public class Exam_04 {
	public static void main(String[] args) {
		int score[][] = {{5,90,88,78},
						 {2,90,85,80},
						 {1,80,70,90},
						 {3,95,90,85},
						 {4,88,78,90}};
		//전체출력
		System.out.println("번호\t국어\t영어\t수학\t총점");
		for(int i=0; i<score.length;i++) {
			System.out.print(score[i][0] + "\t");
			System.out.print(score[i][1] + "\t");
			System.out.print(score[i][2] + "\t");
			System.out.print(score[i][3] + "\t");
			int tot = score[i][1]+score[i][2]+score[i][3];
			System.out.print(tot + "\n");
		}
		//국어점수가 가장높은 학생 찾아서 출력
		// 번호   국어   영어   수학
		// 3     95    90    88
		int max[] = score[0];
		for(int i=1; i<score.length;i++) {
			if(max[1] < score[i][1]) {
				max = score[i];
			}
		}
		System.out.println("번호\t국어\t영어\t수학");
		System.out.print(max[0] + "\t");
		System.out.print(max[1] + "\t");
		System.out.print(max[2] + "\t");
		System.out.print(max[3] + "\t");

	}

}
