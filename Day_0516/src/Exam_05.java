//5 * 5 행열
public class Exam_05 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		//배열에 데이터 입력
		int cnt=0;
		for(int i=0;i<5; i++) {
			for(int j=0; j<5; j++) {
				cnt++;
				a[i][j] = cnt;
			}
			System.out.print("\n");
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
