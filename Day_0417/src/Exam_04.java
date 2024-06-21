//산술연산자(*, /, %) -> (+,-)
public class Exam_04 {
	public static void main(String[] args) {
		int a=7, b=3;
		int c;
		double d;
		c = a * b;
		System.out.printf("%d * %d = %d\n", a,b,c);
		c = a / b;//몫
		System.out.printf("%d / %d = %d\n", a,b,c);
		c = (int)(a / 3.0);
		d = a / (double)b;//결과값을 실수로
		System.out.printf("%d / %d = %f\n", a,b,d);
		c = a % b;//나머지 값
		System.out.printf("%d %% %d = %d\n", a,b,c);
		c = a + b;
		System.out.printf("%d + %d = %d\n", a,b,c);
		c = a - b;
		System.out.printf("%d - %d = %d\n", a,b,c);
		
		// 홀수 짝수구분
		//   x % 2 == 0 --> 짝수( 2배수)
		//   x % 2 == 1 --> 홀수 x % 2 != 0
		
		System.out.println(35 % 2 == 0);//false
		
		boolean bool = 35 % 2 != 0;
		System.out.println(bool);//true
	}

}
