package com.jslhrd.bbb;

import java.util.*;

public class ScoreExam {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Map<Student,Score>map=new HashMap<Student,Score>();
		while(true) {
			String str[]=input.nextLine().split(",");
			if(str[0].equalsIgnoreCase("0")) {
				break;
			}
			int bun=Integer.parseInt(str[0]);
			String name=str[1];
			int kor=Integer.parseInt(str[2]);
			int eng=Integer.parseInt(str[3]);
			int mat=Integer.parseInt(str[4]);
			int tot=kor+eng+mat;
			double ave=tot/3.;
			double aa=Math.round(ave);
			int a=(int)aa;
			Student stu=new Student(bun,name);
			Score sco=new Score(kor,eng,mat,tot,a);
			if(map.containsKey(stu)) {
				System.out.println("이미등록된학생입니다");
				continue;
			}
			map.put(stu,sco);
		}
		int alltot=0;
	    double allave=0;
		System.out.print("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
		Set<Map.Entry<Student, Score>> set = map.entrySet();
		Iterator<Map.Entry<Student, Score>> iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<Student,Score> entry = iter.next();
			System.out.print(entry.getKey().getHakbun() + "\t");
			System.out.print(entry.getKey().getName() + "\t");
			System.out.print(entry.getValue().getKor() + "\t");
			System.out.print(entry.getValue().getEng() + "\t");
			System.out.print(entry.getValue().getMat() + "\t");
			System.out.print(entry.getValue().getTot() + "\t");
			System.out.print(entry.getValue().getAve() + "\n");
			alltot+=entry.getValue().getTot();
		}
		allave=alltot/(map.size()*3);
		System.out.println("전체점수");
		System.out.print("총점:"+alltot + "\t");
		System.out.printf("총점평균:%.1f\n",allave);
	}

}
