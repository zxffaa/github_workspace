//연산자 : 1) 단항(!, ~, ++, --, 부호(+,-), new ) -> 
// 2) 산술 (*,/,% -> +,-, <<,>>,>>>) ->
// 3) 관계 (>,<,>=,<=) -> 결과 값은  true/false
// 4) 상등 (==, !=) -> 결과 값은  true/false

public class Exam_02 {
	public static void main(String[] args) {
		int a=55, b=33;
		System.out.println(a + ">=" + b + " = " + (a>=b));
		System.out.println(a + "<=" + b + " = " + (a<=b));
		
		boolean flag = a==b;
		System.out.println(a + "==" + b + " = " + flag);
		flag = a!=b;
		System.out.println(a + "!=" + b + " = " + flag);
		
		boolean bool = 5>3 == 4<5;
		//             true == true
		System.out.println("5>3 == 4<5 = " + bool);//true

		bool = 'A' > a;
		System.out.println("A>" + a + " = " + bool);//true
	}

}
