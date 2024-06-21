import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//2차원 배열선언
		int apt[][] = new int[11][8];//row(동),col(연령대)
		//입력
		while(true) {
			System.out.print("등록:");
			int row = scn.nextInt();//동코드
			if(row==0) {
				break;
			}
			scn.next();//이름
			int age = scn.nextInt();//나이
			int col = age / 10;
			if(col>6) {//60이상
				col=6;
			}
			apt[row-1][col]++;
			apt[row-1][7]++;//동별합계
			apt[10][col]++;//연령대별 합계
			apt[10][7]++;//전체 합계
		}
		//출력
		System.out.println("동\t0~9\t10~19\t20~29\t30~39\t40~49\t50~59\t60이상\t합계");
		for(int i=0; i<apt.length-1;i++) {
			System.out.print((i+1)+"\t");//동출력
			for(int j=0; j<apt[i].length;j++) {
				System.out.print(apt[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.print("합계\t");
		for(int i=0; i<apt[0].length;i++) {
			System.out.print(apt[10][i]+"\t");
		}
	}

}
