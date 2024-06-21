
public class Exam_04 {
	public static void main(String[] args) {
		//               번호국어영어수학
		int student[][]= {{1,90,88,79},
							{2,95,88,79},
							{3,68,80,70},
							{4,79,67,95},
							{5,85,80,70}};
		System.out.println("번호\t국어\t영어\t수학");
		for(int i=0; i<5; i++) {
			for(int j=0; j<4;j++) {
				System.out.print(student[i][j] + "\t");
			}
			System.out.print("\n");
		}
		//총점ㅂ, 평균을 구하여 출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<5; i++) {
			for(int j=0; j<4;j++) {
				System.out.print(student[i][j] + "\t");
			}
			int tot=student[i][1]+student[i][2]+student[i][3];//개인별 총점
			System.out.printf(tot + "\t" + tot/3 + "\n");
		}
		System.out.println("--------------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<5; i++) {
			System.out.print(student[i][0] + "\t");//번호출력
			int tot = 0;//개인별 총점계산용
			for(int j=1; j<4;j++) {//과목수 만큼 반복
				System.out.print(student[i][j] + "\t");
				tot += student[i][j];
			}
			System.out.printf(tot + "\t" + tot/3 + "\n");
		}
		
		
	}

}
