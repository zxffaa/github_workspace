
public class Exam_04 {
	static void max(int a,int b) {
		int m=(a>b)?a:b;
		
		System.out.println(m);
	}
	static void max(int a,int b,int c) {
		int m=(a>b)?a:b;
		m=(m>c)?m:c;
		System.out.println(m);
	}
	static void max(int a,int b, int c,int d) {
		int m=(a>b)?a:b;
		m=(m>c)?m:c;
		m=(m>d)?m:d;
		System.out.println(m);
	}
	
	
	public static void main(String[] args) {
		int a=5,b=3,c=7,d=2;
		max(a,b);
		max(a,b,c);
		max(a,b,c,d);

	}

}
