package com.jslhrd.pds.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.jslhrd.pds.util.DBManager;

public class PdsDAO {
	private PdsDAO() {
	}

	private static PdsDAO instance = new PdsDAO();

	public static PdsDAO getInstance() {
		return instance;
	}

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public int PdsCount() {
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
	
	public List<PdsDTO> PdsList() {
		List<PdsDTO> list = new ArrayList<PdsDTO>();
		String sql="select * from tbl_pds order by idx desc";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				PdsDTO pds=new PdsDTO();
				pds.setIdx(rs.getInt("idx"));
				pds.setName(rs.getString("name"));
				pds.setPass(rs.getString("pass"));
				pds.setEmail(rs.getString("email"));
				pds.setSubject(rs.getString("subject"));
				pds.setContents(rs.getString("contents"));
				pds.setRegdate(rs.getString("regdate"));
				pds.setReadcnt(rs.getInt("readcnt"));
				pds.setFilename(rs.getString("filename"));
				list.add(pds);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	
	public int pdsWrite(PdsDTO dto) {

		int row = 0;//반환타입
		String sql="insert into tbl_pds(idx,name,pass,email,subject,contents,filename) VALUES (TBL_PDS_SEQ_IDX.nextval,?,?,?,?,?,?)";
				
		try {
			conn=DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPass());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getSubject());
			pstmt.setString(5, dto.getContents());
			pstmt.setString(6, dto.getFilename());
			row = pstmt.executeUpdate();
		}catch (Exception e) {
				e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}	
		return row;
	}	
	
	public PdsDTO PdsSelect(int idx) {
		PdsDTO dto = new PdsDTO();
		
		String sql="select * from tbl_pds where idx=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setPass(rs.getString("pass"));
				dto.setEmail(rs.getString("email"));
				dto.setSubject(rs.getString("subject"));
				dto.setContents(rs.getString("contents"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setReadcnt(rs.getInt("readcnt"));
				dto.setFilename(rs.getString("filename"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return dto;
	}
	
	
}
