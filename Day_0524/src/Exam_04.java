
public class Exam_04 {
	static int Sum(int num) {
		if(num==1) {
			return 1;
		}
		return num+Sum(num-1);
	}
	public static void main(String[] args) {
	int sum=Sum(5);
	System.out.println("1~5합="+sum);
	}

}
