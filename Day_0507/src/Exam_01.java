
public class Exam_01 {
	public static void main(String[] args) {
		int arr[];//배열변수 선언
		//arr=10;
		arr = new int[5];//메모리 공간할당
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		//arr[5]=600;

		System.out.println("arr = " + arr);//참조값(주소)
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("배열길이 : " + arr.length);
		
		int a[] = new int[5];//배열변수의 선언과 할당
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
