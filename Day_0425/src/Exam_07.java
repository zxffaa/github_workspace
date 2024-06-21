import java.util.Scanner;
// for() 문이용
public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int max=0, min=101, sum=0;
		System.out.print("입력점수 :");
		for(int i=1; i<=7; i++) {
			int val = scn.nextInt();
			if(val < 1 || val > 100) {
				i--;
				continue;
			}
			//최대, 최소, 합계
			sum += val;
			if(max < val) {
				max = val;
			}
			if(min > val) {
				min = val;
			}
		}
		System.out.printf("최대값 : %d\n", max);
		System.out.printf("최소값 : %d\n", min);
		System.out.printf("합계(최대-최소): %d\n", sum-max-min);
	}

}
