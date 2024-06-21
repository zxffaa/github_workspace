
public class Exam_01 {

	public static void main(String[] args) {
		//난수(0~1사이 무작위수)만들기=Math함수
		
				double r = Math.random();
				System.out.println(r);
				//start ~ n난수
				//int n = (int)(Math.round()*n)+start;
				// 1~6
				int rr = (int)(Math.random()*6)+1;
				System.out.print(rr);
	}

}
