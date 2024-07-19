package com.jslhrd.model;

import java.sql.*;
import java.util.*;

public class EmpDAO {
	private static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
		return conn;
	}
	public List<EmpDTO> getExam01(int dno){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<EmpDTO>list=new ArrayList<EmpDTO>();
		String sql="select eno,ename,job,hiredate,salary from emp where dno=(select dno from emp where eno=?)";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dno);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO exam01=new EmpDTO();
				exam01.setEno(rs.getInt("eno"));
				exam01.setEname(rs.getString("ename"));
				exam01.setJob(rs.getString("job"));
				exam01.setHiredate(rs.getString("hiredate"));
				exam01.setSalary(rs.getInt("salary"));
				list.add(exam01);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<EmpDTO> SawonNameSerch(String Name){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select eno,ename from emp where dno in(select dno from emp where ename like ?)";
		List<EmpDTO>list=new ArrayList<EmpDTO>();
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+Name+"%");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO NaMaEa=new EmpDTO();
				NaMaEa.setEno(rs.getInt("eno"));
				NaMaEa.setEname(rs.getString("ename"));
				list.add(NaMaEa);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<EmpDTO> SawonLocSerch(String LOC){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select ename,dno,job from emp where dno in(select dno from dept where loc=?)";
		List<EmpDTO>list=new ArrayList<EmpDTO>();
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, LOC);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO Local=new EmpDTO();
				Local.setEname(rs.getString("ename"));
				Local.setDno(rs.getInt("dno"));
				Local.setJob(rs.getString("job"));
				list.add(Local);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
