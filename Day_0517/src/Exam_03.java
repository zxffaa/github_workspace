/*  1  2  3  4  5 xx
 *  6  7  8  9 10 xx
 * 11 12 13 14 15 xx
 * 16 17 18 19 20 xx
 * 21 22 23 24 25 xx
 * xx xx xx xx xx xx
 * 
 */
public class Exam_03 {
	public static void main(String[] args) {
		int arr[][]=new int[6][6];
		int cnt=0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				cnt++;
				arr[i][j] = cnt;
				arr[i][5] += arr[i][j];
				arr[5][j] += arr[i][j];
				arr[5][5] += arr[i][j];
			}
		}
		//출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0;  j<arr.length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
