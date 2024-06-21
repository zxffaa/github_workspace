//2개의 정수입력 크기(대,소)비교
public class Exam_07 {
	public static void main(String[] args) {
		int a=90, b=80;
		int max,min;
		if(a>b) {
			max=a;
			min=b;
		}else {//<=
			max=b;
			min=a;			
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

	
}
