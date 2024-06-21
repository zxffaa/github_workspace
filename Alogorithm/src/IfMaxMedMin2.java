//키보드로 정수 3개입력 대, 중, 소 찾기

import java.util.Scanner;

public class IfMaxMedMin2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 3개입력 :");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int max, med, min;
		if(a>b) {
			if(a>c) {
				max=a;
				if(b>c) {
					med=b;
					min=c;
				}else {
					med=c;
					min=b;
				}
			}else {
				max=c;
				med=a;
				min=b;
			}
		}else if(b>c) {
			max=b;
			if(a>c) {
				med=a;
				min=c;
			}else{
				med=c;
				min=a;
			}
		}else {
			max=c;
			med=b;
			min=a;
		}
		System.out.printf("%d, %d, %d\n",a,b,c);
		System.out.printf("max = %d, med = %d, min= %d\n", max,med,min);
	}//main()

}
