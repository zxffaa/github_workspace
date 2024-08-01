package Exam;

import java.util.List;
import model.StudentDAO;
import model.StudentDTO;

public class Exam_05 {

	public static void main(String[] args) {
		StudentDAO dao=new StudentDAO();
		List<StudentDTO>list=dao.EachClassAVG();
		System.out.print("학년\t반\t교사명\t국어총점\t영어총점\t수학총점\t국어평균\t영어평균\t수학평균\n");
		for(StudentDTO ALL:list) {
			System.out.print(ALL.getSyear()+"\t");
			System.out.print(ALL.getSclass()+"\t");
			System.out.print(ALL.getTname()+"\t");
			System.out.print(ALL.getKor()+"\t");
			System.out.print(ALL.getEng()+"\t");
			System.out.print(ALL.getMat()+"\t");
			System.out.printf("%.1f\t",ALL.getKORAVG());
			System.out.printf("%.1f\t",ALL.getENGAVG());
			System.out.printf("%.1f\n",ALL.getMATAVG());
		}
	}

}
