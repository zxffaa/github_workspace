//식별자(Identifier) : 클래스이름, 메소드이름, 변수명
/* 1. 사용가능 영문자(대소문자 구분), 숫자(0~9), 특수문자(_, $)만 가능
 * 2. 첫자는 반드시 영문자
 */
public class Exam_01 {
	public static void main(String[] args) {
		//변수선언
		byte by;//1byte
		short sh;//2byte
		char ch;//2byte
		int i;//4byte
		long lo;//8byte
		float fl;//4byte
		double dl;//8byte
		boolean bool;//1byte
		// 변수에 상수 대입(기억)
		by = 100;
		sh = 32000;
		ch = 'A';
		i = 12345678;
		lo = 1234567890;
		fl = 3.14f;
		dl = 3.14;
		bool = true;
		
		//변수에 들어있는 값 출력
		System.out.println("by = " + by);
		System.out.println("short = " + sh);
		System.out.println("char = " + ch);
		System.out.println("int = " + i);
		System.out.println("long = " + lo);
		System.out.println("float = " + fl);
		System.out.println("double = " + dl);
		System.out.println("boolean = " + bool);

		
	}

}
