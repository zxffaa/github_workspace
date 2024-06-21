
public class Exam_13 {
	public static void main(String[] args) {
		int cnt=0,loop=0;
		for(int i=1; i<=5; i++) {
			if(loop%2==0) {
				loop=loop+1;
				cnt=loop;
				for(int j=1; j<=5;j++) { // 증가
					System.out.print(cnt + "\t");
					cnt++;
				}
			}else {
				loop=loop+9;
				cnt=loop;
				for(int j=1; j<=5;j++) { // 감소
					System.out.print(cnt + "\t");
					cnt--;
				}				
			}
			System.out.println();
		}
	}

}
