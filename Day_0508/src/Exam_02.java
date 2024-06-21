import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		char ch[] = {'0','1','2','3','4','5','6','7','8','9',
				'A','B','C','D','E','F'};		
		
		System.out.print("10진수 : ");
		int dec = scn.nextInt();
		
		System.out.print("변환진수 : ");
		int con = scn.nextInt();
		
		String str="";
		while(dec != 0) {
			int na = dec % con;
			dec = dec / con;
			str = ch[na] + str;
		}
		System.out.println(con +"진수 :" + str);
	}

}
