package exam2;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		Date today = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String date = sdf.format(today);

		
		// 현재날자 출력
		LocalDate now = LocalDate.now();
		int custno = dao.custnoMax();
		dto.setCUSTNO(custno);
		System.out.println("회원 정보 등록 화면");
		System.out.println("회원번호:" + custno);//자동
		
		System.out.print("회원성명:");
		dto.setCUSTNAME(scn.nextLine());
		
		System.out.print("회원전화:");
		dto.setPHONE(scn.nextLine());
		
		System.out.print("성별(M/F):");
		dto.setGENDER(scn.nextLine().toUpperCase());

		System.out.println("가입일자:" + date);//자동
		
		System.out.print("고객등급(A/B/C):");
		dto.setGRADE(scn.nextLine());

		System.out.print("도시코드:");
		dto.setCITY(scn.nextLine());
		
		int row =dao.CustomerInsert(dto);
		if (row == 0) {
			System.out.print("등록실패");
		} else {
			System.out.print("등록성공");
		}


	}

}