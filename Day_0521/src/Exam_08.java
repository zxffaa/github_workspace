
public class Exam_08 {
	static int[] makeArray() {
		int arr[]= {1,2,3,4,5};
		return arr;//배열의 주소를 반환
	}
	public static void main(String[] args) {
		int a[]=makeArray();
		int s=0;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			s+=a[i];
		}
		 
		System.out.println(s);
	}

}
