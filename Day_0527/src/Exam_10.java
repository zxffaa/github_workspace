
public class Exam_10 {

	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		st1.stuInput2();
		System.out.println("----------------");
		st1.stuInput2();
		System.out.println("----------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		st1.stuOutput();
		st2.stuOutput();

	}

}
