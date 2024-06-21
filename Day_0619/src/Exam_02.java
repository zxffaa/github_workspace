
public class Exam_02 {

	public static void main(String[] args) {
		//가변성 문자열 배열
		StringBuffer sb=new StringBuffer("Java");
		System.out.println("문자열:"+sb.toString());
		//문자열 추가
		//append()=>끝에 추가,insert()=>넣을 위치
		sb.append(" servlet");
		System.out.println("문자열추가:"+sb.toString());
		char ch=sb.charAt(0);
		System.out.println("0번위치 문자:"+ch);
		//문자열 삽입
		sb.insert(5,"JSL ");
		System.out.println("문자열삽입:"+sb.toString());
		//문자열 삭제
		sb.delete(0,4);//0부터 4번전까지
		System.out.println("문자열삭제:"+sb.toString());
		sb.deleteCharAt(7);//7번제 삭제
		System.out.println("문자열지정삭제:"+sb.toString());
		//문자열 변경
		sb.setCharAt(8, 'A');
		System.out.println("문자열변경:"+sb.toString());
		//문자열 치환
		sb.replace(0, 3, "KOR");
		System.out.println("문자열치환:"+sb.toString());
		//문자열 뒤집기
		sb.reverse();
		System.out.println("문자열뒤집기:"+sb.toString());
	}

}
