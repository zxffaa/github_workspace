package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ArtistDAO {
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

	public int Artist_insert(ArtistDTO IN) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String sql = "insert into TBL_ARTIST_201905 VALUES(?,?,?,?,?,?)";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, IN.getARTIST_ID());
			pstmt.setString(2, IN.getARTIST_NAME());
			pstmt.setString(3, IN.getARTIST_GENDER());
			pstmt.setString(4, IN.getARTIST_BIRTH());
			pstmt.setString(5, IN.getTALENT());
			pstmt.setString(6, IN.getAGENCY());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}

	public List<ArtistDTO> ArtistShow() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ArtistDTO> list = new ArrayList<ArtistDTO>();
		String sql = "select * from tbl_artist_201905 ORDER BY artist_id asc";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ArtistDTO Show = new ArtistDTO();
				Show.setARTIST_ID(rs.getString("ARTIST_ID"));
				Show.setARTIST_NAME(rs.getString("ARTIST_NAME"));
				Show.setARTIST_BIRTH(rs.getString("ARTIST_BIRTH"));
				Show.setARTIST_GENDER(rs.getString("ARTIST_GENDER"));
				Show.setTALENT(rs.getString("TALENT"));
				Show.setAGENCY(rs.getString("AGENCY"));
				list.add(Show);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public int ScoreInput(ArtistDTO IN) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO tbl_point_201905 VALUES (?,?,?,?)";
		int row = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, IN.getSERIAL_NO());
			pstmt.setInt(2, IN.getPOINT());
			pstmt.setString(3, IN.getARTIST_ID());
			pstmt.setString(4, IN.getMENTO_ID());

			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}

	public List<ArtistDTO> ScoreOutput() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ArtistDTO> list = new ArrayList<ArtistDTO>();
		String sql = "select * from tbl_point_201905 ORDER BY artist_id asc";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ArtistDTO Show = new ArtistDTO();
				Show.setSERIAL_NO(rs.getInt("SERIAL_NO"));
				Show.setARTIST_ID(rs.getString("ARTIST_ID"));
				Show.setPOINT(rs.getInt("POINT"));
				Show.setMENTO_ID(rs.getString("MENTO_ID"));
				list.add(Show);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<ArtistDTO> ScoreList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ArtistDTO> list = new ArrayList<ArtistDTO>();
		String sql = "select serial_no, a.artist_id, a.artist_name, artist_birth, point, mento_name from tbl_artist_201905 a, tbl_point_201905 b, tbl_mento_201905 c where a.artist_id = b.artist_id and b.mento_id = c.mento_id order by serial_no";
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				ArtistDTO Score =new ArtistDTO();
				Score.setSERIAL_NO(rs.getInt("SERIAL_NO"));
				Score.setARTIST_ID(rs.getString("ARTIST_ID"));
				Score.setARTIST_NAME(rs.getString("ARTIST_NAME"));
				Score.setARTIST_BIRTH(rs.getString("ARTIST_BIRTH"));
				Score.setPOINT(rs.getInt("point"));
				Score.setMEMTO_NAME(rs.getString("mento_name"));
				list.add(Score);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
