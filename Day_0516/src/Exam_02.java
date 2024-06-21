//2차원 배열의 초기화
public class Exam_02 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println("기본 for() 출력");
		for(int i=0; i<a.length;i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
		System.out.println("확장 for() 출력");
		for(int x : a) {
			System.out.printf("%3d", x);
		}
		System.out.println();
		
		int arr[][]= {{1,2,3},{4,5,6}};
		
		

	}

}
