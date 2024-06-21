/*   1  2  3  4  5
 *  10  9  8  7  6
 *  11 12 13 14 15
 *  20 19 18 17 16
 *  21 22 23 24 25
 */
public class Exam_01 {
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int cnt=0;//1 2 3 . . .  25
		for(int i=0; i<arr.length;i++) {
			if(i%2==0) {
				for(int j=0; j<arr.length;j++) {
					cnt++;
					arr[i][j] = cnt;
				}
			}else {
				for(int j=arr.length-1; j>=0;j--) {
					cnt++;
					arr[i][j] = cnt;
				}				
			}
		}
		
		//출력
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
