package exam;

import java.util.List;

import model.ArtistDAO;
import model.ArtistDTO;

public class Exam_08 {

	public static void main(String[] args) {
		ArtistDAO dao=new ArtistDAO();
		int i=0;
		List<ArtistDTO> list=dao.FinalList();
		System.out.print("참가번호\t참가자명\t성별\t총점\t평균\t등수\n");
		for(ArtistDTO Show:list) {
			System.out.print(Show.getARTIST_ID()+"\t");
			System.out.print(Show.getARTIST_NAME()+"\t");
			if(Show.getARTIST_GENDER().equalsIgnoreCase("M")) {
				System.out.print("남성\t");
			}else {
				System.out.print("여성\t");
			}
			System.out.print(Show.getALLADD()+"\t");
			System.out.printf("%.2f\t",Show.getALLAVG());
			++i;
			System.out.print("등수:"+i+"\n");
		}

	}

}
