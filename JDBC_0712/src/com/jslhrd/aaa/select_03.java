package com.jslhrd.aaa;

import java.sql.*;
import java.util.*;

public class select_03 {

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
		System.out.print("입사년도:");
		int Salary1=input.nextInt();
		try {
			conn=DriverManager.getConnection(myURL,myID,myPASS);
			sql="select eno,ename,job,hiredate,salary,dno from emp where substr(hiredate,1,2)>?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,Salary1);
			rs=pstmt.executeQuery();
			System.out.println("사원번호\t이름\t업무\t입사일자\t\t\t급여\t부서번호");
			while(rs.next()) {
				System.out.print(rs.getInt("eno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getString("job") + "\t");
				System.out.print(rs.getString("hiredate") + "\t");
				System.out.print(rs.getInt("salary") + "\t");
				System.out.print(rs.getInt("dno") + "\n");
			}
			conn.close();
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
