import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int hak[][] = new int[10][7];
		String name[] = new String[10];
		//입력
		int cnt=0;
		while(cnt<10) {
			System.out.print("학생등록:");
			hak[cnt][0] = scn.nextInt();//번호
			if(hak[cnt][0] == 0) {
				break;
			}
			name[cnt] = scn.next();//이름
			hak[cnt][1] = scn.nextInt();//국어
			hak[cnt][2] = scn.nextInt();//영어
			hak[cnt][3] = scn.nextInt();//수학
			hak[cnt][4] = hak[cnt][1] + hak[cnt][2] + hak[cnt][3];
			hak[cnt][5] = hak[cnt][4] / 3;
			cnt++;
		}
		//순위계산
		
		//출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t순위");
		for(int i=0; i<cnt; i++) {
			System.out.print(hak[i][0] + "\t" + name[i] + "\t");//번호, 이름 출력
			for(int j=1; j<hak[i].length;j++) {
				System.out.print(hak[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

}
