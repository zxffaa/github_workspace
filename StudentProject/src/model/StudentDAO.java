package model;

import java.sql.*;
import java.util.*;

public class StudentDAO {
	private static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public List<StudentDTO> ShowStudent(){
		List<StudentDTO> list=new ArrayList<StudentDTO>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from tbl_student_201905";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				StudentDTO all=new StudentDTO();
				all.setSyear(rs.getString("syear"));
				all.setSclass(rs.getString("sclass"));
				all.setSno(rs.getString("sno"));
				all.setSname(rs.getString("sname"));
				all.setBirth(rs.getString("birth"));
				all.setGender(rs.getString("gender"));
				all.setTel1(rs.getString("tel1"));
				all.setTel2(rs.getString("tel2"));
				all.setTel3(rs.getString("tel3"));
				list.add(all);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int Student_Insert(StudentDTO In) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int row=1;
		String sql="Insert into tbl_student_201905(syear,sclass,sno,sname,birth,gender,tel1,tel2,tel3) \r\n"
				+ "values (?,?,?,?,?,?,?,?,?)";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, In.getSyear());
			pstmt.setString(2, In.getSclass());
			pstmt.setString(3, In.getSno());
			pstmt.setString(4, In.getSname());
			pstmt.setString(5, In.getBirth());
			pstmt.setString(6, In.getGender());
			pstmt.setString(7, In.getTel1());
			pstmt.setString(8, In.getTel2());
			pstmt.setString(9, In.getTel3());
			row=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}
	public int Score_Insert(StudentDTO In) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		StudentDTO list=new StudentDTO();
		int row=1;
		String sql="Insert into tel_score_201905(syear,sclass,sno,kor,eng,mat) \r\n"
				+ "values (?,?,?,?,?,?)";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, In.getSyear());
			pstmt.setString(2, In.getSclass());
			pstmt.setString(3, In.getSno());
			pstmt.setInt(4, In.getKor());
			pstmt.setInt(5, In.getEng());
			pstmt.setInt(6, In.getMat());
			row=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}
	public List<StudentDTO> ShowScore(){
		List<StudentDTO> list=new ArrayList<StudentDTO>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int add=0;
		double avg=0;
		String sql="select * from tel_score_201905 ORDER BY sclass asc";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				StudentDTO all=new StudentDTO();
				all.setSyear(rs.getString("syear"));
				all.setSclass(rs.getString("sclass"));
				all.setSno(rs.getString("sno"));
				all.setKor(rs.getInt("kor"));
				all.setEng(rs.getInt("eng"));
				all.setMat(rs.getInt("mat"));
				add=rs.getInt("kor")+rs.getInt("eng")+rs.getInt("mat");
				avg=Math.round(add/3.0);
				all.setAdd(add);
				all.setAvg(avg);
				list.add(all);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public int delete(StudentDTO In) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int row=0;
		String sql1="DELETE FROM tel_score_201905 WHERE syear=? and sclass=? and sno=?";
		String sql2="DELETE FROM tbl_student_201905 WHERE syear=? and sclass=? and sno=?";
	
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql1);
			pstmt.setString(1, In.getSyear());
			pstmt.setString(2, In.getSclass());
			pstmt.setString(3, In.getSno());
			row+=pstmt.executeUpdate();
			pstmt=conn.prepareStatement(sql2);
			pstmt.setString(1, In.getSyear());
			pstmt.setString(2, In.getSclass());
			pstmt.setString(3, In.getSno());
			row+=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}
}
