package exam;

import java.util.List;
import java.util.Scanner;

import model.ArtistDAO;
import model.ArtistDTO;

public class Exam_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArtistDAO dao = new ArtistDAO();
		ArtistDTO dto = new ArtistDTO();

		System.out.print("심사위원 채점결과 삭제화면\n");
		System.out.print("채점번호:");
		int bun = input.nextInt();
		dto.setSERIAL_NO(bun);
		int row = dao.SerchDelete03(dto);
		if (row == 1) {
			List<ArtistDTO> Score = dao.ScoreOutput();
			for (ArtistDTO list : Score) {
				System.out.print(list.getSERIAL_NO() + "\t");
				System.out.print(list.getARTIST_ID() + "\t");
				System.out.print(list.getMENTO_ID() + "\t");
				System.out.print(list.getPOINT() + "\n");
			}
		} else {
			System.out.print("실패");
		}

	}

}
