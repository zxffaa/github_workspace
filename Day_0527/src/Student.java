import java.util.Scanner;

public class Student {
	String school="OO 대학교";
	String name;
	int bun,kor,eng,mat,tot;
	double ave;
	void stuInput2() {
		Scanner scn = new Scanner(System.in);
		System.out.print("학생등록:");
		bun = scn.nextInt();
		name = scn.next();
		kor = scn.nextInt();
		eng = scn.nextInt();
		mat = scn.nextInt();
		
		totAve();
			
		
	}

	//입력
	void stuInput(int bun, String name, int kor, int eng, int mat) {
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		totAve();
		stuOutput();
	}
	//총점, 평균계산 메소드
	void totAve() {
		tot = kor + eng + mat;
		ave = (int)(tot / 3.0);
	}
	//출력
	void stuOutput() {
		//System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(school + "\t");
		System.out.print(bun + "\t");
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(tot + "\t");
		System.out.print(ave + "\n");

	}
}
