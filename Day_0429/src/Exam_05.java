/*   *
 *   **
 *   ***
 *   ****
 *   *****
 *   --------
 *   *****
 *   ****
 *   ***
 *   **
 *   *
 * 
 */
public class Exam_05 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("---------------");
		for(int i=1; i<=5; i++) {//줄수
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("---------------");
		for(int i=1; i<=5; i++) {//줄수
			for(int j=6-i; j>=1; j--) {//j>0
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
