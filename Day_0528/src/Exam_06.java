
public class Exam_06 {

	public static void main(String[] args) {
		int hakbun=1101;
		String name="김학생";
		int score[]= {90,66,89,78,66};
		
		Score s1 = new Score(hakbun,name,score);
		s1.totAve();
		s1.grade();
		s1.scorePrint2();
		
		hakbun=1102;
		name="이학생";
		int score2[]= {77,58,95,90,66,89,78,66};
		Score s2 = new Score(hakbun,name,score2);
		s2.totAve();
		s2.scorePrint();
		System.out.println(s2.Max());
		System.out.println(s2.Min());
	}

}
