package com.jslhrd.ccc;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.*;
import java.util.*;

public class StudentFution{
	Scanner input = new Scanner(System.in);
	List<Student> list = new ArrayList<Student>();
	Set<Student> stuSet = new HashSet<Student>();
	int cnt=0;
	String grade = "";

	public void First_Intro() {
		System.out.println("[***성적관리프로그램***]");
		System.out.println("[1]학생등록 [2]전체출력 [3]종료");
		System.out.print("번호입력:");
	}

	public String Student_Grade(double ave) {
		if (ave > 90) {
			grade = "A";
		} else if (ave > 80) {
			grade = "B";
		} else if (ave > 70) {
			grade = "C";
		} else if (ave > 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;
	}

	public String[] Student_input() {
		System.out.print("학생정보입력:");
		String str[] = input.next().split(",");
		return str;
	}

	public int as() {
		String Arry[] = Student_input();
		int bun = Integer.parseInt(Arry[0]);
		String name = Arry[1];
		int kor = Integer.parseInt(Arry[2]);
		int eng = Integer.parseInt(Arry[3]);
		int mat = Integer.parseInt(Arry[4]);
		int tot = kor + eng + mat;
		double ave = Math.round((tot / 3.) * 100) / 100;
		boolean Same = false;
		for (int i = 0; i < list.size(); i++) {
			int ibun = list.get(i).getBun();
			if (bun == ibun) {
				Same = true;
			}
		}
		if (Same) {
			System.out.println("중복된 번호입니다");
		} else {
			Student Student = new Student(bun, name, kor, eng, mat, tot, ave, Student_Grade(ave));
			list.add(Student);
			cnt++;
			System.out.println("[학생" + cnt + "명 등록]");
		}
		return cnt;
	}
	public int as2() {
		String Arry[] = Student_input();
		int bun = Integer.parseInt(Arry[0]);
		String name = Arry[1];
		int kor = Integer.parseInt(Arry[2]);
		int eng = Integer.parseInt(Arry[3]);
		int mat = Integer.parseInt(Arry[4]);
		int tot = kor + eng + mat;
		double AVE1 = tot / 3.;
		double ave = Math.round(AVE1 * 100) / 100;
		Student Student = new Student(bun, name, kor, eng, mat, tot, ave, Student_Grade(ave));
		if (stuSet.contains(Student)) {
			System.out.println("이미 등록된 학생입니다");
		} else {
			stuSet.add(Student);
			cnt++;
			System.out.println("[학생" + cnt + "명 등록]");
		}
		return cnt;
	}
	
	
	
	
	
	public void List_Print(int num) {
		int ktot = 0, etot = 0, mtot = 0, ttot = 0;
		double kave = 0, eave = 0, mave = 0, tave = 0;
		System.out.print("번호\t이름\t국어\t영어\t수학\t총합\t평균\t등급\n");
		for (int i = 0; i < list.size(); i++) {
			Student one = list.get(i);
			System.out.print(one.getBun() + "\t");
			System.out.print(one.getName() + "\t");
			System.out.print(one.getKOR() + "\t");
			System.out.print(one.getENG() + "\t");
			System.out.print(one.getMath() + "\t");
			System.out.print(one.getTot() + "\t");
			System.out.print(one.getAve() + "\t");
			System.out.print(one.getGrade() + "\n");
			ktot += one.getKOR();
			etot += one.getENG();
			mtot += one.getMath();
			ttot += one.getTot();
		}
		kave = Math.round((ktot / list.size()) * 100) / 100;
		mave = Math.round((mtot / list.size()) * 100) / 100;
		eave = Math.round((etot / list.size()) * 100) / 100;
		tave = Math.round((ttot / (list.size() * 3)) * 100) / 100;
		System.out.printf("국어총점%d\t영어총점%d\t수학총점%d\n종합총점%d\n", ktot, etot, mtot, ttot);
		System.out.printf("국어평균%.2f\t영어평균%.2f\t수학평균%.2f\n종합평균%.2f\n", kave, eave, mave, tave);
		System.out.printf("총인원수:%d\n", num);
	}
	public void Set_Print(int num) {
		int ktot = 0, etot = 0, mtot = 0, ttot = 0;
		double kave = 0, eave = 0, mave = 0, tave = 0;
		System.out.print("번호\t이름\t국어\t영어\t수학\t총합\t평균\t등급\n");
		for (Student s : stuSet) {
			System.out.print(s.getBun() + "\t");
			System.out.print(s.getName() + "\t");
			System.out.print(s.getKOR() + "\t");
			System.out.print(s.getENG() + "\t");
			System.out.print(s.getMath() + "\t");
			System.out.print(s.getTot() + "\t");
			System.out.print(s.getAve() + "\t");
			System.out.print(s.getGrade() + "\n");
			ktot+=s.getKOR();etot+=s.getENG();mtot+=s.getMath();ttot+=s.getTot();
		}
		kave = Math.round((ktot / num) * 100) / 100;
	    mave = Math.round((mtot / num) * 100) / 100;
	    eave = Math.round((etot / num) * 100) / 100;
	    tave = Math.round((ttot / (num*3)) * 100) / 100;
	    System.out.printf("국어총점%d\t영어총점%d\t수학총점%d\n종합총점%d\n",ktot,etot,mtot,ttot);
	    System.out.printf("국어평균%.2f\t영어평균%.2f\t수학평균%.2f\n종합평균%.2f\n",kave,eave,mave,tave);
	    System.out.printf("총인원수:%d\n", num);
	}
	
	
	public boolean saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/student.dat")))) {
            oos.writeObject(list);
            oos.close();
            return false;
        } catch (IOException e) {
            System.err.println("Error saving to file: " + e.getMessage());
            return false;
        }
    }
	public boolean SetsaveToFile() {
		List<Student> stuu = new ArrayList<>(stuSet);
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/student.dat")))) {
            oos.writeObject(stuu);
            oos.close();
            return false;
        } catch (IOException e) {
            System.err.println("Error saving to file: " + e.getMessage());
            return false;
        }
    }
}
