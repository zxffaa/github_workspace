<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.*" %>
<% 
	String city="";
	int row=0;
	String sql="INSERT INTO TBL_MEMBER(custno,custname,phone,gender,joindate,grade,city) VALUES (?,?,?,?,?,?,?)";
	int custno=Integer.parseInt(request.getParameter("custno"));
	String custname=request.getParameter("custname");
	String phone=request.getParameter("tel1")+"-"+request.getParameter("tel2")+"-"+request.getParameter("tel3");
	String gender=request.getParameter("gender");
	String joindate=request.getParameter("joindate");
	String grade=request.getParameter("grade");
	String doci=request.getParameter("city");

	Connection conn=null;
	PreparedStatement pstmt=null;
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
	}catch(Exception E){
		E.printStackTrace();
	}
	pstmt=conn.prepareStatement(sql);
	pstmt.setInt(1,custno);
	pstmt.setString(2, custname);
	pstmt.setString(3, phone);
	pstmt.setString(4, gender);
	pstmt.setString(5, joindate);
	pstmt.setString(6, grade);
	pstmt.setString(7, doci);
	row = pstmt.executeUpdate();
%>
