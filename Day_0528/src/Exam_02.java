class AA{
	int bun;
	String name;
	int age;
	AA(){
		this(10);//자동으로 AA(int bun)호출 
	}
	AA(int bun){
		this(bun,"이사원");//첫번쨰줄에 한번만 선언하여 사용할수있다
		this.bun=bun;
	}
	AA(int bun,String name){
		this.bun=bun;
		this.name=name;
	}
	AA(int bun,String name,int age){
		this.bun=bun;
		this.name=name;
		this.age=age;
	}
}
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
