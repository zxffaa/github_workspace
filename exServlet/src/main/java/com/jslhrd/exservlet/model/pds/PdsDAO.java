package com.jslhrd.exservlet.model.pds;

import java.sql.*;
import java.util.*;

import com.jslhrd.exservlet.util.DBManager;


public class PdsDAO {
	private PdsDAO() {}
	private static PdsDAO instance = new PdsDAO();
	public static PdsDAO getinstance() {
		return instance;
	}
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	//1.자료실 전체 글수 카운트(검색없음)
	public int pdsCount() {
		int row=0;
		String sql="select count(*) as counter from tbl_pds";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				row=rs.getInt("counter");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return row;
	}
	//2.자료실 전체 글수 카운트(검색추가)
	public int pdsCount(String search, String key) {
		int row=0;
		String sql="select count(*) as counter from tbl_pds where " +search+" like ?";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+key+"%");
			rs=pstmt.executeQuery();
			if(rs.next()) {
				row=rs.getInt("counter");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return row;
	}
	//3.자료실 전체 글 목록(LIST)(검색없음)
	public List<PdsDTO> pdsList(){
		List<PdsDTO>list=new ArrayList<PdsDTO>();
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
	//4.자료실 전체 글 목록(LIST)(검색추가)
	public List<PdsDTO> pdsList(String search,String key){
		List<PdsDTO>list=new ArrayList<PdsDTO>();
		String sql="select * from tbl_pds where "+search+" like ? order by idx desc";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				PdsDTO pds=new PdsDTO();
				pds.setIdx(rs.getInt("idx"));
				pds.setName(rs.getString("name"));
				pds.setEmail(rs.getString("email"));
				pds.setSubject(rs.getString("subject"));
				pds.setContents(rs.getString("contents"));
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
	//5.자료실 글등록
	public int pdsWrite(PdsDTO dto) {
	int row=0;
	String sql="insert into tbl_pds(idx,name,pass,email,subject,contents,filename) "
			+ "VALUES (TBL_PDS_SEQ_IDX.nextval,?,?,?,?,?,?)";
	try {
		conn=DBManager.getConnection();
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, dto.getName());
		pstmt.setString(2, dto.getPass());
		pstmt.setString(3, dto.getEmail());
		pstmt.setString(4, dto.getSubject());
		pstmt.setString(5, dto.getContents());
		pstmt.setString(6, dto.getFilename());
		row=pstmt.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		DBManager.close(conn, pstmt);
	}
	
	return row;
	}
	//6.특정글 상세보기(View)
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
				//dto.setPass(rs.getString("pass"));
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
	//7.특정글 상세보기(View) 선택시 조회수 증가
	public void pdsHits(int idx) {
		String sql="update tbl_pds set readcnt=readcnt+1 where idx=?";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
	//8.특정글 수정
	public int pdsModify(PdsDTO dto) {
		int row=0;
		String sql="update tbl_pds set email=?,subject=?, contents=?, filename=? where idx=? and pass=?";
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
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
}
