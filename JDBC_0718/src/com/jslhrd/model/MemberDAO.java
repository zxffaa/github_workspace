package com.jslhrd.model;

import java.sql.*;
import java.util.*;

public class MemberDAO {
	private static Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
		return conn;
	}

	public List<MemberDTO> AllMemberDTO() {
		Connection conn = null;
		PreparedStatement pstmt;
		ResultSet rs = null;
		String sql = "select custno,custname,phone,gender,joindate,grade,city from tbl_member_001";
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MemberDTO Member = new MemberDTO();
				Member.setCustno(rs.getInt("custno"));
				Member.setCustname(rs.getString("custname"));
				Member.setPhone(rs.getString("phone"));
				Member.setGender(rs.getString("gender"));
				Member.setJoindate(rs.getString("joindate"));
				Member.setGrade(rs.getString("grade"));
				Member.setCity(rs.getString("city"));
				list.add(Member);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
