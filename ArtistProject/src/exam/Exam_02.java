package exam;

import java.util.List;

import model.ArtistDAO;
import model.ArtistDTO;

public class Exam_02 {

	public static void main(String[] args) {
		ArtistDAO dao = new ArtistDAO();
		List<ArtistDTO> Artist_Show = dao.ArtistShow();
		System.out.print("참가번호\t참가자명\t생년월일\t\t성별\t특기\t소속사\n");
		for (ArtistDTO list : Artist_Show) {
			System.out.print(list.getARTIST_ID() + "\t");
			System.out.print(list.getARTIST_NAME() + "\t");
			System.out.print(list.getARTIST_BIRTH().substring(0, 4) + "년");
			System.out.print(list.getARTIST_BIRTH().substring(4, 6) + "월");
			System.out.print(list.getARTIST_BIRTH().substring(6, 8) + "일" + "\t");
			if (list.getARTIST_GENDER().equalsIgnoreCase("M")) {
				System.out.print("남성\t");
			} else {
				System.out.print("여성\t");
			}
			switch (list.getTALENT()) {
			case "1":
				System.out.print("댄스\t");
				break;
			case "2":
				System.out.print("노래\t");
				break;
			case "3":
				System.out.print("랩\t");
				break;
			default:
				break;
			}
			System.out.print(list.getAGENCY() + "\t");
			System.out.println();
		}

	}

}
