//2차원배열(행*열)
public class Exam_01 {
	public static void main(String[] args) {
		int a[][];//2차원배열 선언
		a = new int[2][3];//할당(2줄 3칸)
		
		int b[][] = new int[2][3];//2차원 배열의 선언과 할당
		
		System.out.println("줄수 :" + a.length);
		System.out.println("0번 줄 칸수 :" + a[0].length);
		System.out.println("1번 줄 칸수 :" + a[1].length);
		System.out.println("[0][0] 값 :" + a[0][0]);

		// for 2차원 배열 내용 출력
		for(int i=0; i<2; i++) {//row a.length
			for(int j=0; j<3; j++) {//col a[i].length
				System.out.printf("%3d",a[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("-----------------------");
		for(int x[] : a) {
			for(int y : x) {
				System.out.printf("%3d", y);
			}
			System.out.print("\n");
		}
	}

}
