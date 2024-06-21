import java.util.Scanner;

class Student{

	String name,score;
	int bun,kor,eng,math,tot;
	double ave;
	Student(){}
	Student(int bun,String name,int kor,int eng,int math){
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		tot=math+kor+eng;
		ave=(int)(tot/3.);
		if(ave>=90) {
			score="A";
		}else if(ave>=80){
			score="B";
		}else if(ave>=70){
			score="C";
		}else if(ave>=60){
			score="D";
		}else{
			score="F";
		}
	}
	void print() {
		System.out.print(bun+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+ave+"\t"+score+"\n");
	}
}
class StudntSort{
	Student Max(Student sa[],int cnt) {
		Student Max= sa[0];
		for(int i=1; i<cnt;i++) {
			if(Max.tot < sa[i].tot) {
				Max = sa[i];
			}
		}
		return Max;
	}
	Student Min(Student sa[],int cnt) {
		Student Min= sa[0];
		for(int i=1; i<cnt;i++) {
			if(Min.tot > sa[i].tot) {
				Min = sa[i];
			}
		}
		return Min;
	}
}
public class Exam_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student sa[] = new Student[10];
		int cnt=0;
		while(cnt<10) {
			System.out.println("입력형식 [번호 이름 국어 영어 수학]");
			System.out.print("학생등록");
			int bun=input.nextInt();
			if(bun==0) {
				break;
			}
			String name=input.next();
			int kor=input.nextInt();
			int eng=input.nextInt();
			int math=input.nextInt();
			sa[cnt] = new Student(bun,name,kor,eng,math);
			cnt++;
		}
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t");
		for(int i=0;i<cnt;i++) {
			sa[i].print();
		}
		System.out.println("최고 총점 학생");
		StudntSort s=new StudntSort();
		Student Max=s.Max(sa, cnt);
		Max.print();
		System.out.println("최저 총점 학생");
		Student Min=s.Min(sa, cnt);
		Min.print();
		
	}
}
