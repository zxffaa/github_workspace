//키보드로 점수를 입력
// 입력된 점수가 90이상 'A', 80이상 'B', 그외 'C'

import java.util.Scanner;

public class Exam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수입력 : ");
		int score = scn.nextInt();
		
		char ch = (score>=90)?'A' : (score>=80)?'B':'C';
		System.out.println(score + ":" + ch);
	}

}
