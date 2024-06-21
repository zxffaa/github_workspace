class D{
	final String nation="대한민국";
	int ssn;
	String name;//이름
	D(){}
	D(int ss,String name){
		this.ssn=ssn;
		this.name=name;
	}
	void print() {
		System.out.println("국적:"+nation);
		System.out.println("주민번호:"+ssn);
		System.out.println("이름:"+name);
	}
}
public class Exam_04 {

	public static void main(String[] args) {
		D d1=new D(123456,"aaa");
		d1.ssn=4444;
		D d2=new D(222222,"bbb");
		d1.print();
		d2.print();
	}

}
