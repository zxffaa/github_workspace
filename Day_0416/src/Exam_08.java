//데이터 형변환
public class Exam_08 {
	public static void main(String[] args) {
		//자동 형변환 int < double
		int a=77;
		double b = a;
		
		//강제형변환 (데이터타입)
		double c = 3.14;
		int d = (int)c;
		
		//반올림
		double ave = 87.54678;
		System.out.println("ave = " + ave);
		// 버림
		int ave1 = (int)ave;//87
		System.out.println("ave1 = " + ave1);
		//첫번째자리에서 반올림
		int ave2 = (int)(ave + 0.5);//88
		System.out.println("ave2 = " + ave2);

		//둘째자리에서 반올림
		double ave3 = (int)(ave * 10 + 0.5) / 10.;//87.5
		System.out.println("ave3 = " + ave3);
		System.out.printf("ave3 = %.1f\n", ave);
		//세째자리에서 반올림
		double ave4 = (int)(ave * 100 + 0.5) / 100.;//87.55
		System.out.println("ave4 = " + ave4);
		System.out.printf("ave4 = %.2f\n", ave);

	}

}


