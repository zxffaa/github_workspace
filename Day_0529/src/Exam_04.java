import java.util.Scanner;
class Sawon{
	int bun;//번호
	String name;//이름
	String gender;//성별(M:남자/F:여자)
	int age;//나이
	Sawon(){}
	Sawon(int bun,String name,String gender,int age){
		this.bun=bun;
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	//출력메소드
	void print(){
		String g = "여자";
		if(gender.equals("m") || gender.equals("M")) {
			g="남자";
		}
/*		
		if(gender.equalsIgnoreCase("m")){
			g="남자";
		}
*/
		System.out.print(bun + "\t" + name + "\t");
		System.out.print(g + "\t" + age + "\n");
	}
}
class SawonSort{
	void ascSort(Sawon sa[],int cnt) {
		for(int i=0;i<cnt-1;i++) {
			for(int j=i+1;j<cnt;j++) {
				if(sa[i].bun>sa[j].bun) {
					Sawon imsi=sa[i];
					sa[i]=sa[j];
					sa[j]=imsi;
				}
			}
		}
	}
}
public class Exam_04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Sawon sa[] = new Sawon[10];
		int cnt=0;//사원수
		while(cnt<10) {
			System.out.print("사원등록:");
			int bun = scn.nextInt();//번호
			if(bun==0) {
				break;
			}
			String name = scn.next();//이름
			String gender = scn.next();//성별
			int age = scn.nextInt();//나이
			sa[cnt] = new Sawon(bun,name,gender,age);
			cnt++;
		}
		//출력
		System.out.println("번호\t이름\t성별\t나이");
		for(int i=0; i<cnt;i++) {
			sa[i].print();
		}
		SawonSort s=new SawonSort();
		s.ascSort(sa,cnt);
		System.out.println("번호\t이름\t성별\t나이");
		for(int i=0; i<cnt;i++) {
			sa[i].print();
		}
		
	}

}
