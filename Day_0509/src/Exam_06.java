import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수 1 : ");
		int a = scn.nextInt();
		int max = a;
		int min = a;
		int sum = a;
		for(int i=2; i<=7; i++) {
			System.out.print("점수 " + i +" : ");
			a = scn.nextInt();
			if(max < a) {
				max = a;
			}else if(min > a) {
				min = a;
			}
			sum += a;
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + (sum-max-min));

	}

}
