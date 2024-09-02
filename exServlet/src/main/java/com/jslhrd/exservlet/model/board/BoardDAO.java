package com.jslhrd.exservlet.model.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.exservlet.util.DBManager;


public class BoardDAO {
	// 싱글톤
	private BoardDAO() {
	}

	private static BoardDAO instance = new BoardDAO();

	public static BoardDAO getInstance() {
		return instance;
	}

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 메소드 작성
	// 게시글 전체 글수 카운트
	public int boardCount() {
		int cnt = 0;
		String sql = "select count(*) from tbl_board";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				cnt = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return cnt;
	}

	// 게시글 검색
	public int boardCount(String search, String key) {
		int cnt = 0;

		String sql = "select count(*) from tbl_board where " + search + " like ?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			// pstmt.setString(1, key);
			pstmt.setString(1, "%" + key + "%");
			rs = pstmt.executeQuery();
			if (rs.next()) {
				cnt = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return cnt;
	}

	// 게시글 전체 목록
	public List<BoardDTO> boardList() {
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		String sql = "select * from tbl_board order by idx desc";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setSubject(rs.getString("subject"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setReadcnt(rs.getInt("readcnt"));

				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}

	// 검색기능추가
	public List<BoardDTO> boardList(String search, String key) {
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		// String sql="select * from tbl_board order by idx desc";
		String sql = "select * from tbl_board where " + search + " like ?  order by idx desc";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + key + "%");

			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setSubject(rs.getString("subject"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setReadcnt(rs.getInt("readcnt"));

				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}

	// 게시글 등록
	public int boardWrite(BoardDTO dto) {
		int row = 0;// 반환타입
		String sql = "insert into tbl_board(idx, name, email, subject, contents, pass) \r\n"
				+ "        values(tbl_board_seq_idx.nextval, ?, ?, ?, ?, ?)";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getSubject());
			pstmt.setString(4, dto.getContents());
			pstmt.setString(5, dto.getPass());

			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}

	// 조회수 증가 메소드
	public void boardHits(int idx) {

		String sql = "update tbl_board set readcnt=readcnt+1 where idx=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}

	}

	// 특정글(idx) 검색
	public BoardDTO boardSelect(int idx) {
		BoardDTO dto = new BoardDTO();

		String sql = "select * from tbl_board where idx=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setSubject(rs.getString("subject"));
				dto.setContents(rs.getString("contents"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setReadcnt(rs.getInt("readcnt"));
				// dto.setPass(rs.getString("pass"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return dto;
	}

	// 수정
	public int boardModify(BoardDTO dto) {
		int row = 0;

		String sql = "update tbl_board set email=?, subject=?, contents=? " + "	where idx=? and pass=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getEmail());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3, dto.getContents());
			pstmt.setInt(4, dto.getIdx());
			pstmt.setString(5, dto.getPass());

			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}

	public int boardDelete(BoardDTO dto) {
		int row = 0;
		String sql = "delete from tbl_board where idx=? and pass=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getIdx());
			pstmt.setString(2, dto.getPass());

			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}

}
