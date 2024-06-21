import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int bun[] = new int[10];//번호
		String name[] = new String[10];//이름
		int score[] = new int[10];//점수
		int rank[] = new int[10];//순위
		//입력
		int cnt;
		for(cnt=0; cnt<bun.length;cnt++) {
			System.out.print("입력:");
			bun[cnt] = scn.nextInt();
			if(bun[cnt]==0) {
				break;
			}
			name[cnt] = scn.next();
			score[cnt] = scn.nextInt();
		}
		//출력 테스트
		System.out.println("번호\t이름\t점수\t순위");
		for(int i=0; i<cnt; i++) {
			System.out.print(bun[i]+"\t");
			System.out.print(name[i]+"\t");
			System.out.print(score[i]+"\t");
			System.out.print(rank[i]+"\n");
		}
		
	}

}
