//계산기 클래스
public class Calculator {
	int sum;
	void add(int a,int b) {
		sum=a+b;
		System.out.printf("%d+%d=%d\n",a,b,sum);
	
	}
	void sub(int a,int b) {
		sum=a-b;
		System.out.printf("%d-%d=%d\n",a,b,sum);
		
	}
	void mul(int a,int b) {
		sum=a*b;
		System.out.printf("%d*%d=%d\n",a,b,sum);
		
	}
	void div(int a,int b) {
		if(b==0) {
			System.out.println("");
		}
		sum=a/b;
		System.out.printf("%d/%d=%d\n",a,b,sum);
		
	}
	void mulAdd(int ... a) {
		int s = 0;
		for(int i=0; i<a.length;i++) {
			s += a[i];
			System.out.print(a[i]);
			if(i==a.length-1) {
				System.out.print("=");
			}else {
				System.out.print("+");
			}
		}
		System.out.println(s);
		
	}
	//2개의 정수 덧셈
	//2개의 뺄셈
	//2개의 곱셈
	//2개의 나눗셈
	//2개의 정수 나머지
 }
