
public class Exam_06 {
	static void swapA(int a,int b) {
		int t=a;
		a=b;
		b=t;
	}
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.printf("a=%d,b=%d\n",a,b);
		swapA(a,b);
		System.out.printf("a=%d,b=%d\n",a,b);
	}

}
