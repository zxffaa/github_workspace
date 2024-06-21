//1 ~ 10까지 홀수 합, 짝수합, 홀수 짝수 동시합계
public class Exam_04 {
	public static void main(String[] args) {
		int s=0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				System.out.println(i);
				s += i;
			}
		}
		System.out.println("1 ~ 10 홀수 합 :" + s);

		int t=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
				t += i;
			}
		}
		System.out.println("1 ~ 10 짝수 합 :" + t);
		//홀수, 짝수 동시계산
		int ot=0, et=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				et += i;//짝수
			}else {
				ot += i;//홀수
			}
		}
		System.out.println("1 ~ 10 짝수 합 :" + et);
		System.out.println("1 ~ 10 홀수 합 :" + ot);
		
	}

}
