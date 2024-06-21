// + : 문자열 연산 
public class Exam_07 {
	public static void main(String[] args) {
		int a=35;
		System.out.printf("String = %s\n" , (a+"1"));
		String s = a+"";
		System.out.printf("s=%s\n", s);
		
		System.out.printf("s=%s\n", (3+4+s));
		System.out.printf("s=%s\n", (3+(4+s)));
	}

}
