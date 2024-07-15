package com.jslhrd.model;

import java.sql.*;
import java.util.*;

public class ExamDAO  {
	private static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
		
		return conn;
	}
	public void test() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn=getConnection();
			System.out.println("커넥션:"+conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//사원수 카운트-결과값이 하나일경우 IF문
	public int empCount() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//쿼리작성
		String sql="select COUNT(*) as counter from emp";
		int row =0;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				row=rs.getInt("counter");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}
	public EmpDTO getName(String name) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//쿼리작성
		String sql="select * from emp where ename=?";
		//반환타입
		EmpDTO dto=new EmpDTO();
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getNString("ename"));
				dto.setJob((rs.getNString("job")));
				dto.setManager(rs.getNString("manager"));;
				dto.setHiredate(rs.getNString("hiredate"));
				dto.setSalary(rs.getInt("salary"));
				dto.setCommission(rs.getInt("commission"));
				dto.setDno(rs.getInt("dno"));
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	public List<EmpDTO> getDno(int dno){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<EmpDTO>list =new ArrayList<EmpDTO>();
		String sql="select * from emp where dno=?";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dno);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto=new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getNString("ename"));
				dto.setJob((rs.getNString("job")));
				dto.setManager(rs.getNString("manager"));;
				dto.setHiredate(rs.getNString("hiredate"));
				dto.setSalary(rs.getInt("salary"));
				dto.setCommission(rs.getInt("commission"));
				dto.setDno(rs.getInt("dno"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<CommDTO> getSalary(int salary){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<CommDTO>list =new ArrayList<CommDTO>();
		String sql="select * from emp where salary>=?";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, salary);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				CommDTO dto=new CommDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getNString("ename"));
				dto.setJob((rs.getNString("job")));
				dto.setManager(rs.getNString("manager"));;
				dto.setHiredate(rs.getNString("hiredate"));
				dto.setSalary(rs.getInt("salary"));
				dto.setCommission(rs.getInt("commission"));
				dto.setDno(rs.getInt("dno"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<EmpDTO> getUpSalary(int dno){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<EmpDTO>list =new ArrayList<EmpDTO>();
		String sql="select eno,ename,salary,salary*12 as bonus from emp where dno=?";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dno);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto=new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getNString("ename"));
				dto.setSalary(rs.getInt("salary"));
				dto.setBonus(rs.getInt("bonus"));
				dto.setDno(rs.getInt("dno"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<EmpDTO> SawonSerch(int eno){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select ename,dno from emp where eno=?";
		List<EmpDTO>list=new ArrayList<EmpDTO>();
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, eno);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO a=new EmpDTO();
				a.setDno(rs.getInt("dno"));
				a.setEname(rs.getString("Ename"));
				list.add(a);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<EmpDTO> ComUpSerch(int commission){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select ename,salary,commission from emp where commission>=?";
		List<EmpDTO>list=new ArrayList<EmpDTO>();
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, commission);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO a=new EmpDTO();
				a.setEname(rs.getString("Ename"));
				a.setSalary(rs.getInt("Salary"));
				a.setCommission(rs.getInt("commission"));
				list.add(a);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public int SalarySum(int dno) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int all=0;
		String sql="select sum(salary) as Allsum from emp where dno=?";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dno);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				all=rs.getInt("Allsum");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return all;
	}
	public List<CommDTO> JobKategorie(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<CommDTO> list=new ArrayList<CommDTO>();
		String sql="select job,max(salary) as max,min(salary) as min,round(avg(salary))as avg from emp group by job";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				CommDTO a=new CommDTO();
				a.setJob(rs.getString("job"));
				a.setAvg(rs.getInt("avg"));
				a.setMax(rs.getInt("max"));
				a.setMin(rs.getInt("min"));
				list.add(a);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<CommDTO> Like(String a){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<CommDTO> list=new ArrayList<CommDTO>();
		String sql="select eno,ename,salary from emp where ename like ?";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,"%"+a+"%");
			//pstmt.setString(1,"%"+a);
			//pstmt.setString(1,a+"%");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				CommDTO ba=new CommDTO();
				ba.setEno(rs.getInt("eno"));
				ba.setEname(rs.getString("ename"));
				ba.setSalary(rs.getInt("salary"));
				list.add(ba);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
}
