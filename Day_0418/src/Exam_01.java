//연산자 : 1) 단항(!, ~, ++, --, 부호(+,-), new ) -> 
// 2) 산술 (*,/,% -> +,-, <<,>>,>>>) ->
// 3) 관계 (>,<,>=,<=) ->
// 4) 상등 (==, !=) ->

public class Exam_01 {
	public static void main(String[] args) {
		char ch = 'A' + 1;//'B'
		int a = 'A' + 1;//66
		System.out.println("ch = " + ch);//'B'
		System.out.println("A = " + a);//66

		System.out.println("ch = " + (int)ch); //66
		System.out.println("A = " + (char)a); //'B'
	}

}
