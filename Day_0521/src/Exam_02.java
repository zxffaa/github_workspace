
public class Exam_02 {
	static void a() {
		int otot=0;
		int etot=0;
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				otot+=i;
			}else {
				etot+=i;
			}
		}
		System.out.printf("1~100홀수의 합:%d\n",otot);
		System.out.printf("1~100홀수의 합:%d\n",etot);
	
	}
	
		
	public static void main(String[] args) {
		a();
	}

}
