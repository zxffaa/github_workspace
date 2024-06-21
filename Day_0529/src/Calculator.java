
public class Calculator {
	//더하기
	void add(int a,int b) {
		int result =a+b;
		System.out.printf("%d+%d=%d\n",a,b,result);
	}
	void add(double a,double b) {
		double result =a+b;
		System.out.printf("%.2f+%.2f=%.2f\n",a,b,result);
	}
	void add(int a,double b) {
		double result =a+b;
		System.out.printf("%d+%.2f=%.2f\n",a,b,result);
	}
	void add(double a,int b) {
		double result =a+b;
		System.out.printf("%.2f+%d=%.2f\n",a,b,result);
	}
	
	void sub(int a,int b) {
		int result =a-b;
		System.out.printf("%d-%d=%d\n",a,b,result);
	}
	void sub(double a,double b) {
		double result =a-b;
		System.out.printf("%.2f-%.2f=%.2f\n",a,b,result);
	}
	void sub(int a,double b) {
		double result =a-b;
		System.out.printf("%d-%.2f=%.2f\n",a,b,result);
	}
	void sub(double a,int b) {
		double result =a-b;
		System.out.printf("%.2f-%d=%.2f\n",a,b,result);
	}
	
}
