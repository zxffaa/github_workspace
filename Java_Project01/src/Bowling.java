import java.util.Scanner;

public class Bowling {

	public static int input() {
		Scanner input = new Scanner(System.in);
		int b = 0;
		boolean sw = true;
		while (sw) {
			System.out.print("점수를 입력해주세요:");
			int a = input.nextInt();
			if (a > 10 || a < 0) {
				System.out.print("다시 점수를 입력해주세요\n");
				continue;
			}
			sw = false;
			b = a;
		}
		return b;
	}

	public static void main(String[] args) {

		Score[] scores = new Score[10]; // 도합 10개의 총합
		int first = 0; // 첫번쨰 수
		int second = 0; // 두번쨰
		int third = 0; // 세번쨰
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new Score();// 객체 배열 선언
			first = input();
			if (first == 10 && i == 9) {
				second = input();
				third = input();

			} else if (first == 10) {
				second = 0;
			} else {
				second = input();
			}
			if (first + second == 10 && i == 9) {
				third = input();
			}
			scores[i].first_Score = first;
			scores[i].Second_Score = second;
			scores[i].third_Score = third;
		}
		Score s = new Score(scores);
		System.out.println("총점 : " + s.tot);
	}
}
