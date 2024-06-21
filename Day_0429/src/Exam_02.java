/*    *****
 *    *****
 *    *****
 *    *****
 *    *****
 * 
 */
public class Exam_02 {
	public static void main(String[] args) {
		for(int i=1; i<=25; i++) {
			System.out.print("*");
			if(i%5==0) {
				System.out.print("\n");
			}
		}
		System.out.print("\n");
		for(int i=1; i<=5; i++) {//row
			System.out.print(i+":");
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
