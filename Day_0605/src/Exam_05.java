//접근제한
/*
private : 자신의 클래스 내부에서 만 사용가능
default : 같은 패키지(폴더) 내에서 사용가능
protected : 같은 패키지(폴더) 또는 상속관계일 경우
public : 누구나 사용가능
*/

class E{
	private int a=10;
	int b=20;
	void test(){
		a=20;
		b=30;
	}
}
public class Exam_05 {

	public static void main(String[] args) {
		E e1=new E();
		//e1.a=30;
		e1.b=30;
	}

}
