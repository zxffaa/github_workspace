package com.jslhrd.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	private static Connection getConnection() throws Exception {
		// 드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		// 커넥션 생성
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
		return conn;
	}

	// 메소드 작성
	public void dbTest() {
		Connection conn = null;
		try {
			conn = getConnection();
			System.out.println("커넥션 : " + conn);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public int SawonCount() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select count(*) as counter from emp";
		int SawonCounts =0;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				SawonCounts=rs.getInt("counter");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SawonCounts;
	}
	public int DeptCount() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select  sum(count(DISTINCT dno)) as DeptCount from emp group by dno";
		int DeptCounts =0;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				DeptCounts=rs.getInt("DeptCount");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DeptCounts;
	}
	public List<EmpDTO> SawonDeptCount(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select DISTINCT dno,count(dno) as dnocount from emp group by dno order by dno asc";
		int dnocount=0;
		List<EmpDTO> list=new ArrayList<EmpDTO>();
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO emp=new EmpDTO();
				emp.setDno(rs.getInt("dno"));
				emp.setDnocount(rs.getInt("dnocount"));
				list.add(emp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}
	public List<EmpDTO> SalaryMore(int salary){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select eno,ename,hiredate,salary from emp where salary>=?";
		List<EmpDTO> list=new ArrayList<EmpDTO>();
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, salary);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO emp=new EmpDTO();
				emp.setEno(rs.getInt("eno"));
				emp.setEname(rs.getString("ename"));
				emp.setHiredate(rs.getString("hiredate"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<EmpDTO> AllInOne(String Year){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select eno,ename,job,salary,dno from emp where hiredate like ? ";
		List<EmpDTO>list=new ArrayList<EmpDTO>();
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+Year+"%");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO All=new EmpDTO();
				All.setEno(rs.getInt("eno"));
				All.setEname(rs.getString("ename"));
				All.setJob(rs.getString("job"));
				All.setSalary(rs.getInt("salary"));
				All.setDno(rs.getInt("dno"));
				list.add(All);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}
