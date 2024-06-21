import java.util.Scanner;

public class Exam_12 {
	 static void one(int a) {
		 	int s=0;
		 	for(int i=1;i<=a;i++) {s+=i;}
		 	System.out.printf("1~%d 합게:%d\n",a,s);
		    }
	 static void two(int b) {
		 	int s=0;
		 	for(int i=1;i<=b;i++) {if(i%2==1) {s+=i;}
		 		}
		 	System.out.printf("1~%d 홀수 합게:%d\n",b,s);
		    }
	 static void three(int c) {
		 	int s=0;
		 	for(int i=1;i<=c;i++) {if(i%2==0) {s+=i;}}
		 	System.out.printf("1~%d 짝수 합게:%d\n",c,s);
		    }
	 static void four(int f) {
		int sum=0;
		for(int i=2; i<=f; i++) {
			int j;
			for(j=2; j<i; j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				
				sum += i;
			}
		}
		System.out.printf("1 ~ %d 소수 합 : %d\n",f, sum);
	 }
	 static void five(int f) {
		 	System.out.print("시스템종료");
		 	System.exit(1);
		    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true) {
			System.out.print("작업번호를 입력:");
			int workNumber=input.nextInt();
			System.out.print("점수를 입력:");
			int score=input.nextInt();
			switch(workNumber) {
			case 1:
				one(score);
				break;
			case 2:
				two(score);
				break;
			case 3:
				three(score);
				break;
			case 4:
				four(score);
				break;
			case 5:
				five(score);
				break;
			default:
				System.out.println("다시입력해주세요");
				break;
			}
		}
		
	}

}
