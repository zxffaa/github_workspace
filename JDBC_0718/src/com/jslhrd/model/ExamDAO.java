package com.jslhrd.model;

import java.sql.*;
import java.util.*;

public class ExamDAO {
	private static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
		return conn;
	}
	public List<ExamDTO> SawonSerch(String a){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select eno,ename,emp.dno,dname from emp,dept where emp.dno=dept.dno and emp.ename=?";
		List<ExamDTO> list=new ArrayList<ExamDTO>();
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,a);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				ExamDTO Sawonname=new ExamDTO();
				Sawonname.setEno(rs.getInt("eno"));
				Sawonname.setEname(rs.getString("ename"));
				Sawonname.setDno(rs.getInt("dno"));
				Sawonname.setDname(rs.getString("dname"));
				list.add(Sawonname);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
