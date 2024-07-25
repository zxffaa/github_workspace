package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MoneyDAO {
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
	public int CustomerExist(MoneyDTO IN) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int row=0;
		ResultSet rs=null;
		String sql="select count(*) as counter from tbl_member where custno=?";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,IN.getCustno());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				sql="insert into TBL_MONEY_001(custno,saleno,pcost,amount,price,pcode,sdate)VALUES(?,?,?,?,?,?,to_char(sysdate,'yyyy/mm/dd'))";
				pstmt.setInt(1, IN.getCustno());
				pstmt.setInt(2, IN.getSaleno());
				pstmt.setInt(3, IN.getPcost());
				pstmt.setInt(4, IN.getAmount());
				pstmt.setInt(5, IN.getPrice());
				pstmt.setString(6, IN.getPcode());
				row=pstmt.executeUpdate();
			}else {
				row=-1;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return row;	
	}
	
	public List<MoneyDTO> MoneyShow(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs;
		String sql="select * from TBL_MONEY_001";
		List<MoneyDTO> list=new ArrayList<MoneyDTO>();
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				MoneyDTO all=new MoneyDTO();
				all.setCustno(rs.getInt("custno"));
				all.setSaleno(rs.getInt("saleno"));
				all.setPcost(rs.getInt("pcost"));
				all.setAmount(rs.getInt("amount"));
				all.setPrice(rs.getInt("price"));
				all.setPcode(rs.getString("pcode"));
				all.setSdate(rs.getString("sdate"));
				list.add(all);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return list;
	}
	public List<MoneyDTO> ShowCity(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs;
		String sql="select custno,custname,phone,gender,joindate,grade,cityname from tbl_member  t1,tbl_city  t2 where t1.city=t2.city";
		List<MoneyDTO> list=new ArrayList<MoneyDTO>();
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				MoneyDTO City=new MoneyDTO();
				City.setCustno(rs.getInt("custno"));
				City.setCUSTNAME(rs.getString("custname"));
				City.setPHONE(rs.getString("phone"));
				City.setGENDER(rs.getString("gender"));
				City.setJOINDATE(rs.getString("joindate"));
				City.setGRADE(rs.getString("grade"));
				City.setCity(rs.getString("cityname"));
				list.add(City);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return list;
	}
	public List<MoneyDTO> Totshow(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs;
		String sql="SELECT t1.custno, t1.custname, t1.phone, t1.grade, SUM(t2.price) AS total FROM tbl_member t1 JOIN tbl_money_001 t2 ON t1.custno = t2.custno GROUP BY t1.custno, t1.custname, t1.phone, t1.grade ORDER BY SUM(t2.price) DESC";
		List<MoneyDTO> list=new ArrayList<MoneyDTO>();
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				MoneyDTO Tot=new MoneyDTO();
				Tot.setCustno(rs.getInt("custno"));
				Tot.setCUSTNAME(rs.getString("custname"));
				Tot.setPHONE(rs.getString("phone"));
				Tot.setGRADE(rs.getString("grade"));
				Tot.setTotal(rs.getInt("total"));
				list.add(Tot);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return list;
	}
}
