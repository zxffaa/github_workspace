package exam;

import java.util.List;
import java.util.Scanner;

import model.ArtistDAO;
import model.ArtistDTO;

public class Exam_03 {

	public static void main(String[] args) {
		ArtistDAO dao=new ArtistDAO();
		ArtistDTO dto=new ArtistDTO();
		Scanner Input=new Scanner(System.in);
		System.out.print("심사위원채점결과 등록화면\n");
		System.out.print("채점번호:");
		dto.setSERIAL_NO(Input.nextInt());
		System.out.print("참가번호:");
		dto.setARTIST_ID(Input.next());
		System.out.print("멘토아이디:");
		dto.setMENTO_ID(Input.next());
		System.out.print("점수:");
		dto.setPOINT(Input.nextInt());
		dao.ScoreInput(dto);
		System.out.println();
		System.out.print("채첨번호\t참가번호\t멘토아이디\t점수\n");
		List<ArtistDTO> Score=dao.ScoreOutput();
		for(ArtistDTO list:Score) {
			System.out.print(list.getSERIAL_NO()+"\t");
			System.out.print(list.getARTIST_ID()+"\t");
			System.out.print(list.getMENTO_ID()+"\t");
			System.out.print(list.getPOINT()+"\n");
		}
		
	}

}
