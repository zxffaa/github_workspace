
public class Exam_04 {
	public static void main(String[] args) {
		int bun[] = {7,3,5,6,2,1};
		int score[] = {70,85,90,88,85,79};
		int rank[] = new int[bun.length];//순위저장용
		
		//순위계산
		for(int i=0; i<score.length;i++) {
			rank[i]=1;
			for(int j=0; j<score.length;j++) {
				if(score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		//출력_1 입력자료순
		System.out.println("번호\t점수\t순위");
		for(int i=0; i<bun.length;i++) {
			System.out.println(bun[i] + "\t" + score[i] + "\t" + rank[i]);
		}
		
		//순위를 기준으로 오름차순 정렬(선택정렬법)
		for(int i=0; i<rank.length-1; i++) {
			for(int j=i+1; j<rank.length;j++) {
				if(rank[i] > rank[j]) {
					//번호교환
					int t = bun[i]; bun[i]=bun[j]; bun[j]=t;
					//점수교환
					t = score[i]; score[i]=score[j]; score[j]=t;					
					//순위교환
					t = rank[i]; rank[i]=rank[j]; rank[j]=t;
				}
			}
		}
		//출력_2 (순위)
		
	}

}
