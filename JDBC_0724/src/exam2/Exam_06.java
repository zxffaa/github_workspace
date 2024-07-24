package exam2;

import java.util.List;

import model.*;

public class Exam_06 {

	public static void main(String[] args) {
		MoneyDAO ShCt=new MoneyDAO();
		List<MoneyDTO> list=ShCt.ShowCity();
		System.out.print("회원번호\t회원성명\t휴대전화\t\t성별\t날짜\t\t등급\t도시\n");
		for(MoneyDTO City:list) {
			System.out.print(City.getCustno()+"\t");
			System.out.print(City.getCUSTNAME()+"\t");
			System.out.print(City.getPHONE()+"\t");
			if(City.getGENDER().equalsIgnoreCase("M")) {
				System.out.print("남성"+"\t");
			}else {
				System.out.print("여성"+"\t");
			}
			System.out.print(City.getJOINDATE().substring(0, 4)+"년");
			System.out.print(City.getJOINDATE().substring(4, 6)+"월");
			System.out.print(City.getJOINDATE().substring(6, 8)+"일"+"\t");
			switch (City.getGRADE()) {
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
			System.out.print(City.getCity()+"\n");
			
		}

	}

}
