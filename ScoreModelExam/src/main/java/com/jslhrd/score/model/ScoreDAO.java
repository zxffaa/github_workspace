package com.jslhrd.score.model;

import java.util.*;

import com.jslhrd.score.util.DBManager;

import java.sql.*;

public class ScoreDAO {
	// 초기화
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 싱글톤패턴 선언
	private ScoreDAO() {
	}

	private static ScoreDAO instance = new ScoreDAO();

	public static ScoreDAO getInstance() {
		return instance;
	}


	public int StudentCount(StudentDTO dto) {
		String sql = "INSERT INTO \"TRACK2_17\".\"TBL_STUDENT__001\" (HAKBUN, NAME, PHONE1, PHONE2, PHONE3, BIRTH, GENDER, REGDATE) VALUES (?,?,?,?,?,?,?,?)";
		int row = 0;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getHakbun());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getPhone1());
			pstmt.setString(4, dto.getPhone2());
			pstmt.setString(5, dto.getPhone3());
			pstmt.setString(6, dto.getBirth());
			pstmt.setString(7, dto.getGender());
			pstmt.setString(8, dto.getRegdate());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return row;
	}
	public List<StudentDTO>studentall(){
		String sql="select * from TBL_STUDENT__001 ORDER BY hakbun asc";
		List<StudentDTO>list=new ArrayList<StudentDTO>();
		try {
			conn =DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				StudentDTO all=new StudentDTO();
				all.setHakbun(rs.getString("hakbun"));
				all.setName(rs.getString("name"));
				all.setPhone1(rs.getString("phone1"));
				all.setPhone2(rs.getString("phone2"));
				all.setPhone3(rs.getString("phone3"));
				all.setBirth(rs.getString("birth"));
				all.setGender(rs.getString("gender"));
				all.setRegdate(rs.getString("regdate"));
				list.add(all);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
}
