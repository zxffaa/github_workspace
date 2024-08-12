<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- %@는 페이지 지시자 -->

<%@page import="java.sql.*,java.util.*" %>
<!--스크립트-->
<% 
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
	}catch(Exception e){
		e.printStackTrace();
	}
	int row=0;
	String sql="select count(*) as counter from emp";
	pstmt=conn.prepareStatement(sql);
	rs=pstmt.executeQuery();
	if(rs.next()){
		row=rs.getInt("counter");
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
	<h1>DB연결 테스트</h1>
	<h3>커넥션:<%=conn%></h3>
	<h3>수:<%=row%></h3>
	<h3>
	<a href="index.jsp">홈으로</a>
	</h3>
</div>
</body>
</html>