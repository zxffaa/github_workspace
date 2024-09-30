package com.jslhrd.exmvc.model.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.exmvc.util.DBManager;



public class GuestDAO {
	//싱글톤 패턴
	private GuestDAO() {}  //기본생성자
	private static GuestDAO instance = new GuestDAO();//자신의 객체 생성

	//private static GuestDAO dao = new GuestDAO();//자신의 객체 생성
	//메소드 정의
	public static GuestDAO getInstance() {
		return instance;
		//return dao;
	}

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

/*	
	public 반환타입 메소드이름(매개변수) {
		//반환타입
		int row = 0;
		String sql="";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);

		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return row;
	}
*/
	//방명록에 저장된 총 글수 카운트(검색조건 없음)
	public int guestCount() {
		//반환타입
		int row = 0;
		String sql="select count(*) as counter from tbl_guest";
		//String sql="select count(*) from tbl_guest";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				row = rs.getInt("counter");
				//row = rs.getInt(1);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return row;
	}

	//방명록에 저장된 총 글수 카운트(검색추가)
	public int guestCount(String search, String key) {
		//반환타입
		int row = 0;
		String sql2="select count(*) as counter from tbl_guest where " + search + 
				" like '%" + key + "%'";

		String sql="select count(*) as counter from tbl_guest where " + search + 
				" like ?";
		
		
		try {
			conn = DBManager.getConnection();
			//pstmt = conn.prepareStatement(sql2);
			//rs = pstmt.executeQuery();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + key + "%");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				row = rs.getInt("counter");
				//row = rs.getInt(1);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return row;
	}
	
	// 전체 게시글 목록 구하기
	public List<GuestDTO> guestList() {
		//반환타입
		List<GuestDTO> list = new ArrayList();
		
		String sql="select * from tbl_guest order by idx desc";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				GuestDTO guest = new GuestDTO();
				guest.setIdx(rs.getInt("idx"));
				guest.setName(rs.getString("name"));
				guest.setSubject(rs.getString("subject"));
				guest.setRegdate(rs.getString("regdate"));
				guest.setReadcnt(rs.getInt("readcnt"));
				
				list.add(guest);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}

	// 전체 게시글 목록 구하기(검색추가)
	public List<GuestDTO> guestList(String search, String key) {
		//반환타입
		List<GuestDTO> list = new ArrayList();
		
		String sql="select * from tbl_guest where " + search + 
				" like ? order by idx desc";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + key + "%");
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				GuestDTO guest = new GuestDTO();
				guest.setIdx(rs.getInt("idx"));
				guest.setName(rs.getString("name"));
				guest.setSubject(rs.getString("subject"));
				guest.setRegdate(rs.getString("regdate"));
				guest.setReadcnt(rs.getInt("readcnt"));
				
				list.add(guest);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}

	//등록 메소드
	public int guestWrite(GuestDTO dto) {
		//반환타입
		int row = 0;
		String sql="insert into tbl_guest(idx, name, subject, contents, pass)\r\n"
				+ "      values(TBL_GUEST_SEQ_IDX.nextval, ?,?,?,?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3, dto.getContents());
			pstmt.setString(4, dto.getPass());
			
			row = pstmt.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	
	//idx에 해당하는 글 조회수 증가
	public void guestHits(int idx) {
		
		String sql="update tbl_guest set readcnt=readcnt+1 where idx=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	//idx에 해당하는 글 검색
	public GuestDTO guestSelect(int idx) {
		//반환타입
		GuestDTO dto = new GuestDTO();
		
		String sql="select * from tbl_guest where idx = ?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setSubject(rs.getString("subject"));
				dto.setContents(rs.getString("contents"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setReadcnt(rs.getInt("readcnt"));
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return dto;
	}

	//idx에 해당하는 글 삭제
	public int guestDelete(int idx, String pass) {
		int row=0;
		
		String sql="delete from tbl_guest where idx=? and pass=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.setString(2, pass);
			
			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}

	//idx에 해당하는 글 수정
	public int guestModify(GuestDTO dto) {
		int row=0;
		String sql="update tbl_guest set subject=?, contents=? "
					+ "	where idx=? and pass=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getSubject());
			pstmt.setString(2, dto.getContents());
			pstmt.setInt(3, dto.getIdx());
			pstmt.setString(4, dto.getPass());
			
			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	public List<GuestDTO> guestList(int startpage,int endpage) {
		//반환타입
		List<GuestDTO> list = new ArrayList();
		
		String sql="select X.* from (select rownum as rnum, A.* from ("
				+ "select * from tbl_guest order by idx desc) A " + "where rownum <= ?) X where X.rnum >= ? ";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, endpage);
			pstmt.setInt(2, startpage);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				GuestDTO guest = new GuestDTO();
				guest.setIdx(rs.getInt("idx"));
				guest.setName(rs.getString("name"));
				guest.setSubject(rs.getString("subject"));
				guest.setRegdate(rs.getString("regdate"));
				guest.setReadcnt(rs.getInt("readcnt"));
				
				list.add(guest);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	public List<GuestDTO> guestList(String search,String key, int startpage,int endpage) {
		//반환타입
		List<GuestDTO> list = new ArrayList<GuestDTO>();
		
		String sql="select X.* from (select rownum as rnum, A.* from ("
				+ "select * from tbl_guest order by idx desc) A " + "where " + search + " like ? and rownum <= ?) X where " + search + " like ? and X.rnum >= ? ";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+ key + "%");
			pstmt.setInt(2, endpage);
			pstmt.setString(3, "%"+ key + "%");
			pstmt.setInt(4, startpage);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				GuestDTO guest = new GuestDTO();
				guest.setIdx(rs.getInt("idx"));
				guest.setName(rs.getString("name"));
				guest.setSubject(rs.getString("subject"));
				guest.setRegdate(rs.getString("regdate"));
				guest.setReadcnt(rs.getInt("readcnt"));
				list.add(guest);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
}
