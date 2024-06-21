import java.util.Scanner;

public class Exam_03 {
		//배열복제
		static int[][] arrayCopy(int stu[][]) {
			//1차원 배열 int arr[] = stu.clone();
			int arr[][] = new int[stu.length][stu[0].length];
			for(int i=0; i<arr.length;i++) {
				for(int j=0; j<arr[i].length;j++) {
					arr[i][j] = stu[i][j];
				}
			}
			return arr;
		}
		//1. 소수구하기
		static void priScore() {
			Scanner scn = new Scanner(System.in);
			System.out.print("2~n까지 소수:");
			int n = scn.nextInt();
			int cnt=0;//소수갯수
			for(int i=2; i<=n; i++) {
				int j;
				for(j=2; j<i; j++) {
					if(i%j==0) {
						break;
					}
				}
				if(i==j) {
					System.out.printf("%3d", i);
					cnt++;
					if(cnt%7==0) {
						System.out.print("\n");
					}
				}
			}
			System.out.print("\n");
			System.out.printf("소수는 총 %d 입니다\n", cnt);
		}
		//진법변환
		static void decCon() {
			char ch[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			Scanner scn = new Scanner(System.in);
			
			System.out.print("10진수 입력 : ");
			int dec = scn.nextInt();
			System.out.print("변환진수(2,8,16,0) : ");
			int con = scn.nextInt();
			int temp = dec;
			String str="";
			while(temp != 0) {
				int na = temp % con;
				str = ch[na] + str;
				temp /= con;
			}
			System.out.printf("%d진수는 %d진수로 %s입니다.\n",dec,con,str);
		}
		//3. 배열정렬
		static void arraySort(int stu[][]) {
			//배열복제
			int temp[][] = arrayCopy(stu);
			Scanner scn = new Scanner(System.in);
			System.out.print("오름차순:1/내림차순:2 ?");
			int menu = scn.nextInt();
			ascSortdesc(temp, menu);
			System.out.println("---------- Source Data------------");
			System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
			for(int i=0; i<stu.length;i++) {
				for(int j=0; j<stu[i].length;j++) {
					System.out.print(stu[i][j]+"\t");
				}
				int tot = stu[i][1]+stu[i][2]+stu[i][3];
				System.out.print(tot+"\t" + tot/3 + "\n");
			}
			System.out.println("----------Data Sort------------");
			System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
			for(int i=0; i<temp.length;i++) {
				for(int j=0; j<temp[i].length;j++) {
					System.out.print(temp[i][j]+"\t");
				}
				int tot = temp[i][1]+temp[i][2]+temp[i][3];
				System.out.print(tot+"\t" + tot/3 + "\n");
			}

		}
		//3.(1)오름차순정렬
		static void ascSortdesc(int arr[][], int sw) {
			if(sw==1) {
				for(int i=0; i<arr.length-1; i++) {
					for(int j=i+1; j<arr.length;j++) {
						if(arr[i][0] > arr[j][0]) {
							for(int k=0; k<arr[i].length;k++) {
								int t = arr[i][k];
								arr[i][k] = arr[j][k];
								arr[j][k] = t;
							}
						}
					}
				}
			}else {//내림차순
				for(int i=0; i<arr.length-1; i++) {
					for(int j=i+1; j<arr.length;j++) {
						if(arr[i][0] < arr[j][0]) {
							for(int k=0; k<arr[i].length;k++) {
								int t = arr[i][k];
								arr[i][k] = arr[j][k];
								arr[j][k] = t;
							}
						}
					}
				}
				
			}
		}
		//4. 2진검색
		static void binSearch(int stu[][]) {
			//배열복제
			int temp[][] = arrayCopy(stu);
			ascSortdesc(temp, 1);//오름차순정렬
	/*
			System.out.println("----------Data Sort------------");
			System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
			for(int i=0; i<temp.length;i++) {
				for(int j=0; j<temp[i].length;j++) {
					System.out.print(temp[i][j]+"\t");
				}
				int tot = temp[i][1]+temp[i][2]+temp[i][3];
				System.out.print(tot+"\t" + tot/3 + "\n");
			}
	*/
			Scanner scn = new Scanner(System.in);
			System.out.print("번호입력:");
			int bun = scn.nextInt();
			//2진검색
			int low=0,high=temp.length-1;
			boolean flag=true;//데이터를 찾으면 flase
			while(low<=high) {
				int med = (low+high)/2;//중앙값
				if(temp[med][0]==bun) {
					flag = false;
					System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
					System.out.print(temp[med][0] + "\t" + temp[med][1] + "\t");
					System.out.print(temp[med][2] + "\t" + temp[med][3] + "\t");
					int tot = temp[med][1] + temp[med][2] + temp[med][3];
					System.out.print(tot + "\t" + tot/3 + "\n");
					break;
				}else if(temp[med][0] < bun) {
					low = med + 1;
				}else {
					high = med - 1;
				}
			}
			if(flag) {
				System.out.println("등록된 학생이 없음");
			}
		}
		public static void main(String[] args) {
			int stu[][]= {{1101,90,70,85},
					{1105,88,80,88},{1108,79,90,79},
					{1102,90,75,95},{1104,80,65,70},
					{1107,88,88,60},{1103,95,85,85}};
			Scanner scn = new Scanner(System.in);
			while(true) {
				System.out.println("[1] 소수구하기");
				System.out.println("[2] 진법변환하기");
				System.out.println("[3] 배열정렬");
				System.out.println("[4] 2진검색");
				System.out.println("[5] 프로그램종료");
				System.out.print("메뉴선택(1~5) : ");
				int menu = scn.nextInt();
				if(menu == 1) {
					priScore();
				}else if(menu==2) {
					decCon();
				}else if(menu==3) {
					arraySort(stu);
				}else if(menu==4) {
					binSearch(stu);
				}else if(menu==5) {
					break;//프로그램종료
				}else {
					System.out.println("입력오류");
				}
			}

	}

}
