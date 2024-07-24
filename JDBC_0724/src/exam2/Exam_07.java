package exam2;

import java.util.List;

import model.MoneyDAO;
import model.MoneyDTO;

public class Exam_07 {

	public static void main(String[] args) {
		MoneyDAO ShTo=new MoneyDAO();
		List<MoneyDTO> list=ShTo.Totshow();
		System.out.print("회원번호\t회원성명\t휴대전화\t\t등급\t총액\n");
		for(MoneyDTO Tot:list) {
			System.out.print(Tot.getCustno()+"\t");
			System.out.print(Tot.getCUSTNAME()+"\t");
			System.out.print(Tot.getPHONE()+"\t");
			switch (Tot.getGRADE()) {
			case "A":
				System.out.print("VIP"+"\t");
				break;
			case "B":
				System.out.print("일반"+"\t");
				break;
			case "C":
				System.out.print("직원"+"\t");
				break;
			default:
				break;
			}
			System.out.print(Tot.getTotal()+"\n");
			
		}

	}

}
