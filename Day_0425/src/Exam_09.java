import java.util.Scanner;
//for()
public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력점수:");
		int val = scn.nextInt();
		int max=val,min=val,sum=val;
		for(int i=2; i<=7;i++) {
			System.out.print("입력점수:");
			val = scn.nextInt();
			if(val < 1 || val > 100) {
				System.out.println("입력오류");
				i--;
				continue;
			}
			//합계, 최대, 최소
			sum += val;
			if(max<val) {
				max=val;
			}else if(min>val) {
				min=val;
			}
		}
		//평균, 학점
		sum = sum - max - min;
		double ave = sum /5.;
		char ch = '\0';//공백문자
		if(ave>=87) {
			ch='A';
		}else if(ave>=73) {
			ch='B';
		}else if(ave>=55) {
			ch='C';
		}else {
			ch='D';
		}
		//출력
		System.out.printf("최대점수 : %d\n",max);
		System.out.printf("최소점수 : %d\n",min);
		System.out.printf("합계    : %d\n",sum);
		System.out.printf("평균    : %.2f(%c)\n",ave,ch);
	}
}
