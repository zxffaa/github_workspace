// 1+2-3+4-5+6-7+8-9+10=7
public class Exam_06 {
	public static void main(String[] args) {
		int s=0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				if(i==1) {
					s=1;
				}else {
					s -= i;
				}
				System.out.print(i+"+");
			}else {
				s += i;
				if(i==10) {
					System.out.print(i+"=");
				}else {
					System.out.print(i+"-");
				}
			}
		}
		System.out.print(s);

	}

}
