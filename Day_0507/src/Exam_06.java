/* [실습 ]  int val[] = {87, 90,  67,  59,  88,  76,  95,  78 }
   평균, 평균이상 자료, 건수출력
  [출력 예시] 
  Data : 87  90  67  59  88  76  95  78
  평균   : 80
  평균이상 : 87  90  88  95
  평균이상 학생수 :  4명
 */
public class Exam_06 {
	public static void main(String[] args) {
		int val[] = {87, 90,  67,  59,  88,  76,  95,  78 };
		//출력 및 합계
		int sum = 0;
		System.out.print("Data : ");
/*		for(int a : val) {
			System.out.printf("%3d", a);
			sum += a;
		}
*/		
		for(int i=0; i<val.length; i++) {
			System.out.printf("%3d", val[i]);
			sum += val[i];
		}
		System.out.print("\n");
		//평균
		double ave = (double)sum / val.length;
		System.out.println("평균 : " + ave);
		//평균이상 자료 출력 및 건수 계산
		int count=0;
		System.out.print("평균이상 : ");
		for(int x : val) {
			if(x >= ave) {
				count++;
				System.out.printf("%3d", x);
			}
		}
		System.out.print("\n");
		System.out.print("평균이상 학생수 : " + count);
	}

}
