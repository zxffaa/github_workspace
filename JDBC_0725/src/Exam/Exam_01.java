package Exam;

import Model.*;

import java.text.*;
import java.time.LocalDate;
import java.util.*;

public class Exam_01 {

	public static void main(String[] args) {
		
		LibraryDAO Main =new LibraryDAO();
		LibraryDTO Info =new LibraryDTO();
		Date today=new Date();
		LocalDate now =LocalDate.now();
		SimpleDateFormat SDF=new SimpleDateFormat("yyyyMMdd");
		String data= SDF.format(today);
		int max=Main.UserMax();
		Scanner input =new Scanner(System.in);
		String num="";
		String gen="";
		//--------------------------------
		
		System.out.println("회원정보 시스템");
		//회원번호 자동 등록
	
		Info.setUserno(max);
		System.out.print("회원이름 입력:");
		Info.setName(input.nextLine());
		System.out.print("휴대폰전화번호 입력:");
		num=input.nextLine();
		Info.setPhone1(num.substring(0, 3));
		if(num.contains("-")) {
			Info.setPhone2(num.substring(4, 8));
			Info.setPhone3(num.substring(9, 13));
		}else {
			Info.setPhone2(num.substring(3, 7));
			Info.setPhone3(num.substring(7, 11));
		}
		while(true) {
			System.out.print("성별입력:");
			gen=input.nextLine();	
			if(gen.contains("m")||gen.contains("M")||gen.contains("f")||gen.contains("F")) {
				Info.setGender(gen.toUpperCase());
				break;
			}else {
				System.out.print("성별 다시입력해주세요");
				continue;
			}
		}
		System.out.println("예시)990909");
		System.out.print("생일입력:");
		Info.setBirthday(input.nextLine());
		Info.setRegdate(data);
		int row=Main.UserIN(Info);
		if(row==1) {
			System.out.println("등록성공");
		}else {
			System.out.println("등록실패");
		}
	}

}
