
public class Exam_03 {
	public static void main(String[] args) {
		//입력작업
		int bun = 1101;
		String name = "김학생";
		int kor = 95;
		int eng = 88;
		int mat = 91;
		
		//계산작업
		int tot = kor + eng + mat;
		double ave = tot / 3;
		
		//출력작업
		System.out.println("번호\t이름\t총점\t평균");
		System.out.println(bun+"\t"+name+"\t"+tot+"\t"+ave);
		System.out.println("----------------------------------");
		System.out.println("번호\t이름\t총점\t평균");
		System.out.print(bun+"\t");
		System.out.print(name+"\t");
		System.out.print(tot+"\t");
		System.out.print(ave+"\n");
		

	}

}
