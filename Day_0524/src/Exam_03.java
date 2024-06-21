
public class Exam_03 {
	static int sum(int num) {
		int s=0;
		for(int i=1;i<=num;i++) {
			s+=i;
		}
		return s;
	}
	public static void main(String[] args) {
		int sum=sum(5);
		System.out.print("1~5합="+sum);
		
	}

}
