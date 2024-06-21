//키보드로 5개의 정수 데이터 입력 배열에 저장 후 출력

import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int var[] = new int[5];
/*		
		System.out.print("입력:");
		for(int i=0; i<var.length;i++) {
			var[i] = scn.nextInt();
		}
*/
		for(int i=0; i<var.length; i++) {
			System.out.print((i+1)+"입력:");
			var[i] = scn.nextInt();
		}
		System.out.print("데이터 출력:");
		for(int i=0; i<5;i++) {
			System.out.print(var[i]+"\t");
		}

	}

}
