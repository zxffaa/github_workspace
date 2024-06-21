//화폐 단위별 매수 구하기
//- 키보드로 급여(금액)을 입력 받아서 화폐 단위별 매수를 구하여 출력
/*  급여(금액) : 176668
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

 * 
 */

import java.util.Scanner;

public class Exam_13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("급여(금액):");
		int pay = scn.nextInt();
		int money=50000;
		for(int i=1; i<=10;i++) {
			System.out.print(money+"원 :");
			int mok = pay / money;
			System.out.println(mok);
			pay = pay % money;//pay %= money
			if(i%2==1) {
				money /= 5;
			}else {
				money /= 2;
			}
		}
	}

}
