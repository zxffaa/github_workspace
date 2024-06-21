
public class Exam_07 {
	public static void main(String[] args) {
		int bun[] = {1,2,3,4,5};
		int score[] = {80,90,85,79,60};
		//출력
		System.out.println("번호\t점수");
		for(int i=0; i<bun.length;i++) {
			System.out.println(bun[i] + "\t" + score[i]);
		}
		//점수를 기준으로 내림차순 정렬
		for(int i=0; i<bun.length-1; i++) {
			for(int j=0; j<bun.length-i-1; j++) {
				if(score[j] < score[j+1]) {
					//번호교환
					int t = bun[j];
					bun[j] = bun[j+1];
					bun[j+1] = t;
					//점수교환
					t = score[j];
					score[j] = score[j+1];
					score[j+1] = t;
				}
			}
		}
		//출력
		
	}

}
