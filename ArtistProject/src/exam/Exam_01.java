package exam;

import java.util.*;

import model.*;

public class Exam_01 {

	public static void main(String[] args) {
		ArtistDAO dao=new ArtistDAO();
		ArtistDTO dto=new ArtistDTO();
		Scanner Input=new Scanner(System.in);
		
		
		System.out.print("오디션 지원자 정보 등록 화면\n");
		System.out.print("오디션 지원자 참가번호 입력:");
		dto.setARTIST_ID(Input.nextLine());
		System.out.print("오디션 지원자 이름 입력:");
		dto.setARTIST_NAME(Input.nextLine());
		System.out.print("오디션 지원자 성별 입력(M/F):");
		dto.setARTIST_GENDER(Input.nextLine().toUpperCase());
		System.out.print("오디션 지원자 생년월일 입력(EX:YYYYMMDD):");
		dto.setARTIST_BIRTH(Input.nextLine());
		System.out.print("오디션 지원자 특기(1.댄스/2.노래/3.랩):");
		dto.setTALENT(Input.nextLine());
		System.out.print("오디션 지원자 소속회사 입력:");
		dto.setAGENCY(Input.nextLine());

		int row =dao.Artist_insert(dto);
		if (row == 1) {
			System.out.print("등록성공");
		} else if(row==-1){
			System.out.print("기존에 등록되어있는 지원자입니다");
		}else {
			System.out.print("등록실패");
		}

		
	}

}
