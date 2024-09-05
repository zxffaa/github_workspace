package com.jslhrd.exservlet.model.user;

import java.sql.*;


import com.jslhrd.exservlet.util.DBManager;

public class UserDAO {
	//싱글톤 생성
	private UserDAO() {}
	private static UserDAO instance =new UserDAO();
	public static UserDAO getInstance() {
		return instance;
	}
	//Sql 초기화
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	//메소드 정의
	
	//아이디중복체크
	//회원가입
	public int userWrite(UserDTO dto) {
		// 반환타입
		int row = 0;
		
		String sql = "insert into tbl_user(name, userid, passwd, tel,email)\r\n"
				+ "      values(?,?,?,?,?)";

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getUserid());
			pstmt.setString(3, dto.getPasswd());
			pstmt.setString(4, dto.getTel());
			pstmt.setString(5, dto.getEmail());
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	//로그인
	public int userLogin(String userid,String passwd) {
		// 반환타입
		int row = 0;//-1(아이디 없음),0(비번오류),1(성공)
		String sql = "select passwd from tbl_user where userid=? ";

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				String dbpass=rs.getString("passwd");
				if(dbpass.equals(passwd)) {
					//가장 최근 로그인한 날자 업데이트
					sql="update tbl_user set last_time=sysdate where userid=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, userid);
					pstmt.executeUpdate();
					row=1;
				}else {
					row=0;
				}
			}else{//아이디가 없는 경우
				row=-1;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt,rs);
		}
		return row;
	}
	//정보변경
	//회원전체목록확인-관리자
	//특정회원검색-관리자:전화번호,아이디,
	//회원삭제
	
}
