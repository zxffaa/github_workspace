package forwhile;

public class Ex09 {
	public static void main(String[] args) {
		int i=0,s=0;
		do {
			i++;
			s += i;
		}while(i!=10);//while(i<10)
		System.out.print(s);
		
		//1 ~ 10 합계
		int cnt=0, sum=0;
		while(cnt<10) {
			cnt++;
			sum += cnt;
		}
		System.out.print(sum);
	}

}
