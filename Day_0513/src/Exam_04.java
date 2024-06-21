//정렬(오름차순/내림차순)

import java.util.Arrays;

public class Exam_04 {
	public static void main(String[] args) {
		int arr[] = {7,5,9,8,4};
		System.out.println("arr 배열 : " + Arrays.toString(arr));
		int arr2[] = arr.clone();
		//선택정렬
		for(int i=0; i<arr2.length-1; i++) {//기준
			for(int j=i+1; j<arr2.length;j++) {//비교대상
				if(arr2[i] > arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		System.out.println("arr2 배열 : " + Arrays.toString(arr2));
		
		
	}

}
