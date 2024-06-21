//1~10 합계(1+2+3+ . . . +10)
//sum = 55
public class Exam_03 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			System.out.println(i);
			//break;
			//continue;
			//System.out.println(sum);
		}
		System.out.println("sum="+sum);

		for(int i=0; i<=10; i+=2) {
			sum = sum + i;
			System.out.println(i);
			//break;
			//continue;
			//System.out.println(sum);
		}
		for(int i=1; i<=10; i+=2) {
			sum = sum + i;
			System.out.println(i);
			//break;
			//continue;
			//System.out.println(sum);
		}
		
		
	}

}
