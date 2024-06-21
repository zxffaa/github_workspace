import java.util.Scanner;

public class Exam_02 {
	static void etc02(int a) {
		String bin="";
		int b=a;
		int na=0;
		while(a !=0){
			na =a %2;
			bin=na+bin;
			a/=2;
			}
		System.out.printf("10진수%d는2진수:%s입니다\n",b,bin);
	}
	static void etc08(int a) {
		String bin="";
		int b=a;
		int na=0;
		while(a !=0){
			na =a %8;
			bin=na+bin;
			a/=8;
			}
		System.out.printf("10진수%d는8진수:%s입니다\n",b,bin);
	}
	static void etc16(int a) {
		String str="";
		int b=a;
		while(a != 0) {
			int na = a % 16;//나머지
			a = a / 16;//몫
			switch(na) {
				case 10:
					str = "A" + str; break;
				case 11:
					str = "B" + str; break;
				case 12:
					str = "C" + str; break;
				case 13:
					str = "D" + str; break;
				case 14:
					str = "E" + str; break;
				case 15:
					str = "F" + str; break;
				default:
					str = na + str;
			}
		}//변환종료
		System.out.printf("10진수%d는16진수:%s입니다\n",b,str);
	}
	static void binary() {
		Scanner input =new Scanner(System.in);
		System.out.print("소수입력:");
		int a=input.nextInt();
		System.out.print("2~"+a+"까지 소수");
		int cnt=0,i,j;
		for(i=2; i<=a; i++) {
			for(j=2; j<i; j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				if(cnt%7==0) {
					System.out.print("\n");
				}	
				System.out.print(i+" ");
				cnt++;
			}
		}
		System.out.print("\n");
		System.out.print("소수는 총"+cnt+"입니다\n");
	}
	static void formation() {
		Scanner input =new Scanner(System.in);
		System.out.print("10진수입력:");
		int a=input.nextInt();
		System.out.print("변환진수(2,8,16,0)입력:");
		int b=input.nextInt();
		switch (b) {
		case 2:
			etc02(a);
			break;
		case 8:
			etc08(a);
			break;
		case 16:
			etc16(a);
			break;
		case 0:
			etc02(a);
			etc08(a);
			etc16(a);
			break;
		default:
		System.out.print("변환진수 입력오류");
			break;
		}	
	}
	static void Sort(int Sort[][]) {
		Scanner input =new Scanner(System.in);
		System.out.print("오름차순1:내림차순2");
		int i=0,j=0;
		int a=input.nextInt();
		int t=0;
		for(i=0; i<Sort.length-1; i++) {
			for(j=i+1; j<Sort.length; j++) {
				if(a==1) {
					if(Sort[i][0] > Sort[j][0]) {
						t = Sort[i][0];Sort[i][0] = Sort[j][0];Sort[j][0] = t;
						t = Sort[i][1];Sort[i][1] = Sort[j][1];Sort[j][1] = t;
						t = Sort[i][2];Sort[i][2] = Sort[j][2];Sort[j][2] = t;
						t = Sort[i][3];Sort[i][3] = Sort[j][3];Sort[j][3] = t;
	
					}
				}else {
					if(Sort[i][0] < Sort[j][0]) {
						t = Sort[i][0];Sort[i][0] = Sort[j][0];Sort[j][0] = t;
						t = Sort[i][1];Sort[i][1] = Sort[j][1];Sort[j][1] = t;
						t = Sort[i][2];Sort[i][2] = Sort[j][2];Sort[j][2] = t;
						t = Sort[i][3];Sort[i][3] = Sort[j][3];Sort[j][3] = t;
					
					}
				}		
			}
		}
		
		for( i=0; i<Sort.length; i++) {
			for(j=0;j<Sort[j].length;j++) {
				System.out.print(Sort[i][j]+"\t");
			}
			System.out.print("\n");	
		}
	}
	static void Serch(int Sort[][]) {
		Scanner input =new Scanner(System.in);
		
	}
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int score[][]= {{1101,90,70,85},{1105,88,80,88},{1108,79,90,79},{1102,90,73,95},{1104,80,75,95},{1107,88,88,60},{1103,95,85,85}};
		while(true) {
			System.out.println("[1]소수구하기");
			System.out.println("[2]진법변환하기");
			System.out.println("[3]배열정렬");
			System.out.println("[4]2진검색");
			System.out.println("[5]프로그램종료");
			System.out.print("메뉴선택(1~5):");
			int menu =input.nextInt();
			switch(menu) {
			case 1:
				binary();
				break;
			case 2:
				formation();
				break;
			case 3:
				Sort(score);
				break;
			case 4:
				Serch(score);
				break;
			case 5:
			System.out.println("프로그램 종류");
				System.exit(1);
				break;
			default:
			System.out.println("메뉴선택 오류!");
				break;
			}
		}
	}
}
