package model;

import java.sql.*;

public class ExamDAO {
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

	// 테이블 생성 메소드
	public int createTable() {
		Connection conn = null;
		PreparedStatement pstmt = null;

		int row = 0;// 성공하면 1, 실패하면 0 반환
		String sql = " HAKBUN CHAR(4),\r\n"
				+ "    NAME VARCHAR2(20) NOT NULL, \r\n"
				+ "    GENDER CHAR(1), \r\n"
				+ "    SCORE NUMBER(3), \r\n"
				+ "    regdate date default sysdate, \r\n"
				+ "    PRIMARY KEY (HAKBUN)";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.executeUpdate();
			row = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}
	//tbl_City insert insert,update,delet는 무조건 int or boolean
	public int cityWrite(CityDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row=0;
		String sql="insert into tbl_city(city,cityname) values(?,?)";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getCity());
			pstmt.setString(2, dto.getCityname());
			row=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}
	
}