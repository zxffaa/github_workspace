package com.jslhrd.exam;

import java.util.*;

import com.jslhrd.model.*;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner IN = new Scanner(System.in);
		System.out.print("지역을 입력해주세요:");
		String OUT = IN.next().toUpperCase();
		System.out.println();
		EmpDAO Model_In = new EmpDAO();
		List<EmpDTO> list = Model_In.SawonLocSerch(OUT);
		if (list.size() == 0) {
			System.out.print("비어있습니다");
		} else {
			System.out.print("이름\t지역명\t직무\n");
			for (int i = 0; list.size() > i; i++) {
				System.out.print(list.get(i).getEname() + "\t");
				switch (list.get(i).getDno()) {
				case 10:
					System.out.print("NEW YORK\t");
					break;
				case 20:
					System.out.print("DALLAS\t");
					break;
				case 30:
					System.out.print("CHICAGO\t");
					break;
				case 40:
					System.out.print("BOSTON\t");
					break;
				default:
					break;
				}
				System.out.print(list.get(i).getJob() + "\n");
			}
		}
	}
}
