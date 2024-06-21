
public class Exam_04 {
	public static void main(String[] args) {
		boolean bool = false;
		System.out.println("bool : " + bool);//false
		System.out.println("!bool : " + !bool);//true
		
		System.out.println("(3<5) : " + (3<5));//true
		System.out.println("!(3<5) : " + !(3<5));//false
		
		System.out.println("3<5 && 2>=5 : " + (3<5 && 2>=5));//false
		System.out.println("3<5 || 2>=5 : " + (3<5 || 2>=5));//true

		System.out.println("3<5 & 2>=5 : " + (3<5 & 2>=5));//false
		System.out.println("3<5 | 2>=5 : " + (3<5 | 2>=5));//true
		

	}

}
