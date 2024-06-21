//싱글톤(Singleton)패턴-하나의 객체를 같이쓸떄
class BB{
	
}
class CC{
	private CC() {}
		static CC instance = new CC();
		static CC getInstance() {
			return instance;
		}
	
}

public class Exam_03 {

	public static void main(String[] args) {
		BB b1=new BB();
		BB b2=new BB();
		BB b3=new BB();
		System.out.println("b1="+b1);//참조값
		System.out.println("b2="+b2);//참조값
		System.out.println("b3="+b3);//참조값
		//CC c1=new CC();
		CC c1=CC.getInstance();
		CC c2=CC.getInstance();
		CC c3=CC.getInstance();
		
		System.out.println("c1="+c1);//참조값
		System.out.println("c2="+c2);//참조값
		System.out.println("c3="+c3);//참조값
	}

}
