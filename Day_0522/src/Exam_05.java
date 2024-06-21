import java.util.Scanner;

public class Exam_05 {

	static String binary(int dec) {
		String bin="";
		while(dec !=0){
			int na =dec %2;
			bin=na+bin;
			dec/=2;
			}
		return bin;
	    }
	
	 static int decimal(int f) {
			int cnt=0;
			for(int i=2; i<=f; i++) {
				int j;
				for(j=2; j<i; j++) {
					if(i%j==0) {
						break;
					}
				}
				if(i==j) {
					cnt++;
				}
			}
			return cnt;
		 }
	 static int[] binaryArr(int dec) {
			int bin[] = new int[10];
			int cnt=0;
			while(dec != 0) {
				int na = dec % 2;
				bin[cnt] = na;
				dec /= 2;
				cnt++;
			}
			return bin;
		}
	 static void result(int[] dec) {
		 int cnt;
			for(cnt = dec.length-1; cnt>=0; cnt--) {
				if(dec[cnt]==1) {
					break;
				}
			}		
			for(int i = cnt; i>=0; i--) {
				System.out.print(dec[i]+"");
			}
			System.out.println();
	 }
	 static void inputMaxmin() {
		 	int score[]=new int[10];
		 	Scanner input =new Scanner(System.in);
			int cnt=0,tot=0;
				while(cnt<10) {
					System.out.print("키보드입력:");
					score[cnt] = input.nextInt();
					if(score[cnt]==0) {
						--cnt;
						break;
					}
					tot=score[cnt]+tot;
				    cnt++;
				}
				int max=score[0],min=score[0];
				for(int i=0;i<cnt;i++) {
					if(max<score[i]) {
						max=score[i];
					}if(min>score[i]) {
						min=score[i];
					}
				}
				System.out.printf("최대:%d\t,최소:%d\t,전체합%d\t",max,min,tot);
			}
	 
	 static void dataRank(int [] a) {
			int i=0,j=0,r=0;
			int cnt[]=new int[8];
			for(i=0; i<a.length;i++) {
				r=1;
				for(j=0; j<a.length;j++) {
					if(a[i] < a[j]) {
						r++;
					}
					cnt[i] = r;
				}
			}
			for(i=0; i<a.length;i++) {
				System.out.print(a[i]+" "+cnt[i]+"\n");
			}
			
	 }
	public static void main(String[] args) {
		int score[]=new int[10];
		int a[]= {5,4,7,2,9,5,3,7};
		Scanner input =new Scanner(System.in);
		System.out.print(decimal(50)+"\n");
		System.out.print(binary(37)+"\n");
		int []binArr=binaryArr(37);
		result(binArr);
		inputMaxmin();
		dataRank(a);
	}

}
