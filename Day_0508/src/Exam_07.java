import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int money[] = {50000,10000,5000,1000,500,100,50,10,5,1};
		int pay[] = new int[10];
		int cnt=0;//인원수 카운트
		while(cnt<10) {
			System.out.print("급여입력:");
			pay[cnt] = scn.nextInt();
			if(pay[cnt]==0) {
				break;
			}
			cnt++;
		}
		int mtot[] = new int[money.length];
		
		System.out.println("급여\t오만\t일만\t오천\t일천\t오백\t일백\t오십\t일십\t오\t일");
		for(int i=0; i<cnt; i++) {
			System.out.print(pay[i] + "\t");
			//화폐단위별 매수를 구하여 출력
			for(int x=0; x<money.length;x++) {
				int mok = pay[i] / money[x];
				System.out.print(mok + "\t");
				pay[i] = pay[i] % money[x];
				mtot[x] += mok;
			}
			System.out.println();
		}
		System.out.print("합계" + "\t");
		for(int x=0; x<mtot.length; x++) {
			System.out.print(mtot[x] + "\t");
		}
	}

}
