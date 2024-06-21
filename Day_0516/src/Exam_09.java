
public class Exam_09 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		//배열에 데이터 입력
		int cnt=0;
		for(int i=0;i<5; i++) {
			for(int j=i; j>=0; j--) {
				cnt++;
				a[i][j] = cnt;
			}
		}
		
		//출력테스트
		for(int i=0;i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.print("\n");
		}

	}

}
