package exam;

import java.util.*;

import model.*;

public class Exam_03 {

	public static void main(String[] args) {
		MemberDAO Custmer=new MemberDAO();
		Scanner input=new Scanner(System.in);
		System.out.print("찾고자하는 고객 검색:");
		int CustNum=input.nextInt();
		System.out.println();
		if(Custmer.CustomerSerch(CustNum).getCUSTNAME() == null) {
			System.out.print("비어있습니다");
		}else {
			System.out.print("고객번호\t이름\t전화번호\t\t성별\t가입일자\t\t등급\t도시코드\n");
			System.out.print(Custmer.CustomerSerch(CustNum).getCUSTNO()+"\t");
			System.out.print(Custmer.CustomerSerch(CustNum).getCUSTNAME()+"\t");
			System.out.print(Custmer.CustomerSerch(CustNum).getPHONE()+"\t");
			if(Custmer.CustomerSerch(CustNum).getGENDER().equalsIgnoreCase("M")) {
				System.out.print("남성"+"\t");
			}else {
				System.out.print("여성"+"\t");
			}
			System.out.print(Custmer.CustomerSerch(CustNum).getJOINDATE().substring(0, 4)+"년");
			System.out.print(Custmer.CustomerSerch(CustNum).getJOINDATE().substring(4, 6)+"월");
			System.out.print(Custmer.CustomerSerch(CustNum).getJOINDATE().substring(6, 8)+"일"+"\t");
			switch (Custmer.CustomerSerch(CustNum).getGRADE()) {
			case "A":
				System.out.print("VIP"+"\t");
				break;
			case "B":
				System.out.print("우수고객"+"\t");
				break;
			case "C":
				System.out.print("직원"+"\t");
				break;
			default:
				break;
			}
			System.out.print(Custmer.CustomerSerch(CustNum).getCITY()+"\t");
			System.out.println();
		}
		

	}

}
