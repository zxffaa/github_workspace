package exam;

import java.util.*;

import model.*;

public class Exam_04 {

	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		MemberDTO dto=new MemberDTO();
		MemberDAO dao=new MemberDAO();
		System.out.print("고객 번호입력:");
		dto.setCUSTNO(Input.nextInt());
		System.out.print("고객 이름입력:");
		dto.setCUSTNAME(Input.next());
		System.out.print("고객 핸드폰번호:");
		dto.setPHONE(Input.next());
		System.out.print("고객 성별입력:");
		dto.setGENDER(Input.next().toUpperCase());
		System.out.print("고객 회원가입날짜:");
		dto.setJOINDATE(Input.next());
		System.out.print("고객 등급:");
		dto.setGRADE(Input.next());
		System.out.print("고객 도시코드:");
		dto.setCITY(Input.next());
		
		int row=dao.CustomerInsert(dto);
		if(row==0) {
			System.out.print("등록실패");
		}else {
			System.out.print("등록성공");
		}

	}

}
