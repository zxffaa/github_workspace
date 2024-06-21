import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//입력
		System.out.print("입력자료:");
		String name = scn.next();
		int k= scn.nextInt();
		int e= scn.nextInt();
		int m= scn.nextInt();
		
		//총점 평균
		int tot = k+e+m;
		double ave = tot / 3.0;
		String grade="F";
		String pass="NoPass";
		switch((int)ave/10) {
			case 10:
			case 9:
				grade="A";
				pass="Pass";
				break;
			case 8:
				grade="B";
				pass="Pass";
				break;
			case 7:
				grade="C";
				pass="Pass";
				break;
			case 6:
				grade="D";
				pass="NoPass";
		}
		//출력
		System.out.printf("이름 : %s\n", name);
		System.out.printf("총점 : %d\n", tot);
		System.out.printf("평균 : %.2f\n", ave);
		System.out.printf("학점 : %s\n", grade);
		System.out.printf("판정 : %s\n", pass);
	}

}
