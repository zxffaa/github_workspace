/* *****
    ****
     ***
      **
       *
      **
     ***
    ****
   ***** 
 */
public class Exam_08 {
	public static void main(String[] args) {
		int row=9;//전체줄수(반드시 홀수)
		for(int i=1; i<=row; i++) {
			if(i<=(row/2+1)) {
				for(int k=1; k<=i;k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=(row/2+1+1)-i;j++){
					System.out.print("*");
				}
				System.out.print("\n");
			}else {
				for(int k=1; k<=row+1-i;k++) {
					System.out.print(" ");
				}
				for(int j=1; j<=i-row/2;j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}

	}

}
