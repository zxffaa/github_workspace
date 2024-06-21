import java.util.Scanner;


public class Exam_11 {
    static String binConStr(int dec) {
	String bin="";
	while(dec !=0){
		int na =dec %2;
		bin=na+bin;
		dec/=2;
		}
	return bin;
    }
    static int[] binConArr(int dec) {
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

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("10진수 입력 :");
		int dec = scn.nextInt();
		
		String bin = binConStr(dec);
		System.out.printf("10진수 %d는 2진수 %s입니다\n", dec, bin);
		
		int binArr[] = binConArr(dec);//2진수는 최대 10자리까지		
		int cnt;
		for(cnt = binArr.length-1; cnt>=0; cnt--) {
			if(binArr[cnt]==1) {
				break;
			}
		}		
		System.out.print("10진수 " + dec +"은"+" 2진수 ");
		for(int i = cnt; i>=0; i--) {
			System.out.print(binArr[i]+"");
		}
		System.out.print("입니다");
	}

}
