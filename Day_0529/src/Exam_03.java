class Person{
	int ssn;
	String name;
	int age;
	Person(){}
	Person(int ssn,String name, int age){
		this.ssn=ssn;
		this.name=name;
		this.age=age;
	}
	void print() {
		System.out.println(ssn+"\t"+name+"\t"+age);
	}
}
public class Exam_03 {

	public static void main(String[] args) {
		Person pArr[]=new Person[5];
		
		pArr[0]=new Person();
		pArr[0].ssn=3333;
		pArr[0].name="오서준";
		pArr[0].age=25;
		pArr[1]=new Person(1234,"이사원",30);//키보드입력시 여기만 변경
		pArr[2]=new Person(1235,"김사원",23);
		pArr[3]=new Person(1236,"강사원",33);
		pArr[4]=new Person(1237,"박사원",28);
		for(int i=0;i<pArr.length;i++) {
			System.out.print(pArr[i].ssn+"\t");
			System.out.print(pArr[i].name+"\t");
			System.out.print(pArr[i].age+"\n");
		}
		for(int i=0;i<pArr.length;i++) {
			pArr[i].print();
		}
	}

}
