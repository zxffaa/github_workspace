import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		Login log = new Login();
		
		Scanner scn = new Scanner(System.in);
		System.out.print("회원가입:");
		String name = scn.next();
		String id = scn.next();
		String pw = scn.next();
		
		int row = log.memJoin(name, id, pw);
		if(row==0) {
			System.out.println("회원가입실패");
		}else {
			System.out.println("회원가입가입되었습니다.");
			System.out.println("이름 :" + log.name);
			System.out.println("아이디 :" + log.id);
			System.out.println("비번 : ****" );
		}
		//로그인 
		String i="abcd";
		String p="1234";
		boolean bool = log.memLogin(i, p);
		if(bool) {
			System.out.println(log.name+"님 환영합니다");
			System.out.println("로그인되었습니다");
		}else {
			System.out.println("아이디 또는 비번오류");
		}
		log.memLogout();
		
		//로그아웃
		//log.memLogout();
		
		
	}

}

