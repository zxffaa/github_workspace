package model;

import java.sql.*;
import java.util.*;



public class MemberDAO {
	private static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
			;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public int MemberCon(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int row=0;
		String sql="select count(custno)as counter from tbl_member";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				row=rs.getInt("counter");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
	}
	public List<MemberDTO> MemberAll(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<MemberDTO>list=new ArrayList<MemberDTO>();
		String sql="select custno,custname,phone,gender,joindate,grade,city from tbl_member";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				MemberDTO ALL=new MemberDTO();
				ALL.setCUSTNO(rs.getInt("custno"));
				ALL.setCUSTNAME(rs.getString("custname"));
				ALL.setPHONE(rs.getString("phone"));
				ALL.setGENDER(rs.getString("gender"));
				ALL.setJOINDATE(rs.getString("joindate"));
				ALL.setGRADE(rs.getString("grade"));
				ALL.setCITY(rs.getString("city"));
				list.add(ALL);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public MemberDTO CustomerSerch(int CustomerNumber) {
		MemberDTO Customer = new MemberDTO();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from tbl_member where custno=?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, CustomerNumber);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				Customer.setCUSTNO(rs.getInt("custno"));
				Customer.setCUSTNAME(rs.getString("custname"));
				Customer.setPHONE(rs.getString("phone"));
				Customer.setGENDER(rs.getString("gender"));
				Customer.setJOINDATE(rs.getString("joindate"));
				Customer.setGRADE(rs.getString("grade"));
				Customer.setCITY(rs.getString("city"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Customer;
	}
	
	public int CustomerInsert(MemberDTO IN) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row=0;
		String sql = "insert into TBL_MEMBER(custno,custname,phone,gender,joindate,grade,city)VALUES(?,?,?,?,?,?,?)";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, IN.getCUSTNO());
			pstmt.setString(2, IN.getCUSTNAME());
			pstmt.setString(3, IN.getPHONE());
			pstmt.setString(4, IN.getGENDER());
			pstmt.setString(5,IN.getJOINDATE());
			pstmt.setString(6,IN.getGRADE());
			pstmt.setString(7, IN.getCITY());
			row=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}
	public int custnoMax() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//반환타입
		int row = 0;
		//쿼리문장
		String sql="select max(custno)+1 as custno from tbl_member";
		
		try{
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				row = rs.getInt("custno");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return row;
	}

}
