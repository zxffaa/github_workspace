
public class Exam_06 {

	public static void main(String[] args) {
		int num=50;
		odd(num);//1 ~ num까지 홀수만 출력
		System.out.print("\n");
		even(num);//1 ~ num까지 홀수만 출력
	}
	static void odd(int a) {
		for(int i=0; i<=a; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
	}
	static void even(int a) {
		for(int i=0; i<=a; i+=2) {
			System.out.print(i +" ");
		}
	}
	
}
