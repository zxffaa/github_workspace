class AA{
	void sum(int num) {
		int s=0;
		for(int i=1; i<=num;i++) {
			s += i;
		}
		System.out.printf("1 ~ %d 합 : %d\n" , num,s);
	}
	int add(int n, int m) {
		int s=0;
		for(int i=n; i<=m;i++) {
			s += i;
		}
		return s;
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		AA a1 = new AA();
		a1.sum(100);
		a1.sum(50);
		
		int s = a1.add(1, 10);
		System.out.println(s);
		System.out.println(a1.add(5, 20));
	}

}

