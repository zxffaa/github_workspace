import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		System.out.print("수치입력(1~?:");
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int a[]=new int[6];
		for(int i=1;i<=100;i++) {
			int r = (int) (Math.random() * m) + 1;
			a[(r-1)]++;
		}
		for(int l=0;l<a.length;l++) {
			System.out.print((l+1)+":");
			for(int j=0;j<a[l];j++) {
				System.out.print("*");
			}
			System.out.println(":"+a[l]);
		}
		System.out.println();
		int ma=a[0];
		int mi=0;
		for(int g=0;g<a.length;g++) {
			ma=Math.max(ma, a[g]);
			mi=Math.min(ma, a[g]);
		}
		System.out.println(ma);
		System.out.println(mi);
		
	}

}
