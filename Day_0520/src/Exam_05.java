
public class Exam_05 {
	// 1 ~ n까지 합계를 구하여 출력
	static void exam(int n) {
		int s=0;
		for(int i=1; i<=n; i++) {
			s += i;
		}
		System.out.println("1 ~ " + n + "합 :" + s);
	}
	static int exam2(int n) {
		int s =0;
		for(int i=1; i<=n; i++) {
			s += i;
		}
		return s;
	}
	public static void main(String[] args) {
		exam(100);
		int n=10;
		System.out.println("1 ~ " + n + "합 =" + exam2(n));
		
		int s = exam2(n);
		System.out.println("1 ~ " + n + "합 =" + s);
	}

}
