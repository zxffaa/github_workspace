package exam;

import java.util.List;

import model.ArtistDAO;
import model.ArtistDTO;

public class Exam_07 {

	public static void main(String[] args) {
		
		ArtistDAO dao = new ArtistDAO();
		List<ArtistDTO> Mento_Score = dao.ScoreList();
		System.out.print("체점번호\t참가번호\t참가자명\t생년월일\t\t점수\t평점\t멘토\n");
		for(ArtistDTO list:Mento_Score) {
			System.out.print(list.getSERIAL_NO()+"\t");
			System.out.print(list.getARTIST_ID()+"\t");
			System.out.print(list.getARTIST_NAME()+"\t");
			System.out.print(list.getARTIST_BIRTH().substring(0, 4) + "년");
			System.out.print(list.getARTIST_BIRTH().substring(4, 6) + "월");
			System.out.print(list.getARTIST_BIRTH().substring(6, 8) + "일" + "\t");
			System.out.print(list.getPOINT()+"\t");
			
			if(list.getPOINT()>=90) {
				System.out.print("A\t");
			}else if(list.getPOINT()>=80){
				System.out.print("B\t");
			}else if(list.getPOINT()>=70) {
				System.out.print("C\t");
			}else if(list.getPOINT()>=60) {
				System.out.print("D\t");
			}else {
				System.out.print("F\t");
			}
			System.out.print(list.getMEMTO_NAME()+"\n");
		}
	}
}
