
public class Exam_01 {
	//메소드 정의
	static void a() {
		System.out.println("a()호출됨");
	}
	static void b(int a,int b) {
		System.out.printf("a=%d, b=%d\n",a,b);
	}
	public static void main(String[] args) {
	//메소드 호출
		a();
		b(10,20);
	}
	//메소드 정의 부분
}
