// "*" 기호 25개 출력
// 1 2 ~   25까지 정수 출력
public class Exam_01 {
	public static void main(String[] args) {
		for(int i=1; i<=25; i++) {
			System.out.print("*");
		}
		System.out.println();//줄바꿈
		//System.out.print("\n");//줄바꿈
		for(int i=1; i<=25; i++) {
			//System.out.print(i+" ");
			System.out.printf("%3d", i);
		}
		System.out.println();//줄바꿈
		
	}

}
