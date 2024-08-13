<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*, java.sql.*" %>
<%
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
	}catch(Exception e){
		e.printStackTrace();
	}
	
	int empcnt=0;
	String sql="select count(*) as counter from emp";
	pstmt=conn.prepareStatement(sql);
	rs=pstmt.executeQuery();
	
	if(rs.next()){
		empcnt=rs.getInt("counter");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>EMP Table 사원수</h1>

사원수:<%=empcnt%>
<br>
<a href="index.jsp">홈으로</a>
</div>

</body>
</html>