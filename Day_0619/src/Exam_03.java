import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true) {
			System.out.print("10진수입력:");
			int a=input.nextInt();
			if(a==-99) {break;}
			//진법변환
			String bin="";
			int temp=a;
			while(temp!=0) {
				int mok=temp/2;
				int na=temp%2;
				bin=na+bin;
				temp=mok;
			}
			System.out.printf("%d진수:%d\n",10,a);
			System.out.printf("2진수:%s\n",bin);
			
		}
		
		
	}

}
