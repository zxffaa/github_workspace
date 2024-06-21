import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Score[] scores = new Score[10]; //도합 10개의 총합
		int first = 0; //첫번쨰 수
		int second = 0; //두번쨰
		int third = 0; //세번쨰

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new Score();//객체 배열 선언
            first = input.nextInt();  
            if (first == 10 && i == 9) {
                second = input.nextInt();
                third = input.nextInt();
            } else if (first == 10) {
                second = 0;
            } else {
                second = input.nextInt();
                if (first + second == 10 && i == 9) {
                    third = input.nextInt();
                }
            }
            scores[i].first_Score = first;
            scores[i].Second_Score = second;
            scores[i].third_Score = third;
        }
		Score s = new Score(scores);
		System.out.println("총점 : " + s.tot);
	}
}
