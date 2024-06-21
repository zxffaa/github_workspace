//2진 검색

import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		int var[] = {10,20,30,40,50,60,70,80,90};
		Scanner scn = new Scanner(System.in);
		System.out.print("찾는 값 :");
		int a = scn.nextInt();
		int low = 0;
		int high=var.length-1;
		int mid;//중앙값
		while(true) {//while(low<=high){
			if(low>high) {
				System.out.println("자료없음");
				break;
			}
			mid = (low+high)/2;
			if(a == var[mid]) {
				System.out.println(a+"값은"+(mid+1)+"번째 있음");
				break;
			}else if(a > var[mid]) {
				low = mid + 1;
			}else {
				high = mid -1;
			}
		}
	}

}
