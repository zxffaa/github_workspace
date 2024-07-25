package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LibraryDAO {
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
	public int UserMax() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int row=0;
		String sql="select max(userno)+1 as userno from library";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				row=rs.getInt("userno");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}
	public int UserIN(LibraryDTO IN) {
		int row =0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql="Insert into library (USERNO,NAME,PHONE1,PHONE2,PHONE3,GENDER,birthday,regdate) \r\n"
				+ "values (?,?,?,?,?,?,?,?)";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, IN.getUserno());
			pstmt.setString(2, IN.getName());
			pstmt.setString(3, IN.getPhone1());
			pstmt.setString(4, IN.getPhone2());
			pstmt.setString(5, IN.getPhone3());
			pstmt.setString(6, IN.getGender());
			pstmt.setString(7,IN.getBirthday());
			pstmt.setString(8, IN.getRegdate());
			row=pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return row;
	}
	public List<LibraryDTO> UserShow(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select *from library order by userno asc";
		List<LibraryDTO>list=new ArrayList<LibraryDTO>();
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				LibraryDTO Show =new LibraryDTO();
				Show.setUserno(rs.getInt("userno"));
				Show.setName(rs.getString("name"));
				Show.setPhone1(rs.getString("phone1"));
				Show.setPhone2(rs.getString("phone2"));
				Show.setPhone3(rs.getString("phone3"));
				Show.setGender(rs.getString("gender"));
				Show.setBirthday(rs.getString("birthday"));
				Show.setRegdate(rs.getString("regdate"));
				list.add(Show);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public int UserExist(LibraryDTO in) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select count(*) as serch from Library where userno=?";
		int row=1;
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, in.getUserno());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				sql="select *from library where userno=?";
				pstmt.setInt(1,in.getUserno());
				rs=pstmt.executeQuery();
			}else {
				row=-1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}
	
}
