/*
        *
       ***
      *****
     *******
    *********
 */
public class Exam_02 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int k=1; k<=6-i;k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
