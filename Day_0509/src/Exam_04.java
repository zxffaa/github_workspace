import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수 1 : ");
		int a1 = scn.nextInt();
		System.out.print("점수 2 : ");
		int a2 = scn.nextInt();
		System.out.print("점수 3 : ");
		int a3 = scn.nextInt();
		System.out.print("점수 4 : ");
		int a4 = scn.nextInt();
		System.out.print("점수 5 : ");
		int a5 = scn.nextInt();
		System.out.print("점수 6 : ");
		int a6 = scn.nextInt();
		System.out.print("점수 7 : ");
		int a7 = scn.nextInt();
		
		//int sum = a1+a2+a3+a4+a5+a6+a7;//7개의 합계
		int sum = a1;//7개의 합계
		int max = a1;
		int min = a1;
		
		if(max < a2) {
			max = a2;
		}else if(min > a2) {
			min = a2;
		}
		sum += a2;
		
		if(max < a3) {
			max = a3;
		}else if(min > a3) {
			min = a3;
		}
		sum += a3;
		
		if(max < a4) {
			max = a4;
		}else if(min > a4) {
			min = a4;
		}
		sum += a4;
		
		if(max < a5) {
			max = a5;
		}else if(min > a5) {
			min = a5;
		}
		sum += a5;
		
		if(max < a6) {
			max = a6;
		}else if(min > a6) {
			min = a6;
		}
		sum += a6;
		
		if(max < a7) {
			max = a7;
		}else if(min > a7) {
			min = a7;
		}
		sum += a7;
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + (sum-max-min));

	}

}
