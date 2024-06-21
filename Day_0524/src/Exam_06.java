
public class Exam_06 {

	public static void main(String[] args) {
		int a[]= {-1,1,2};
		int b=1, c=2;
		int r = func(func(b,c),3,func(a));
		//           (    3,3 2 )
		System.out.print(r);//-2
	}
	static int func(int x, int y) {
		return x+y;
	}
	static int func(int x, int y, int z) {
		return x-y-z;//3-3-2
	}
	static int func(int x[]) {
		int s=0;
		for(int i=0; i<x.length;i++) {
			s += x[i];
		}
		return s;
	}

}
