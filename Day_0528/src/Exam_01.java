class Person{
	int bun;
	String name;
	int age;
	Person(){}
	Person(int bun,String name,int age){
		this.bun=bun;
		this.name=name;
		this.age=age;
	}
	//같은 메소드를 사용하여 오버로딩함
	void print() {
		System.out.println("번호:"+bun);
		  System.out.println("번호:"+name);
		  System.out.println("번호:"+age);
	}
	 
}
public class Exam_01 {

	public static void main(String[] args) {
	  Person p=new Person();//생성자-클래스이름과 같다
	  p.bun=10;
	  p.name="김사원";
	  p.age=30;
	  /*System.out.println("번호:"+p.bun);
	  System.out.println("번호:"+p.name);
	  System.out.println("번호:"+p.age);
	  System.out.println("----------------------------");*/
	  p.print();
	  System.out.println("----------------------------");
	  Person p2=new Person(100,"이사원",28);
	  /*System.out.println("번호:"+p2.bun);
	  System.out.println("번호:"+p2.name);
	  System.out.println("번호:"+p2.age);
	  System.out.println("----------------------------");*/
	  p2.print();
	
	}

}
