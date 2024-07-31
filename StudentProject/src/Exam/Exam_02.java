package Exam;

import java.util.List;
import java.util.Scanner;

import model.StudentDAO;
import model.StudentDTO;

public class Exam_02 {

	public static void main(String[] args) {
		StudentDAO dao=new StudentDAO();
		StudentDTO dto=new StudentDTO();
		Scanner input=new Scanner(System.in);
		
		
		System.out.print("학생등록 화면\n");
		System.out.print("학년:");
		dto.setSyear(input.next());
		System.out.print("반:");
		dto.setSclass(input.next());
		System.out.print("번호:");
		dto.setSno(input.next());
		System.out.print("국어:");
		dto.setKor(input.nextInt());
		System.out.print("영어:");
		dto.setEng(input.nextInt());
		System.out.print("수학:");
		dto.setMat(input.nextInt());
		int row=dao.Score_Insert(dto);
		List<StudentDTO> all=dao.ShowScore();
		System.out.print("학년\t반\t번호\t국어\t영어\t수학\t총점\t평균\n");
		if(row==1) {
			for(StudentDTO list:all) {
				System.out.print(list.getSyear()+"\t");
				System.out.print(list.getSclass()+"\t");
				System.out.print(list.getSno()+"\t");
				System.out.print(list.getKor()+"\t");
				System.out.print(list.getEng()+"\t");
				System.out.print(list.getMat()+"\t");
				System.out.print(list.getAdd()+"\t");
				System.out.print(list.getAvg()+"\n");
			}
			
		}else {
			System.out.print("등록실패");
		}
	}

}
