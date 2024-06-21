import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		int val[] = new int[7];
		Scanner scn = new Scanner(System.in);
		//입력
		for(int i=0; i<=7; i++) {
			System.out.print("점수 " + (i+1) +" : ");
			val[i] = scn.nextInt();
		}
		//출력
		
		//계산
		int max = val[0];
		int min = val[0];
		int sum = val[0];
		for(int i=1; i<7; i++) {
			if(max < val[i]) {
				max = val[i];
			}else if(min > val[i]) {
				min = val[i];
			}
			sum += val[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + (sum-max-min));

	}

}
