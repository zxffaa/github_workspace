<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.shop.util.*, java.sql.*" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Connection conn = DBManager.getConnection();
		out.print("Connection : " + conn);
	%>
</body>
</html>