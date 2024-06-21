// 1+2+3+4+5=15
public class Exam_05 {
	public static void main(String[] args) {
		int sum=0;//합계
		for(int i=1; i<=5; i++) {
			sum += i;
			if(i<5) {
				System.out.print(i + "+");
			}else {
				System.out.print(i + "=");
			}
		}
		System.out.print(sum);
	}

}
