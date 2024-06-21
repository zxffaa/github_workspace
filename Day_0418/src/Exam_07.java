//삼항(조건)연산자
public class Exam_07 {
	public static void main(String[] args) {
		int a = 7;
		boolean bool = a%2==1;
		System.out.println(a +"는 bool = " + bool);
		
		String result = (bool)? "홀수" :"짝수";
		System.out.println(a + "는 bool = " + result);
		
		result = (a%2==1) ? "홀수" : "짝수" ;
		System.out.println(a + "는 bool = " + result);
		
	}

}
