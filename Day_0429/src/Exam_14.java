import java.util.Scanner;

public class Exam_14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int m;
        while(true) {
        	System.out.print("정수:");
        	m = scn.nextInt();
        	if(m>=2) { 
        		break;
        	}
        	System.out.println("입력오류");
        }//while()끝

        int cnt=0;//소수개수 카운트
        System.out.println("[소수 출력]");
        int x,y;
        for(x=2; x<=m; x++) {//2~m까지 숫자
        	for(y=2; y<=x; y++) { // for(y=2; y<x; y++) {
        		if(x%y==0) {
        			break;
        		}
        	}
        	if(x==y) {
        		System.out.print(x+"\t");
        		cnt++;
        		if(cnt%5==0){//한라인에 5개 출력
        			System.out.print("\n");
        		}
        	}
        } 
        System.out.print("\n 소수개수 :" +cnt);

	}

}
