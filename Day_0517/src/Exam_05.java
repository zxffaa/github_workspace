
public class Exam_05 {
	public static void main(String[] args) {
		int score[][] = {{5,90,88,78,0},
						 {2,90,85,80,0},
						 {1,80,70,90,0},
						 {3,95,90,85,0},
						 {4,88,78,90,0}};
		//전체출력
		System.out.println("번호\t국어\t영어\t수학\t총점");
		for(int i=0; i<score.length;i++) {
			System.out.print(score[i][0] + "\t");
			System.out.print(score[i][1] + "\t");
			System.out.print(score[i][2] + "\t");
			System.out.print(score[i][3] + "\t");
			score[i][4] = score[i][1]+score[i][2]+score[i][3];
			System.out.print(score[i][4] + "\n");
		}
		//번호를 기준으로 오름차순 정렬
		for(int i=0; i<score.length-1; i++) {
			for(int j=i+1; j<score.length;j++) {
				if(score[i][0] > score[j][0]) {
					for(int k=0; k<score[i].length;k++) {
						int imsi = score[i][k];
						score[i][k] = score[j][k];
						score[j][k] = imsi;
					}
				}
			}
		}
		//정렬후 출력
		System.out.println("번호\t국어\t영어\t수학\t총점");
		for(int i=0; i<score.length;i++) {
			System.out.print(score[i][0] + "\t");
			System.out.print(score[i][1] + "\t");
			System.out.print(score[i][2] + "\t");
			System.out.print(score[i][3] + "\t");
			System.out.print(score[i][4] + "\n");
		}
	
	
	}

}
