package exam2;

import java.util.Scanner;

import model.*;


public class Exam_02 {

	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		MoneyDTO dto=new MoneyDTO();
		MoneyDAO dao=new MoneyDAO();
		System.out.print("고객 번호입력:");
		dto.setCustno(Input.nextInt());
		System.out.print("판매 번호입력:");
		dto.setSaleno(Input.nextInt());
		System.out.print("가격입력:");
		dto.setPrice(Input.nextInt());
		System.out.print("수량 번호입력:");
		dto.setAmount(Input.nextInt());
		System.out.print("상품코드 번호입력:");
		dto.setPcode(Input.next());
		
		
		
		int row=dao.CustomerINFOInsert(dto);
		if(row==0) {
			System.out.print("등록실패");
		}else {
			System.out.print("등록성공");
		}

	}

}
