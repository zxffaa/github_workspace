// !, ~  논리부정(not)
public class Exam_03 {
	public static void main(String[] args) {
		boolean flag = true;
		System.out.println("flag = " + flag);//true
		flag = !flag;
		System.out.println("flag = " + flag);//false
		System.out.println("flag = " + !flag);//true
		
		int a=7;
		int b = ~a;
		System.out.printf("a=%d b=%d\n", a,b);
		int c = ~b;
		System.out.printf("a=%d b=%d c=%d\n", a,b,c);
		

	}

}
