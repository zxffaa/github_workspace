
public class Exam_02 {
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
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + ave);
		
		
	}

}
