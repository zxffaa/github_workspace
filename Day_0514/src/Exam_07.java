import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		int ave[] = {78,90,88,56,79,84,73,95,66,93,85,77};
		//오름차순 정렬
		
		//검색시작
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("점수:");
			int score = scn.nextInt();
			if(score==-99) {
				break;
			}
			int low=0;
			int high=ave.length-1;
			int med;
			boolean bool = true;
			while(low <= high) {
				med = (low+high)/2;
				if(score==ave[med]) {
					System.out.println(score+"점은 " + med + "번째 있음");
					bool = false;
					break;
				}else if(score > ave[med]){
					low = med + 1;
				}else {
					high = med -1;
				}
			}
			if(bool) {
				System.out.println(score+"점은 없음");
			}
		}

	}

}
