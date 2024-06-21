public class Exam_07 {
	public static void main(String[] args) {
		int score[] = {30,67,55,79,97,65,33,78,96,58,94,32};
		int max = score[0];//최대
		int min = score[0];//최소
		int sum = score[0];//합계
		//입력자료출력 및 최대, 최소, 합계
		System.out.printf("Data : %3d", score[0]);
		for(int i=1; i<score.length; i++) {
			System.out.printf("%3d", score[i]);//출력
			if(max < score[i]) {
				max = score[i];//최대
			}else if(min > score[i]) {
				min = score[i];//최소
			}
			sum += score[i];//합계
		}
		System.out.println();
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
		System.out.println("합계 : " + (sum-max-min));
		
	}

}
