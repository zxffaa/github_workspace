import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("10진수입력:");
			StringBuffer sb = new StringBuffer();
			int a = input.nextInt();
			if (a == -99) {
				break;
			}
			// 진법변환
			int temp = a;
			do {
				int mok = temp / 2;
				int na = temp % 2;
				sb.insert(0, na);
				temp = mok;
			} while (temp != 0);
			System.out.printf("10진수 %d는 2진수%s입니다\n", a, sb);
			sb.delete(0, sb.length());
		}
	}
}
