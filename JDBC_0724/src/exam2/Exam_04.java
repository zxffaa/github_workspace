package exam2;

import model.*;
import java.util.*;

public class Exam_04 {

	public static void main(String[] args) {
		MoneyDAO all=new MoneyDAO();
		List<MoneyDTO> list=all.MoneyShow();
		System.out.print("회원번호\t판매번호\t\t단가\t수량\t가격\t상품코드\t판매일자\n");
		for(MoneyDTO SHOW:list) {
			
			System.out.print(SHOW.getCustno()+"\t");
			System.out.print(SHOW.getSaleno()+"\t");
			System.out.print(SHOW.getPrice()+"\t");
			System.out.print(SHOW.getAmount()+"\t");
			System.out.print((SHOW.getPrice()*SHOW.getAmount())+"\t");
			System.out.print(SHOW.getPcode()+"\t");
			System.out.print(SHOW.getSdate().substring(0, 4)+"년");
			System.out.print(SHOW.getSdate().substring(5, 7)+"월");
			System.out.print(SHOW.getSdate().substring(8, 10)+"일"+"\n");
		}

	}

}
