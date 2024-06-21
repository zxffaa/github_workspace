import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
	static int User[] = new int[3];
	static int Com[] = new int[3];
	static int Save[] = new int[3];

	static void Random(int p[]) {
		for (int i = 0; i < p.length; i++) {
			p[i] = (int) (Math.random() * 9 + 1);
		}
		if (p[0] == p[1] || p[0] == p[2] || p[1] == p[2]) {
			Random(p);
		}
	}

	static int[] user(int User_Input) {

		int first, second, third;

		System.out.print("\n");
		first = User_Input / 100;
		second = (User_Input / 10) % 10;
		third = User_Input % 10;
		if (first == second || second == third) {
			System.out.print("숫자중복입력\n");
			user(User_Input);
		}
		int User_baseball[] = { first, second, third };
		return User_baseball;
	}

	static boolean Count(int Num[], int random[], int St, int ball) {
		for (int i = 0; i < 4; i++) {

			int st1 = St;
			int ba1 = ball;

			int st2 = 0;
			int ba2 = 0;

			// 스트라이크
			if (Num[0] == random[0]) {
				st2++;
			}
			if (Num[1] == random[1]) {
				st2++;
			}
			if (Num[2] == random[2]) {
				st2++;
			}

			// 볼
			if (random[0] == Num[1] || random[0] == Num[2]) {
				ba2++;
			}
			if (random[1] == Num[0] || random[1] == Num[2]) {
				ba2++;
			}
			if (random[2] == Num[0] || random[2] == Num[1]) {
				ba2++;
			}
			if (st1 != st2 || ba1 != ba2) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를입력해주세요:");
		int User_Input = input.nextInt();
		int Strike = 0, Ball = 0, cnt = 0;
		Random(Com);
		User = user(User_Input);
		for (int i = 0; i < User.length; i++) {
			for (int j = 0; j < Com.length; j++) {
				if (User[i] == Com[j]) {
					if (i == j) {
						Strike++;
					} else {
						Ball++;
					}
				}
			}
		}
		System.out.println(Arrays.toString(User));
		System.out.println(Arrays.toString(Com));
		System.out.println(Strike);
		System.out.println(Ball);
		cnt = 0;

		for (int i = 123; i < 988; i++) {
			int a2 = i / 100; // 100의 자리
			int b2 = (i / 10) % 10; // 10의 자리
			int c2 = i % 10; // 1의 자리
			int save[] = { a2, b2, c2 };

			if (Count(User, save, Strike, Ball)) {
				cnt++;
			}

		}
		System.out.println(cnt);

	}

}
