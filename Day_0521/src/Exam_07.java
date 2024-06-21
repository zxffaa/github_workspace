
public class Exam_07 {
	static void swapB(int a[]) {
		int t=a[0];
		a[0]=a[1];
		a[1]=t;
	}
	public static void main(String[] args) {
		int arr[]= {10,20};
		System.out.printf("a=%d,b=%d\n",arr[0],arr[1]);
		swapB(arr);
		System.out.printf("a=%d,b=%d\n",arr[0],arr[1]);
	}

}
