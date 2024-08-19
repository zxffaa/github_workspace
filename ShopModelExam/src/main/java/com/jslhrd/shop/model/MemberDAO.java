package com.jslhrd.shop.model;

import java.sql.*;
import java.util.*;
import com.jslhrd.shop.util.DBManager;

public class MemberDAO {
/*	
 // DBManager 클래스가 없는 경우
	private static Connection getConnection() {		
		Connection conn = null;
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//커넥션연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;

	}
*/	
	//회원수 카운트
	public int memberCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//반환타입
		int count = 0;
		String sql = "select count(*) from tbl_member";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		
			if(rs.next()) {
				count = rs.getInt(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return count;
	}
	
	//회원정보 목록
	public int memberWrite(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//반환타입
		int row = 0;
		String sql = "insert into tbl_member(custno,custname,phone,gender,joindate,grade,city) "
				+ " values(?,?,?,?,?,?,?)";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getCustno());
			pstmt.setString(2, dto.getCustname());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getJoindate());
			pstmt.setString(6,dto.getGrade());
			pstmt.setString(7, dto.getCity());
			
			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return row;
	}
	
	//회원정보등록
	public List<MemberDTO> memberList(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		String sql="select * from tbl_member order by custno asc";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setGender(rs.getString("gender"));
				dto.setJoindate(rs.getString("joindate"));
				dto.setGrade(rs.getString("grade"));
				dto.setCity(rs.getString("city"));
				
				list.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	
	public MemberDTO getMember(int custno){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		MemberDTO dto=new MemberDTO();
		String sql="select * from tbl_member where custno=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custno);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setGender(rs.getString("gender"));
				dto.setJoindate(rs.getString("joindate"));
				dto.setGrade(rs.getString("grade"));
				dto.setCity(rs.getString("city"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return dto;
	}
	public int memberUpdate(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		//반환타입
		int row = 0;
		String sql = "update tbl_member set "
				+ "phone=?,gender=?,joindate=?,grade=?,city=? "
			;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getPhone());
			pstmt.setString(2, dto.getGender());
			pstmt.setString(3, dto.getJoindate());
			pstmt.setString(4,dto.getGrade());
			pstmt.setString(5, dto.getCity());
			
			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
}
