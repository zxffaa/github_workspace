package com.jslhrd.exservlet.model.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jslhrd.exservlet.util.DBManager;

public class UserDAO {
	private UserDAO() {}
	private static UserDAO instance = new UserDAO();
	
	public static UserDAO getInstance() {
		return instance;
	}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//아이디 중복체크
	public int userIdCheck(String userid) {
		int row=0;
		String sql="select count(*) from tbl_user where userid = ?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				row = rs.getInt(1);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return row;
	}
	//회원가입
	public int userWrite(UserDTO dto) {
		int row=0;
		String sql="insert into tbl_user(name, userid, passwd, tel, email)\r\n"
				+ "            values(?, ?, ? ,? ,?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getUserid());
			pstmt.setString(3, dto.getPasswd());
			pstmt.setString(4, dto.getTel());
			pstmt.setString(5, dto.getEmail());

			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	//로그인
	public int userLogin(String userid, String passwd) {
		int row=0;//-1(아이디 없음),0(비번오류), 1(성공)
		String sql="select passwd from tbl_user where userid=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String dbpass = rs.getString("passwd");
				if(dbpass.equals(passwd)) {
					//가장 최근 로그인한 날자 업데이트
					sql="update tbl_user set last_time = sysdate where userid=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, userid);
					pstmt.executeUpdate();
					
					row=1;
				}else {
					row = 0;
				}
			}else {//아이디가 없은 경우
				row = -1;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return row;
	}
	//특정 userid을 이용한 회원검색, 수정
	public UserDTO userSelect(String userid) {
		UserDTO dto = new UserDTO();
		String sql="select * from tbl_user where userid = ?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setName(rs.getString("name"));
				dto.setUserid(rs.getString("userid"));
				dto.setTel(rs.getString("tel"));
				dto.setEmail(rs.getString("email"));
				dto.setFirst_time(rs.getString("first_time"));
				dto.setLast_time(rs.getString("last_time"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return  dto;
	}
	//정보변경
	
	//회원전체목록(관리자)
	
	
	//특정회원검색(관리자) : 전화번호, 아이디
	
	//회원삭제(탈퇴)
	
	
	
	
}
