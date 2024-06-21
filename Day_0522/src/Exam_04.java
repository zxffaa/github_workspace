import java.util.Scanner;

public class Exam_04 {
	static int dataInput(Scanner input,int[][] student) {
	int cnt=0;
		while(cnt<10) {
			System.out.print("학생정보입력:");
			student[cnt][0] = input.nextInt();
			if(student[cnt][0]==0) {
				break;
			}
			student[cnt][1] = input.nextInt();
			student[cnt][2] = input.nextInt();
			student[cnt][3] = input.nextInt();
			student[cnt][4] = student[cnt][1]+student[cnt][2]+student[cnt][3];
		cnt++;
		}
		return cnt;
	}
	
	static void dataRank(int [][] student,int cnt) {
		int i=0,j=0;
		for(i=0; i<cnt;i++) {
			student[i][5]=1;
			for(j=0; j<6;j++) {
				if(student[i][4] < student[j][4]) {
					student[i][5]++;
				}
			}
		}
	}
	
	static void dataSort(int[][] student, int cnt) {
		int t=0;
		for(int i=0; i<cnt-1; i++) {
			for(int j=i+1; j<cnt; j++) {
				if(student[i][5] > student[j][5]) {//오름차순
					t = student[i][0];student[i][0] = student[j][0];student[j][0] = t;
					t = student[i][1];student[i][1] = student[j][1];student[j][1] = t;
					t = student[i][2];student[i][2] = student[j][2];student[j][2] = t;
					t = student[i][3];student[i][3] = student[j][3];student[j][3] = t;
					t = student[i][4];student[i][4] = student[j][4];student[j][4] = t;
					t = student[i][5];student[i][5] = student[j][5];student[j][5] = t;
				}
			}
		}		
	}
	
	static void dataPrint(int[][] student, int cnt, String str) {
		System.out.print(str+"\n");
		for(int i=0; i<cnt; i++) {
			for(int j=0;j<student[j].length;j++) {
				System.out.print(student[i][j]+"\t");
			}
			System.out.print("\n");	
		}
	}
	
	public static void main(String[] args) {
		int student[][]=new int[10][6];
		Scanner input =new Scanner(System.in);
		int cnt=dataInput(input,student);
		dataRank(student,cnt);
		dataPrint(student,cnt,"입력 자료:");
		dataSort(student,cnt);
		dataPrint(student,cnt,"정렬 자료:");
	}
}
