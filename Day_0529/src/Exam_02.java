class Car{
	String name;
	int price;
	Car(){}
	Car(String name,int price){
		this.name=name;
		this.price=price;
	}
	void print() {
		System.out.print(name+"\t"+price);
	}
}

public class Exam_02 {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.name="산타페";
		c1.price=200;
		Car c2=new Car("소나타",100);
		System.out.print("이름\t가격\n");
		System.out.println(c1.name+"\t"+c1.price);
		System.out.println(c2.name+"\t"+c2.price);
		c1.print();
		c2.print();
	}

}
