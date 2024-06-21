//키보드 입력

import java.util.Scanner;
/* 정수 : nextInt(), 실수 : nextDouble(), 문자열 next()
 * 한줄입력 : nextLine(),
 * 
 */
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력:");
		int intVal = scn.nextInt();
		System.out.print("이름입력:");
		String name = scn.next();
		
		System.out.println("입력된 값은 " + intVal);
		System.out.println("입력된 이름은 " + name);
		
	}

}
