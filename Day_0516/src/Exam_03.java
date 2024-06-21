//2차원 배열의 초기화
public class Exam_03 {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6}};
		System.out.println("기본 for() 출력");
		for(int i=0; i<arr.length;i++) {//줄수
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");//줄바꿈
		}
		
		System.out.println();
		System.out.println("확장 for() 출력");
		for(int x[] : arr) {
			for(int a : x) {
				System.out.printf("%3d", a);
			}
			System.out.print("\n");//줄바꿈
		}

	}

}
