
public class Exam_10 {
	public static void main(String[] args) {
		int a = 2;
		int res = a<<3;
		System.out.println(a + "<< 3 = " + res);//16
		
		a=32;
		res = a>>3;
		System.out.println(a + ">> 3 = " + res);//4
		
		a=-128;
		res = a>>1;
		System.out.println(a + ">> 1 = " + res);//-64
		
		res = a >>> 1;
		System.out.println(a + ">>> 1 = " + res);//
	}

}
