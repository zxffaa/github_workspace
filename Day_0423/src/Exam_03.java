
public class Exam_03 {
	public static void main(String[] args) {
		//평균에 다른 등급
		double ave=79.45;
		if(ave>=90) {
			System.out.print("A");
		}else if(ave>=80) {
			System.out.print("B");
		}else if(ave>=70) {
			System.out.print("C");
		}else if(ave>=60) {
			System.out.print("D");
		}else {
			System.out.print("F");
		}
		switch((int)ave/10) {
			case 10:
			case 9:
				System.out.print("A");
				break;
			case 8:
				System.out.print("B");
				break;
			case 7:
				System.out.print("C");
				break;
			case 6:
				System.out.print("D");
				break;
			default:
				System.out.print("F");
		}
	}

}
