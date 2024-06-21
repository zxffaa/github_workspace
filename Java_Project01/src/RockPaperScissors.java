import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			int r = (int) (Math.random() * 3) + 1;
			System.out.println("안내면 진거 가위바위보!");
			System.out.print("가위(1),바위(2),보(3):");
			int a = input.nextInt();
			if (a != 1 && a != 2 && a != 3) {
				System.out.println("삐빅 입력했습니다!");
				continue;
			}
			switch (a - r) {
			case -2:
				System.out.println("유저:가위");
				System.out.println("컴퓨터:보");
				System.out.println("승리하셨습니다!");
				break;
			case 1:
				if (r == 1) {
					System.out.println("유저:바위");
					System.out.println("컴퓨터:가위");
					System.out.println("승리하셨습니다!");
				} else {
					System.out.println("유저:보");
					System.out.println("컴퓨터:바위");
					System.out.println("승리하셨습니다!");
				}
				break;
			case -1:
				if (r == 2) {
					System.out.println("유저:가위");
					System.out.println("컴퓨터:바위");
					System.out.println("패배했습니다!");
				} else {
					System.out.println("유저:바위");
					System.out.println("컴퓨터:보");
					System.out.println("패배했습니다!");
				}
				break;
			case 2:
				System.out.println("유저:보");
				System.out.println("컴퓨터:바위");
				System.out.println("승리하셨습니다!");
				break;
			default:
				System.out.println("비겼습니다");
				break;
			}
			System.out.print("끝내시겠습니까?:(Yes/No)");
			String b = input.next();
			if (b.equals("Yes")) {
				break;
			}
		}
	}
}
