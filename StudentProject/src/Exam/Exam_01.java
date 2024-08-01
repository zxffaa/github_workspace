package Exam;

import model.StudentDAO;
import model.StudentDTO;
import java.util.*;


public class Exam_01 {

	public static void main(String[] args) {
		StudentDAO dao=new StudentDAO();
		StudentDTO dto=new StudentDTO();
		
		Scanner input=new Scanner(System.in);

		System.out.print("학생등록 화면\n");
		System.out.print("학년:");
		dto.setSyear(input.nextLine());
		System.out.print("반:");
		dto.setSclass(input.nextLine());
		System.out.print("번호:");
		dto.setSno(input.nextLine());
		System.out.print("이름:");
		dto.setSname(input.nextLine());
		System.out.print("생년월일:");
		dto.setBirth(input.nextLine());
		System.out.print("성별:");
		dto.setGender(input.nextLine().toUpperCase());
		System.out.print("전화번호:");
		dto.setTel1(input.next());
		dto.setTel2(input.next());
		dto.setTel3(input.next());
		int row=dao.Student_Insert(dto);
		List<StudentDTO> In=dao.ShowStudent();
		System.out.println();
		System.out.print("학년\t반\t번호\t이름\t생년월일\t\t성별\t전화1\t전화2\t전화3\n");
		if(row==1) {
			for(StudentDTO list:In) {
				System.out.print(list.getSyear()+"\t");
				System.out.print(list.getSclass()+"\t");
				System.out.print(list.getSno()+"\t");
				System.out.print(list.getSname()+"\t");
				System.out.print(list.getBirth()+"\t");
				System.out.print(list.getGender()+"\t");
				System.out.print(list.getTel1()+"\t");
				System.out.print(list.getTel2()+"\t");
				System.out.print(list.getTel3()+"\n");
			}
		}else {
			System.out.print("등록실패");
		}
	}

}
