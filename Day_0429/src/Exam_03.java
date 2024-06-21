/*  1 1 1 1 1
 *  2 2 2 2 2
 *  3 3 3 3 3
 *  4 4 4 4 4
 *  5 5 5 5 5
 *  
 *  1 2 3 4 5
 *  1 2 3 4 5
 *  1 2 3 4 5
 *  1 2 3 4 5
 *  1 2 3 4 5
 * 
 */
public class Exam_03 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("%3d", i);
			}
			System.out.print("\n");
		}
		System.out.println();
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("%3d", j);
			}
			System.out.print("\n");
		}
	}

}
