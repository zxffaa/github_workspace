import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int student[][] = new int[10][11];
		int cnt=0;//인원수
		for(cnt=0; cnt<student.length;cnt++) {
			System.out.print("학생등록:");
			student[cnt][0] = scn.nextInt();//번호입력
			if(student[cnt][0] == 0) {
				break;
			}
			student[cnt][1] = scn.nextInt();//점수1
			student[cnt][2] = scn.nextInt();//점수2
			student[cnt][3] = scn.nextInt();//점수3
			student[cnt][4] = scn.nextInt();//점수4
			student[cnt][5] = scn.nextInt();//점수5
			//최대, 최소, 총점, 평균 구하기
			//int max = student[cnt][1];
			//int min = student[cnt][1];
			//int tot = student[cnt][1];
			student[cnt][6] = student[cnt][1];//최대
			student[cnt][7] = student[cnt][1];//최소
			student[cnt][8] = student[cnt][1];//합계
			for(int i=2; i<=5; i++) {
				if(student[cnt][6] < student[cnt][i]) {//최대
					student[cnt][6] = student[cnt][i];
				}else if(student[cnt][7] > student[cnt][i]) {//최소
					student[cnt][7] = student[cnt][i];
				}
				student[cnt][8] += student[cnt][i];//합계
			}
			//최대-최소을 뺀 합계
			student[cnt][8] = student[cnt][8]-student[cnt][6]-student[cnt][7];
			student[cnt][9] = (int)(student[cnt][8] / 3.0 + 0.5);
		}//for(cnt=0; cnt<student.length;cnt++) 끝
		
		// 순위 구하기 
		for(int i=0; i<cnt; i++) {
			student[cnt][10] = 1;//자신은 1등
			for(int j=0; j<cnt; j++) {
				if(student[i][8] < student[j][8]) {//총점기준
					student[cnt][10]++;
				}
			}
		}
		//입력자료순 출력
		System.out.println("번호\t점수1\t점수2\t점수3\t점수4\t점수5\t최대\t최소\t총점\t평균\t순위");
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<student[i].length;j++) {
				System.out.print(student[i][j] + "\t");
			}
			System.out.print("\n");
		}
		//내림차순 정렬(총점기준) -- 선택정렬
		for(int i=0; i<cnt-1; i++) {
			for(int j=i+1; j<cnt; j++) {
				if(student[i][8] < student[j][8]) {
					//교환
					for(int k=0; k<student[i].length;k++) {//교환할 항목수
						int imsi = student[i][k];
						student[i][k] = student[j][k];
						student[j][k] = imsi;
					}
				}
			}
		}
		
		//최종 출력
		
		
	}

}
