//점수가 90이상, 80이상, 70이상, 60이상, 60미만
public class Exam_12 {
	public static void main(String[] args) {
		int score=87;
		String grade="F";
		if(score>=90) {
			grade="A";
		}else if(score>=80) {
			grade="B";
		}else if(score>=70){
			grade="C";
		}else if(score>=60) {
			grade="D";
		}
/*		else {
			grade="F";
		}
*/		
	}

}
