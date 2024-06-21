import java.util.Scanner;
//점수 최대 10개 입력 오름차순 정렬 후 출력 예시
//입력자료에 -99가 있을 경우 출력후 종료
public class Exam_02 {
	static void dataPrint(int[] score, int cnt, String str) {
		System.out.print(str);
		for(int i=0; i<cnt; i++) {
			System.out.printf("%3d", score[i]);
		}
		System.out.print("\n");		
	}
	//정렬메소드
	static void dataSort(int[] score, int cnt) {
		for(int i=0; i<cnt-1; i++) {
			for(int j=i+1; j<cnt; j++) {
				if(score[i] > score[j]) {//오름차순
					int t = score[i];
					score[i] = score[j];
					score[j] = t;
				}
			}
		}		
	}
	
	public static void main(String[] args) {
		int score[]=new int[10];
		Scanner input =new Scanner(System.in);
		int cnt=0;
		for(cnt=0;cnt<10;cnt++) {
			System.out.print("자료입력:");
			score[cnt]=input.nextInt();
			if(score[cnt]==-99) {
				break;
			}
		}
		
		//입력자료 출력
				dataPrint(score, cnt,"입력 자료:");
				//오름차순 정렬
				dataSort(score, cnt);
				//정렬된 내용 출력
				dataPrint(score, cnt,"정렬 자료:");
				
	}

}
