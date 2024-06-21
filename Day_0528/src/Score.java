
public class Score {
	int hakbun;//학번
	String name;//이름
	//int score[] = new int[10];//10과목
	int score[];//과목
	int tot;//총점
	double ave;//vudrbs
	char grade;//학점
	Score(){}
	Score(int hakbun, String name, int[] score){
		this.hakbun=hakbun;
		this.name=name;
		this.score=score;
	}
	//총점, 평균
	void totAve() {
		for(int i=0; i<score.length; i++) {
			tot += score[i];
		}
		ave = (double)tot / score.length;
		//grade();
	}
	//학점
	void grade() {
		grade='F';
		if(ave>=90) {
			grade='A';
		}else if(ave>=80) {
			grade='B';
		}else if(ave>=70) {
			grade='C';
		}else if(ave>=60) {
			grade='D';
		}
	}
	//출력
	void scorePrint() {
		System.out.print(hakbun+"\t" + name + "\t");
		for(int i=0; i<score.length;i++) {
			System.out.print(score[i] + "\t");
		}
		System.out.print(tot+"\t" + ave + "\n");
	}
	void scorePrint2() {
		System.out.print(hakbun+"\t" + name + "\t");
		for(int i=0; i<score.length;i++) {
			System.out.print(score[i] + "\t");
		}
		System.out.print(tot+"\t" + ave + "\t" + grade + "\n");
	}
	int Max() {
		int max=score[0];
		for(int i=0; i<score.length;i++) {
			
				if(max<score[i]) {
					max=score[i];
				
			}
		}
		return max;
	}
	int Min() {
		int min=score[0];
		for(int i=0; i<score.length;i++) {
			
				if(score[i]<min) {
					min=score[i];
				}
			
		}
		return min;
	}
}
