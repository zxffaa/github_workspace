package Exam;

import java.util.*;

import Model.*;


public class Exam_02 {

	public static void main(String[] args) {
		LibraryDAO UserShow= new LibraryDAO();
		List<LibraryDTO>UserInfo=UserShow.UserShow();
		System.out.print("회원번호\t이름\t전화번호\t\t성별\t생년월일\t등록일자\n");
		for(LibraryDTO list:UserInfo) {
			System.out.print(list.getUserno()+"\t");
			System.out.print(list.getName()+"\t");
			System.out.print(list.getPhone1()+"-"+list.getPhone2()+"-"+list.getPhone3()+"\t");
			if(list.getGender().contains("M")) {
				System.out.print("남성"+"\t");
			}else {
				System.out.print("여성"+"\t");
			}
			System.out.print(list.getBirthday()+"\t");
			System.out.print(list.getRegdate().substring(0, 4)+"년");
			System.out.print(list.getRegdate().substring(4, 6)+"월");
			System.out.print(list.getRegdate().substring(6, 8)+"일");
			System.out.println();
		}
	}

}
