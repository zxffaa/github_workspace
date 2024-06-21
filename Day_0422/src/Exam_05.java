//키보드로 정수입력 정수가 80이상이면서 95미만이면 "Pass"
//아니면 "NoPass" 출력
//이상, 이하  >=, <=

import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력:");
		int val = scn.nextInt();
		if(val>=80 && val<95) {
			System.out.print("Pass");
		}else {
			System.out.print("NoPass");
		}
		String str="";
		if(val>=80) {
			if(val<95) {
				//System.out.print("Pass");
				str="Pass";
			}else{
				//System.out.print("NoPass");
				str="Nopass";
			}
		}else{
			//System.out.print("NoPass");
			str="NoPass";
		}
		System.out.print(str);
	}

}
