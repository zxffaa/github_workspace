import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		char ch[] = {'0','1','2','3','4','5','6','7','8','9',
				'A','B','C','D','E','F'};	
		
		Scanner scn = new Scanner(System.in);
		System.out.print("10진수 : ");
		int dec = scn.nextInt();
		
		System.out.print("변환진수 : ");
		int con = scn.nextInt();

		String str[] = new String[10];//변환진수 저장용
		int cnt=0;
		while(dec != 0) {
			int na = dec % con;
			dec = dec / con;
			str[cnt] = ch[na]+"";
			cnt++;
		}
		System.out.print(con + "진수 : ");
		for(int i=cnt-1; i>=0; i--) {
			System.out.print(str[i]+" ");
		}
	}

}
