import java.util.Arrays;

public class Exam_05 {
	public static void main(String[] args) {
		char ch[]= {'A', 66, 'C',68,'E','F'};
		String str[]= {"김사원","이사원","강사원","오사원","윤사원"};
		
		System.out.println("ch배열 요소 확인 : " + Arrays.toString(ch));
		System.out.println("str배열 요소 확인 : " + Arrays.toString(str));
		
		//개별요소 출력
		System.out.print("전체요소 출력:");
		for(int i=0; i<ch.length;i++) {
			System.out.print(ch[i]+"\t");
		}
		System.out.println();
		System.out.print("전체요소 출력:");
		for(int i=0; i<ch.length;i+=2) {
			System.out.print(ch[i]+"\t");
		}
		System.out.println();
		
		//전체요소 출력
		for(char ss : ch) {
			System.out.print(ss + "\t");
		}
		System.out.println();
		for(String ss : str) {
			System.out.print(ss + "\t");
		}
		System.out.println();
		
	}

}
