import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Calculator cal=new Calculator();
		System.out.print("숫자두개입력:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		
		cal.add(a,b);
	}

}
