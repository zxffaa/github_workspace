import java.util.Random;

public class Exam_07 {

	public static void main(String[] args) {
		Random r=new Random();
		System.out.println(r.nextInt());
		System.out.println(r.nextDouble());
		//1~n까지 정수 난수
		//r.nextInt(45)+1 :1부터 45까지
		System.out.println(r.nextInt(45)+1);
	}

}
