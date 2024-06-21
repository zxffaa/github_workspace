import java.util.Scanner;

class student {
	int bun,kor,eng,mat,tot;
	double ave;
	String name="",bin="",str="";
	student(int bun,String name,int kor,int eng, int mat){
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		tot=eng+kor+mat;
		ave=(int)(tot/3.0*10+0.5)/10;
	}
	void studentPrint(){
		System.out.print("학번\t이름\t국어\t영어\t수학\t총점\t평균\t판정\t불합격사유\n");
		if(40<=kor&&40<=eng&&40<=mat&&60<=eng) {
			str="점수합격";
			bin="합격";
		}else {
			if(kor<40||eng<40||mat<40) {
				str="과락";
				bin="불합격";
			}else {
				str="평균미달";
				bin="불합격";
			}
		}
		System.out.print(bun+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+ave+"\t"+bin+"\t"+str);
	}
}
public class Exam_05 {

	public static void main(String[] args) {
		int a,b,c,d;
		String as="";
		Scanner input=new Scanner(System.in);
		System.out.print("입력자료:");
		a=input.nextInt();
		as=input.next();
		b=input.nextInt();
		c=input.nextInt();
		d=input.nextInt();
		student s1=new student(a,as,b,c,d);
		s1.studentPrint();
	
	}

}
