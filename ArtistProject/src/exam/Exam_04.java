package exam;

import java.util.List;
import java.util.Scanner;

import model.*;

public class Exam_04 {

	public static void main(String[] args) {
		ArtistDAO dao=new ArtistDAO();
		ArtistDTO dto=new ArtistDTO();
		Scanner Input=new Scanner(System.in);
		
		
		System.out.print("심사위원 채점결과 수정화면\n");
		System.out.print("채점번호:");
		dto.setSERIAL_NO(Integer.parseInt(Input.nextLine()));
		
		System.out.print("채점점수:");
		dto.setPOINT(Integer.parseInt(Input.nextLine()));
		
		int row=dao.pointModitfy(dto);
		if(row !=0) {
			System.out.print("수정성공");
			List<ArtistDTO> Score=dao.ScoreOutput();
			for(ArtistDTO list:Score) {
				System.out.print(list.getSERIAL_NO()+"\t");
				System.out.print(list.getARTIST_ID()+"\t");
				System.out.print(list.getMENTO_ID()+"\t");
				System.out.print(list.getPOINT()+"\n");
			}
		}else {
			System.out.print("수정실패");
		}
	}

}
