/*   *
 *   **
 *   ***
 *   ****
 *   *****
 *   ****
 *   ***
 *   **
 *   *
 * 
 */
public class Exam_06 {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {//전체줄수
			if(i<=5) {
				for(int j=1; j<=i;j++) {//증가
					System.out.print("*");
				}
				System.out.print("\n");
			}else {
				for(int j=1; j<=10-i; j++) {//감소
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}
	}

}
