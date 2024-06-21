//버블정렬

import java.util.Arrays;

public class Exam_06 {
	public static void main(String[] args) {
		int a[] = {6,9,8,7,4};
/*		
		for(int i=0; i<a.length-1;i++) {
			for(int j=0; j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
*/
		for(int i=0; i<a.length-1;i++) {
			int n = a.length-i-1;
			for(int j=0; j<n;j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}

		System.out.println("sort : " + Arrays.toString(a));
	}

}
