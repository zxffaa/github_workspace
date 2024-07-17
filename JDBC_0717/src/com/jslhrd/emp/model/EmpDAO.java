package com.jslhrd.emp.model;

import java.sql.*;
import java.util.*;

public class EmpDAO {
	private static Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
		return conn;
	}

	public List<EmpDTO> FirstPrint() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		String sql = "select eno,ename,job,hiredate,salary from emp";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmpDTO First = new EmpDTO();
				First.setEno(rs.getInt("eno"));
				First.setEname(rs.getString("ename"));
				First.setJob(rs.getString("job"));
				First.setHiredate(rs.getString("hiredate"));
				First.setSalary(rs.getInt("salary"));
				list.add(First);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public EmpDTO TwoPrint(int SawonNumber) {
		EmpDTO Two = new EmpDTO();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select eno,ename,job,hiredate,salary from emp where eno=?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, SawonNumber);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				Two.setEno(rs.getInt("eno"));
				Two.setEname(rs.getString("ename"));
				Two.setJob(rs.getString("job"));
				Two.setHiredate(rs.getString("hiredate"));
				Two.setSalary(rs.getInt("salary"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Two;
	}

	public EmpDTO ThirdPrint() {
		EmpDTO Third = new EmpDTO();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select max(salary) as ma,min(salary)as mi,SUM(salary)as tot,round(avg(salary),2) as av from emp";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				Third.setMax(rs.getInt("ma"));
				Third.setMin(rs.getInt("mi"));
				Third.setTot(rs.getInt("tot"));
				Third.setAvg(rs.getDouble("av"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Third;
	}
	public List<EmpDTO> FourPrint() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		String sql = "select dno, count(ename) as num,round(avg(salary),2) as av from emp group by dno";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmpDTO Four = new EmpDTO();
				Four.setEno(rs.getInt("dno"));
				Four.setCnt(rs.getInt("num"));
				Four.setAvg(rs.getDouble("av"));
				list.add(Four);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
	public List<EmpDTO> FivePrint() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		String sql = "select job,max(salary) as ma,min(salary) as mi from emp where salary>2000 group by job";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmpDTO Five = new EmpDTO();
				Five.setJob(rs.getString("job"));
				Five.setMax(rs.getInt("ma"));
				Five.setMin(rs.getInt("mi"));
				list.add(Five);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<EmpDTO> SixPrint() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		String sql = "select dno,count(ename) as cnt,round(avg(salary)) as av from emp group by dno";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmpDTO Six = new EmpDTO();
				Six.setDno(rs.getInt("dno"));
				Six.setCnt(rs.getInt("cnt"));
				Six.setAvg(rs.getDouble("av"));
				list.add(Six);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
