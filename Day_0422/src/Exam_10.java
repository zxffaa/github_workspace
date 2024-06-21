//3개의 정수중 대, 중, 소
public class Exam_10 {
	public static void main(String[] args) {
		int a=7,b=9,c=6;
		//교환법 a>b>c
		//int t;
		if(a<b) {
			int t=a;
			a=b;
			b=t;
		}
		if(a<c) {
			int t=a;
			a=c;
			c=t;
		}
		if(b<c) {
			int t=b;
			b=c;
			c=t;
		}
		System.out.println("max=" + a);
		System.out.println("med=" + b);
		System.out.println("min=" + c);
		System.out.printf("%d > %d > %d", a,b,c);
	}

}
