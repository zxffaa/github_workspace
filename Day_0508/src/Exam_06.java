/* 화폐단위별 매수 계산 
급여(금액) : 176668
50000원 :3
10000원 :2
5000원 :1
1000원 :1
500원 :1
100원 :1
50원 :1
10원 :1
5원 :1
1원 :3
 */

import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("급여입력 : ");
		int pay = scn.nextInt();
		int money[]= {50000,10000,5000,1000,500,100,50,10,5,1};
		for(int i=0; i<10; i++) {//화폐단위 10종류
			System.out.print(money[i] + " : ");
			int mok = pay / money[i];
			System.out.println(mok);
			pay = pay % money[i];
			if(pay==0) {
				break;
			}
		}
	}

}
