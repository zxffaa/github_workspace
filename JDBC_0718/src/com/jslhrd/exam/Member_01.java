package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.model.*;

public class Member_01 {

	public static void main(String[] args) {
		MemberDAO mem=new MemberDAO();
		List<MemberDTO>list=mem.AllMemberDTO();
		System.out.print("고객번호\t고객이름\t고객전화번호\t\t고객성별\t고객가입일\t\t고객등급\t고객도시\n");
		for(int i=0;list.size()>i;i++) {
			System.out.print(list.get(i).getCustno()+"\t");
			System.out.print(list.get(i).getCustname()+"\t");
			System.out.print(list.get(i).getPhone()+"\t");
			System.out.print(list.get(i).getGender()+"\t");
			System.out.print(list.get(i).getJoindate()+"\t");
			System.out.print(list.get(i).getGrade()+"\t");
			System.out.print(list.get(i).getCity()+"\n");
			
		}
	}

}
