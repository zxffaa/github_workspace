
public class Exam_06 {
	public static void main(String[] args) {
		int values[][] = {{5,90,88,78,0,0},
				 {2,90,85,80,0,0},
				 {1,80,70,90,0,0},
				 {3,95,90,85,0,0},
				 {4,88,78,90,0,0}};
		//1.학생별 총점 계산
		for(int i=0; i<values.length;i++) {
			for(int j=1; j<4; j++) {
				values[i][4] += values[i][j];
			}
		}
/*     	1.학생별 총점 계산	
		for(int i=0; i<values.length;i++) {
			values[i][4] = values[i][1]+values[i][2]+values[i][3];
		}
*/		
		//2.순위구하기
		for(int i=0; i<values.length;i++) {
			int r=1;
			for(int j=0; j<values.length;j++) {
				if(values[i][4] < values[j][4]) {
					r++;
				}
			}
			values[i][5] = r;
		}
		//테스트 출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for(int i=0; i<values.length;i++) {
			for(int j=0; j<values[i].length;j++) {
				System.out.print(values[i][j] + "\t");
			}
			System.out.print("\n");
		}
		//번호를 기준으로 오름차순 정렬
		
		//최대, 최소 찾기
		
	}

}
