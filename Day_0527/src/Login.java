
public class Login {
	//속성(멤버변수):인스턴스변수
		String name;//이름
		String id;//아이디
		String pw;//비번
		//회원가입하기
		int memJoin(String n, String i, String p) {
			if(n.equals("") || i.equals("") || p.equals("")){
				//System.out.print("오류");
				return 0;
			}
			name = n;
			id = i;
			pw = p;
			return 1;
		}
		//로그인 기능
		boolean memLogin(String i, String p) {
			if(id.equals(i) && pw.equals(p)) {
				return true;
			}else {
				return false;
			}
		}
		//로그아웃기능
		void memLogout() {
			System.out.println(name +"님이 로그아웃하셨습니다");
			//name=null;
			//id=null;
			
		}

}
