
public class Exam_04 {
	//1 ~ 10 까지 정수 출력하는 메소드 작성
	static void test1() {
		for(int i=1; i<=10; i++) {
			System.out.print(i + "\t");
		}
	}
	public static void main(String[] args) {
		/*
		for(int i=1; i<=10; i++) {
			System.out.print(i + "\t");
		}
		*/
		test1();
		System.out.println();
		//test2();
		int s = test2();
		System.out.println("1 ~ 10 합 = " + s);
		System.out.println("1 ~ 10 합 = " + test2());
		
	}
	//1 ~ 10 합을 구하여 반환하는 메소드 작성
	static int test2() {
		int s=0;
		for(int i=1; i<=10; i++) {
			s+=i;
		}
		
		return s;
	}
	
}
