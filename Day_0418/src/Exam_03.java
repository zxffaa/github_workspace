//논리연산자 : 비트연산자(~(not) -> &(and)( -> ^(xor) -> |(or))
//          ->!(not)-> &&(and) -> ||(or)             

public class Exam_03 {
	public static void main(String[] args) {
		int a=7, b=5;
		int res = ~a;//-8
		System.out.println("~"+a+" = " + res);
		System.out.println("~"+b+" = " + (~b));//-6
		
		res = a & b;
		System.out.println(a+"&"+b+" = " + res);//5
		System.out.println(a+"^"+b+" = " + (a^b));//2
		System.out.println(a+"|"+b+" = " + (a|b));//7
		
	}

}
