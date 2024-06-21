class Account{

	int bun,kor,eng,mat,tot;
	double ave;
	Account(){}
	Account(int bun,int kor,int eng, int mat){
		this.bun=bun;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		tot=eng+kor+mat;
		ave=(int)(tot/3.0*10+0.5)/10;
	}
	void accPrint() {
		
		System.out.print(bun+"\t");
		System.out.print(tot+"\t");
		System.out.print(ave+"\t");
		for(int i=0;i<ave;i++) {
			if(i%5==0) {
				System.out.print("*");
			}
		}
		System.out.print("\n");
	}
}
public class Exam_03 {

	public static void main(String[] args) {
		Account a1=new Account(1,90,70,80);
		Account a2=new Account(2,95,75,85);
		Account a3=new Account(3,79,77,78);
		System.out.print("번호\t총점\t평균\t\n");
		a1.accPrint();
		a2.accPrint();
		a3.accPrint();
	}

}
