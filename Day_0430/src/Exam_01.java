/*  
   *****
   ****
   ***
   **
   * 
 */
public class Exam_01 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {//row(줄수)
			for(int j=1; j<=6-i; j++) {//col(칸수)
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("-----------------------");
		for(int i=1; i<=5; i++) {//row(줄수)
			for(int j=5; j>=i; j--) {//col(칸수)
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("-----------------------");
		for(int i=5; i>=1; i--) {//row(줄수)
			for(int j=1; j<=i; j++) {//col(칸수)
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
