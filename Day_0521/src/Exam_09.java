
public class Exam_09 {
	
	static int scoreMax(int ...a) {//메모리 낭비가 심함 *호출할때마다 배열을 생성함
		int max=a[0];
		for (int i = 1; i < a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	

	public static void main(String[] args) {
		int max =scoreMax(1,2,3,4,5);
		System.out.println(max);
		max =scoreMax(1,2,3,4,5,6,7,8,9);
		System.out.println(max);
		int a[]= {1,2,3,4,5,6,7,8};
		max=scoreMax(a);
		System.out.println(max);
		max=scoreMax(new int[] {15,13,19,17,15,12,13,});
		System.out.println(max);
	}

}
