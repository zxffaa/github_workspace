
public class Exam_03 {
	public static void main(String[] args) {
		int score[]= {80,90,70,85,77};
		int rank[] = new int[5];
		
		for(int i=0; i<score.length;i++) {
			rank[i]=1;
			for(int j=0; j<score.length;j++) {
				if(score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		//출력
		System.out.print("점수 : ");
		for(int i=0;i<score.length;i++) {
			System.out.printf("%4d", score[i]);
		}
		System.out.println();
		System.out.print("순위 : ");
		for(int i=0;i<rank.length;i++) {
			System.out.printf("%4d", rank[i]);
		}

	}

}
