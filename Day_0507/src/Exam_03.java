//배열선언과 동시 초기화
public class Exam_03 {
	public static void main(String[] args) {
		int a=1;
		
		//int b[5] = {1,2,3,4,5};
		int score[] = {70,50,90,70,60,70,80,90};
		//출력
		int tot=0;//합계계산용
		System.out.print("정수 목록 : ");
		for(int i=0; i<score.length;i++) {
			System.out.printf("%4d", score[i]);
			tot += score[i];
		}
		System.out.print("\n");
		System.out.printf("합계 : %4d\n", tot);
		System.out.printf("평균 : %5.2f\n", (double)tot/score.length);
		

	}

}
