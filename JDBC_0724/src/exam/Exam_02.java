package exam;

import model.*;
import java.util.*;

public class Exam_02 {

	public static void main(String[] args) {
		MemberDAO ALL=new MemberDAO();
		List<MemberDTO>list=ALL.MemberAll();
		System.out.print("고객번호\t이름\t전화번호\t\t성별\t가입일자\t\t등급\t도시코드\n");
		for(MemberDTO MemAll:list) {
			System.out.print(MemAll.getCUSTNO()+"\t");
			System.out.print(MemAll.getCUSTNAME()+"\t");
			System.out.print(MemAll.getPHONE()+"\t");
			if(MemAll.getGENDER().equalsIgnoreCase("M")) {
				System.out.print("남성"+"\t");
			}else {
				System.out.print("여성"+"\t");
			}
			System.out.print(MemAll.getJOINDATE().substring(0, 4)+"년");
			System.out.print(MemAll.getJOINDATE().substring(4, 6)+"월");
			System.out.print(MemAll.getJOINDATE().substring(6, 8)+"일"+"\t");
			switch (MemAll.getGRADE()) {
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
			System.out.print(MemAll.getCITY());
			System.out.println();
		}
		
	}

}
