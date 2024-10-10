package com.jslhrd.exshop.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.exshop.util.DBManager;

public class ShopDAO {
	private ShopDAO() {}
	private static ShopDAO instance =new ShopDAO();
	public static ShopDAO getInstance() {
		return instance;
	}
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	//회원정보 등록 메소드 정의
	public int memberInsert(MemberDTO dto) {
		int row=0;
		String sql="insert into tbl_member(custno, custname, phone, gender, joindate, grade, city ) "
				+ "values(?,?,?,?,?,?,?)";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getCustno());
			pstmt.setString(2, dto.getCustname());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getJoindate());
			pstmt.setString(6, dto.getGrade());
			pstmt.setString(7, dto.getCity());
			
			row=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	//도시 코드 불러오기
	public List<CityDTO> cityList() {
		List<CityDTO> list = new ArrayList();
		String sql="select * from tbl_city";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				CityDTO city = new CityDTO();
				city.setCity(rs.getString("city"));
				city.setCityname(rs.getString("cityname"));
				
				list.add(city);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return list;
	}
	//회원전체목록
	public List<MemberCityDTO> memList(){
		List<MemberCityDTO>list=new ArrayList<MemberCityDTO>();
		String sql="select custno,custname,phone,gender,joindate,grade,cityname from tbl_member m, tbl_city c where m.city=c.city";

		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO mDTO=new MemberDTO();
				CityDTO cDTO=new CityDTO();
				MemberCityDTO mcDTO=new MemberCityDTO();
				mDTO.setCustno(rs.getInt("custno"));
				mDTO.setCustname(rs.getString("custname"));
				mDTO.setPhone(rs.getString("phone"));
				mDTO.setGender(rs.getString("gender"));
				mDTO.setJoindate(rs.getString("joindate"));
				mDTO.setGrade(rs.getString("grade"));
				
				cDTO.setCityname(rs.getString("cityname"));
				
				mcDTO.setMember(mDTO);
				mcDTO.setCity(cDTO);
				list.add(mcDTO);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return list;
	}
}
