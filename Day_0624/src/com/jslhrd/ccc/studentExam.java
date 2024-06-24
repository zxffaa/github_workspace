package com.jslhrd.ccc;

import java.util.*;

public class studentExam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<student> stu=new ArrayList<student>();
		student stu1=null;
		while(true) {
			System.out.print("회원등록:");
			String[] str = input.nextLine().split(",");
			if(str[0].equals("0")) {
				break;
			}
			int tot=Integer.parseInt(str[2])+Integer.parseInt(str[3])+Integer.parseInt(str[4]);
			double ave=tot/3.;
			String score="가";
			if(ave>90) {
				score="수";
			}else if(ave>80) {
				score="우";
			}else if(ave>70) {
				score="미";
			}else if(ave>60) {
				score="양";
			}
			stu1 = new student(Integer.parseInt(str[0]),str[1],Integer.parseInt(str[2]),Integer.parseInt(str[3]),Integer.parseInt(str[4]),tot,ave,score);
			boolean bool = true;
			for(int i=0; i<stu.size()-1;i++) {
				if(stu1.equals(stu.get(i).getBun())) {
					bool = false;
					break;
				}
			}
			if(bool){
				stu.add(stu1);
			}else {
				System.out.println("중복된 ID입니다.");
			}
		}
		int ktot=0;
		int etot=0;
		int mtot=0;
		int ttot=0;
		System.out.print("학번\t이름\t국어\t영어\t수학\t총점\t평균\t판정\n");
		for (int i = 0; i < stu.size(); i++) {
			student one = stu.get(i);
			System.out.print(one.getBun() + "\t");
			System.out.print(one.getName() + "\t");
			System.out.print(one.getKOR() + "\t");
			System.out.print(one.getENG() + "\t");
			System.out.print(one.getMATH() + "\t");
			System.out.print(one.getTot() + "\t");
			System.out.printf("%.1f\t",one.getAve());
			System.out.print(one.getScore() + "\n");
			ktot+=one.getKOR();
			etot+=one.getENG();
			mtot+=one.getMATH();
			ttot+=one.getTot();
		}
		System.out.print(ktot + "\t"+etot + "\t"+mtot + "\t"+ttot + "\n");
	}

}
