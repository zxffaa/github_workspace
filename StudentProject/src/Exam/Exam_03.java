package Exam;

import java.util.Scanner;

import model.StudentDAO;
import model.StudentDTO;

public class Exam_03 {

	public static void main(String[] args) {
		StudentDAO dao=new StudentDAO();
		StudentDTO dto=new StudentDTO();
		Scanner input=new Scanner(System.in);
		String hakbun="";
		
		System.out.print("학생정보 삭제\n");
		System.out.print("학번입력:");
		hakbun=input.next();
		dto.setSyear(hakbun.substring(0, 1));
		dto.setSclass(hakbun.substring(1, 3));
		dto.setSno(hakbun.substring(3, 5));
		int row=dao.delete(dto);
		System.out.println();
		if(row!=0) {
			System.out.print(hakbun+":학번의 학생정보가 삭재되었습니다");
		}else {
			System.out.print(hakbun+":학번의 학생정보가 존재하지않습니다");
		}
		
		
		
	}

}
