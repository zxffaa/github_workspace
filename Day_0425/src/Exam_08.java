import java.util.Scanner;
// while() 문이용
public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("입력점수 :");
		int val = scn.nextInt();
		int max = val,min=val,sum=val;
		int cnt=1;//데이터수
		
		while(cnt<7) {
			val = scn.nextInt();
			if(val < 1 || val > 100) {
				continue;
			}
			//최대, 최소, 합계
			cnt++;
			sum += val;
			if(max < val) {
				max = val;
			}else if(min > val) {
				min = val;
			}
		}
		System.out.printf("최대값 : %d\n", max);
		System.out.printf("최소값 : %d\n", min);
		System.out.printf("합계(최대-최소): %d\n", sum-max-min);
	}

}
