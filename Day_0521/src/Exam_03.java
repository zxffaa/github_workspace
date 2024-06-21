import java.util.Scanner;

public class Exam_03 {
	//n부터 m까지 정의 합을 구하여 출력
	static void add(int m) {
		int s=0;
		for(int i=1;i<=m;i++) {
			s+=i;
		}
		System.out.printf("%d~%d까지의 합 %d\n",1,m,s);
	}
	
	
	//메소드 오버로딩:메소드 이름은 같고,매캐변수의 타입,순서,갯수가 다른경우
	//반환타입은 관계없음
	/*
	static void a() {}
	static void a(int a) {}
	static void a(double a) {}
	static void a(int a, int b) {}
	static void a(double c, int d) {}
	static void a(int c, double d) {}
	*/
	static void add(int n,int m) {
		int s=0;
		for(int i=n;i<=m;i++) {
			s+=i;
		}
		System.out.printf("%d~%d까지의 합 %d\n",n,m,s);
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("정수입력:");
		int a=scn.nextInt();
		int b=scn.nextInt();
		add(10);
		add(a,b);
		/*
		add(1,10);
		add(5,100);
		add(1,50);
		*/
	}

}
