package com.jslhrd.guest.model;

import java.sql.*;
import java.util.*;


import com.jslhrd.util.DBManager;

public class GuestDAO {
	private GuestDAO() {
	}

	private static GuestDAO instance = new GuestDAO();

	public static GuestDAO getInstance() {
		return instance;
	}

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public int GuestCount() {
		int cnt = 0;
		String sql = "select count(*) from tbl_guest";
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

	public int GuestCount(String search,String key) {
		int cnt = 0;
		String sql = "select count(*) from tbl_guest where "+search+" like ? ";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+key+"%");
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
	
	public List<GuestDTO> GuestList() {
		List<GuestDTO> list = new ArrayList<GuestDTO>();
		String sql="select * from tbl_guest order by idx desc";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				GuestDTO guest=new GuestDTO();
				guest.setIdx(rs.getInt("idx"));
				guest.setName(rs.getString("name"));
				guest.setSubject(rs.getString("subject"));
				guest.setContents(rs.getString("contents"));
				guest.setRegdate(rs.getString("regdate"));
				guest.setReadcnt(rs.getInt("readcnt"));
				list.add(guest);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	
	public List<GuestDTO> GuestList(String search,String key) {
		List<GuestDTO> list = new ArrayList<GuestDTO>();
		String sql="select * from tbl_guest where "+search+" like ? order by idx desc";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+key+"%");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				GuestDTO guest=new GuestDTO();
				guest.setIdx(rs.getInt("idx"));
				guest.setName(rs.getString("name"));
				guest.setSubject(rs.getString("subject"));
				guest.setContents(rs.getString("contents"));
				guest.setRegdate(rs.getString("regdate"));
				guest.setReadcnt(rs.getInt("readcnt"));
				list.add(guest);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	
	public int GuestWrite(GuestDTO dto) {

		int row = 0;//반환타입
		String sql="insert into tbl_guest(idx, name,subject, contents) values(tbl_guest_seq_idx.nextval,?,?,?)";
		try {
			conn=DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3, dto.getContents());
			row = pstmt.executeUpdate();
		}catch (Exception e) {
				e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}	
		return row;
	}
	
	public void GuestHits(int idx) {
		
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
	
	public GuestDTO GuestSelect(int idx) {
		GuestDTO dto = new GuestDTO();
		
		String sql="select * from tbl_guest where idx=?";
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
	
	public int GuestModify(GuestDTO dto) {
		int row=0;
		String sql="update tbl_guest set subject=?, contents=? where idx=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getSubject());
			pstmt.setString(2, dto.getContents());
			pstmt.setInt(3, dto.getIdx());
			row = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	
}
