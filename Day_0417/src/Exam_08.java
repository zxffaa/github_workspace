//반올림
public class Exam_08 {
	public static void main(String[] args) {
		double ave=87.5678;
		double a1 = (int)(ave*100+0.5)/100.;
		System.out.println("평균 a1 = " + a1);
		
		System.out.printf("평균 a2 = %.2f\n", ave);
		
		System.out.println("평균 a3 = " + String.format("%.2f", ave));
		
		String a3 = String.format("%.2f", ave);
		System.out.println("평균 a3 = " + a3);
		
		
	}

}
