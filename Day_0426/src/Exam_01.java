import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("사원정보:");
			String name = scn.next();
			if(name.equalsIgnoreCase("end")) {//eof
				break;
			}
			int gd = scn.nextInt();//등급
			int ti = scn.nextInt();//근무시간
			//등급에 다른 시급
			int timePay=2000;
			if(gd==1) {
				timePay=10000;
			}else if(gd==2) {
				timePay=5000;
			}
			
			int overTime=0;//초과근무시간
			int baseTime=ti;
			if(baseTime>50) {//최대 50시간까지만 인정
				baseTime=50;
			}
			if(baseTime>36) {
				overTime = baseTime-36;
				baseTime=36;
			}
			//주간급여계산
			int weekPay = baseTime*timePay+(int)(overTime*timePay*1.5);
			System.out.println("이름\t등급\t시급\t근무시간\t주간급여");
			System.out.println(name+"\t"+gd+"\t"+timePay+"\t"+ti+"\t"+weekPay);
		}//while()끝
		System.out.println("프로그램을 종료합니다.");
	}//main()끝

}
