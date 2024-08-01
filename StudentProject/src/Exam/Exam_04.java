package Exam;

import java.util.List;

import model.StudentDAO;
import model.StudentDTO;

public class Exam_04 {

	public static void main(String[] args) {
		StudentDAO dao=new StudentDAO();
		int KORALL=0,ENGALL=0,MATHALL=0;
		double KORAVG=0,ENGAVG=0,MATHAVG=0;
		double cnt=0;
		List<StudentDTO>list=dao.StudentScoreShow();
		System.out.print("학년-반-번호\t이름\t성별\t국어\t영어\t수학\t총점\t평균\n");
		for(StudentDTO All:list) {
			System.out.print(All.getSyear()+"-"+All.getSclass()+"-"+All.getSno()+"\t\t");
			System.out.print(All.getSname()+"\t");
			if(All.getGender().equalsIgnoreCase("M")) {
				System.out.print("남\t");
			}else {
				System.out.print("여\t");
			}
			System.out.print(All.getKor()+"\t");
			System.out.print(All.getEng()+"\t");
			System.out.print(All.getMat()+"\t");
			System.out.print(All.getAdd()+"\t");
			System.out.print(All.getAvg()+"\n");
			KORALL=KORALL+All.getKor();
			ENGALL=ENGALL+All.getEng();
			MATHALL=MATHALL+All.getMat();
			cnt++;
		}
		System.out.print("\t\t\t  학년총점:"+KORALL+"\t"+ENGALL+"\t"+MATHALL+"\n");
		KORAVG=KORALL/cnt;
		ENGAVG=ENGALL/cnt;
		MATHAVG=MATHALL/cnt;
		System.out.printf("\t\t\t  학년평균:%.1f\t%.1f\t%.1f\t",KORAVG,ENGAVG,MATHAVG);
	}

}
