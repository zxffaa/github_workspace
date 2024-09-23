package com.jslhrd.exservletjstl.model.pds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.exservletjstl.util.DBManager;

	

public class PdsDAO {
	// 싱글톤
	private PdsDAO() {
	}

	private static PdsDAO instance = new PdsDAO();

	public static PdsDAO getInstance() {
		return instance;
	}

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 전체 게시글 수 카운트(검색 X)
	public int pdsCount() {
		int cnt = 0;
		String sql = "select count(*) from tbl_pds";
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

	// 전체 게시글 수 카운트(검색 X)
	public int pdsCount(String search, String key) {
		int cnt = 0;
		String sql = "select count(*) from tbl_pds where " + search + " like ?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
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

	// 게시글 전체 목록(검색 X)
	public List<PdsDTO> pdsList() {
		List<PdsDTO> list = new ArrayList<PdsDTO>();
		String sql = "select * from tbl_pds order by idx desc";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				PdsDTO dto = new PdsDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setSubject(rs.getString("subject"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setReadcnt(rs.getInt("readcnt"));
				dto.setFilename(rs.getString("filename"));

				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}

	// 게시글 전체 목록(검색 O)
	public List<PdsDTO> pdsList(String search, String key) {
		List<PdsDTO> list = new ArrayList<PdsDTO>();
		String sql = "select * from tbl_pds where " + search + " like ? order by idx desc";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + key + "%");

			rs = pstmt.executeQuery();
			while (rs.next()) {
				PdsDTO dto = new PdsDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setSubject(rs.getString("subject"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setReadcnt(rs.getInt("readcnt"));
				dto.setFilename(rs.getString("filename"));

				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}

	// 게시글 전체 목록(검색 X, 페이지 처리 추가)
	public List<PdsDTO> pdsList(int startpage, int endpage) {
		List<PdsDTO> list = new ArrayList<PdsDTO>();
		String sql = "select X.* from (select rownum as rnum, A.* from ("
				+ "select * from tbl_pds order by idx desc) A " + "where rownum <= ?) X where X.rnum >= ? ";

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, endpage);
			pstmt.setInt(2, startpage);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				PdsDTO dto = new PdsDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setSubject(rs.getString("subject"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setReadcnt(rs.getInt("readcnt"));
				dto.setFilename(rs.getString("filename"));

				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	
	// 게시글 전체 목록(검색 추가, 페이지 처리 추가)
		public List<PdsDTO> pdsList(String search,String key,int startpage, int endpage) {
			List<PdsDTO> list = new ArrayList<PdsDTO>();
			String sql = "select X.* from (select rownum as rnum, A.* from ("
					+ "select * from tbl_pds order by idx desc) A " + "where " + search + " like ? and rownum <= ?) X where " + search + " like ? and X.rnum >= ? ";

			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);

				pstmt.setString(1, "%" + key +"%");
				pstmt.setInt(2, endpage);
				pstmt.setString(3, "%" + key +"%");
				pstmt.setInt(4, startpage);

				rs = pstmt.executeQuery();
				while (rs.next()) {
					PdsDTO dto = new PdsDTO();
					dto.setIdx(rs.getInt("idx"));
					dto.setName(rs.getString("name"));
					dto.setSubject(rs.getString("subject"));
					dto.setRegdate(rs.getString("regdate"));
					dto.setReadcnt(rs.getInt("readcnt"));
					dto.setFilename(rs.getString("filename"));

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
	public int pdsWrite(PdsDTO dto) {
		int row = 0;// 반환타입
		String sql = "insert into tbl_pds(idx, name, email, subject, contents, filename, pass) \r\n"
				+ "        values(tbl_pds_seq_idx.nextval, ?, ?, ?, ?, ?, ?)";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getSubject());
			pstmt.setString(4, dto.getContents());
			pstmt.setString(5, dto.getFilename());
			pstmt.setString(6, dto.getPass());

			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}

	// 조회수 증가 메소드
	public void pdsHits(int idx) {

		String sql = "update tbl_pds set readcnt=readcnt+1 where idx=?";
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
	public PdsDTO pdsSelect(int idx) {
		PdsDTO dto = new PdsDTO();

		String sql = "select * from tbl_pds where idx=?";
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
				dto.setFilename(rs.getString("filename"));
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
	public int pdsModify(PdsDTO dto) {
		int row = 0;

		String sql = "update tbl_pds set email=?, subject=?, contents=?, filename=? " + "	where idx=? and pass=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getEmail());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3, dto.getContents());
			pstmt.setString(4, dto.getFilename());
			pstmt.setInt(5, dto.getIdx());
			pstmt.setString(6, dto.getPass());

			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}

	// 삭제전 첨부파일 검색 메소드
	public String pdsFileSearch(int idx) {
		// 리터타입
		String filename = null;
		// 쿼리
		String query = "select filename from tbl_pds where idx=?";

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				filename = rs.getNString("filename");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
			// DBManager.close(conn, pstmt, rs);
		}
		return filename;
	}

	// 삭제
	public int pdsDelete(int idx, String pass) {
		int row = 0;

		String sql = "delete from tbl_pds where idx=? and pass=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.setString(2, pass);

			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}

}
