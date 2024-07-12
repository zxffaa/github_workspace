package com.jslhrd.aaa;

import java.sql.*;
import java.util.*;

public class select_01 {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;//select문 사용시 반드시 써야됨
		String sql="";
		String myURL="jdbc:oracle:thin:@localhost:1521:xe";
		String myID="TRACK2_17";
		String myPASS="1234";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("연결실패");
		}
		Scanner input=new Scanner(System.in);
		System.out.print("부서번호:");
		int dno=input.nextInt();
		System.out.print("급여:");
		int Salary=input.nextInt();
		try {
			conn=DriverManager.getConnection(myURL,myID,myPASS);
			sql="select eno,ename,dno,salary from emp where dno=? or salary>=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,dno);
			pstmt.setInt(2,Salary);
			rs=pstmt.executeQuery();
			System.out.println("사원번호\t이름\t부서번호\t급여");
			while(rs.next()) {
				System.out.print(rs.getInt("eno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getInt("dno") + "\t");
				System.out.print(rs.getInt("salary") + "\n");
			}
			conn.close();
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
