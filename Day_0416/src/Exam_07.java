import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//입력작업
		System.out.print("번호 이름 :");
		int bun = scn.nextInt();
		String name = scn.next();
		System.out.print("국어 영어 수학 :");
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		//계산작업
		int tot = kor + eng + mat;
		double ave = tot / 3.;
		//출력작업
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(bun+"\t"+name+"\t"+kor+"\t"+
								eng+"\t"+mat+"\t"+tot+"\t"+ave);

		System.out.print(bun+"\t"+name+"\t");
		System.out.print(kor+"\t"+eng+"\t"+mat+"\t");
		System.out.println(tot+"\t"+ave);
	}

}
