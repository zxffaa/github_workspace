
public class Exam_05 {
	static int add(int n) {
		int s=0;
		for(int i=1;i<=n;i++) {
			s+=i;
		}
		return s;
	}
	public static void main(String[] args) {
			int a=10;
			System.out.printf("1~%d=%d\n",a,add(a));
			int s=add(20);
			System.out.printf("1~20=%d\n",s);
	}

}
