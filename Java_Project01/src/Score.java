
public class Score {
	int first_Score = 0;
	int Second_Score = 0;
	int third_Score = 0;
	int sum = 0;
	int tot = 0;

	Score() {
	}

	Score(Score[] Scores) {
		for (int i = 0; i < Scores.length; i++) {
			// 스트라이크일경우 뒤에 숫자를 더하지만 또한번 스트라이크 일경우 뒤에 뒤에 숫자를 더한다
			if (Scores[i].first_Score == 10) {
				if (i + 1 < Scores.length && Scores[i + 1].first_Score == 10 && i + 2 < Scores.length) {
					Scores[i].sum = 10 + Scores[i + 1].first_Score + Scores[i + 2].first_Score;
				} else {
					Scores[i].sum = 10 + Scores[i + 1].first_Score + Scores[i + 1].Second_Score;
				}
				// 스페어 상황시 처리한다
			} else if (i + 1 < Scores.length && Scores[i].first_Score + Scores[i].Second_Score == 10) {
				Scores[i].sum = 10 + Scores[i + 1].first_Score;
				// 스페어도 아니고 스트라이크도 아닌경우 일반합
			} else {
				Scores[i].sum = Scores[i].first_Score + Scores[i].Second_Score;
			}
			// 마지막 단계전 총합
			this.tot += Scores[i].sum;
			// 마지막 10번째일경우 3개의 점수의 합이기에 따로 더한다(배열은 0부터이니 i번쨰는 9)
			if (i == 9) {
				if (Scores[i].first_Score == 10 || Scores[i].first_Score + Scores[i].Second_Score == 10) {
					Scores[i].sum += Scores[i].third_Score;
					this.tot += Scores[i].third_Score;
				}
			}
		}
	}

}
