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
	public StudentDTO getMember(String hakbun){
		
		StudentDTO dto = new StudentDTO();
		String sql="select * from TBL_STUDENT__001 where hakbun=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,hakbun);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setHakbun(rs.getString("hakbun"));
				dto.setName(rs.getString("name"));
				dto.setPhone1(rs.getString("phone1"));
				dto.setPhone2(rs.getString("phone2"));
				dto.setPhone3(rs.getString("phone3"));
				dto.setBirth(rs.getString("birth"));
				dto.setGender(rs.getString("gender"));
				dto.setRegdate(rs.getString("regdate"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return dto;
	}
	public int studentUpdate(StudentDTO dto) {
		String sql = "UPDATE tbl_student__001 SET phone1 =?,phone2 = ?,phone3 = ?,birth=?,gender=?,regdate=? where hakbun=?";
		int row = 0;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getPhone1());
			pstmt.setString(2, dto.getPhone2());
			pstmt.setString(3, dto.getPhone3());
			pstmt.setString(4, dto.getBirth());
			pstmt.setString(5, dto.getGender());
			pstmt.setString(6, dto.getRegdate());
			pstmt.setString(7, dto.getHakbun());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	
	public int scoreInsert(ScoreDTO dto) {
		String sql = "INSERT INTO tbl_score_001(hakbun,kor,eng,mat) VALUES (?,?,?,?)";
		int row = 0;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getHakbun());
			pstmt.setInt(2, dto.getKor());
			pstmt.setInt(3, dto.getEng());
			pstmt.setInt(4, dto.getMat());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	public List<ScoreDTO>scoreList(){
		String sql="SELECT a.hakbun,a.name ,a.gender, b.kor, b.eng, b.mat, (b.kor + b.eng + b.mat) AS sum, ROUND((b.kor+b.eng+b.mat)/3,1) as avg\r\n"
				+ "FROM tbl_student__001 a\r\n"
				+ "JOIN tbl_score_001 b ON a.hakbun = b.hakbun\r\n"
				+ "GROUP BY a.hakbun,a.name,a.gender, b.kor, b.eng, b.mat\r\n"
				+ "ORDER BY avg";
		List<ScoreDTO>list=new ArrayList<ScoreDTO>();
		try {
			conn =DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ScoreDTO all=new ScoreDTO();
				all.setHakbun(rs.getString("hakbun"));
				all.setName(rs.getString("name"));
				all.setGender(rs.getString("gender"));
				all.setKor(rs.getInt("kor"));
				all.setEng(rs.getInt("eng"));
				all.setMat(rs.getInt("mat"));
				all.setSum(rs.getInt("sum"));
				all.setAvg(rs.getInt("avg"));
				list.add(all);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	public List<ScoreDTO>scoreClassList(){
		String sql="SELECT \r\n"
				+ "    SUBSTR(hakbun, 1, 1) AS clases, \r\n"
				+ "    SUM(kor) AS kortot, \r\n"
				+ "    SUM(eng) AS engtot, \r\n"
				+ "    SUM(mat) AS mattot,\r\n"
				+ "    ROUND(AVG(kor), 1) AS koravg, \r\n"
				+ "    ROUND(AVG(eng), 1) AS engavg, \r\n"
				+ "    ROUND(AVG(mat), 1) AS matavg\r\n"
				+ "FROM \r\n"
				+ "    tbl_score_001 \r\n"
				+ "GROUP BY \r\n"
				+ "    SUBSTR(hakbun, 1, 1)"
				+ "ORDER BY SUBSTR(hakbun, 1, 1) asc";
		List<ScoreDTO>list=new ArrayList<ScoreDTO>();
		try {
			conn =DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ScoreDTO all=new ScoreDTO();
				all.setClases(rs.getString("clases"));
				all.setKortot(rs.getInt("kortot"));
				all.setEngtot(rs.getInt("engtot"));
				all.setMattot(rs.getInt("mattot"));
				all.setKoravg(rs.getDouble("koravg"));
				all.setEngavg(rs.getDouble("engavg"));
				all.setMatavg(rs.getDouble("matavg"));
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
