import java.util.Scanner;

//키보드로 번호, 이름,국어 ,영어,수학 입력
//번호 이름 국어 영어 수학 총점 평균

public class Exam_09 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	Student st1=new Student();
	Student st2=new Student();
	Student st3=new Student();
	Student st4=new Student();
	st4.school="xx 중학교";
	System.out.println("학교\t번호\t이름\t국어\t영어\t수학\t총점\t평균");
	st1.stuInput(1, "김학생", 90, 88, 75);
	//st1.totAve();
	//st1.stuOutput();
	st2.stuInput(2, "이학생", 77,88,99);
	//st2.totAve();
	//st2.stuOutput();
	st2.stuInput(3, "오학생", 70,80,90);
	st2.stuInput(4, "강학생", 87,87,95);
	}

}
