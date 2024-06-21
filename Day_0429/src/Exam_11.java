//구구단 2 ~ 9단 모두 출력
public class Exam_11 {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {//단
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n",i,j,(i*j));
			}
		}
		
	}

}
