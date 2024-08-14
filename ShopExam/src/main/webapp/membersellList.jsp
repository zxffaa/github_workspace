<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*" %>
<%
request.setCharacterEncoding("UTF-8");
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs=null;
try {
	Class.forName("oracle.jdbc.OracleDriver");
	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
} catch (Exception e) {
	e.printStackTrace();
}
String sql="SELECT  a.custno,  a.custname, a.phone, a.grade, SUM(b.price) AS sum FROM  tbl_member a JOIN  tbl_money b ON a.custno = b.custno GROUP BY a.custno, a.custname, a.phone, a.grade ORDER BY SUM(b.price) DESC";

pstmt=conn.prepareStatement(sql);
rs=pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>총매출조회</title>
<style>
table {
	border: 2px solid black;
	width: 600px;
}

table th {
	border: 1px solid black;
}

table td {
	text-align:center;
	border: 1px solid black;
}

</style>
</head>
<body>
<div align="center">

<h1>회원목록조회</h1>
<table>
<tr>
<th>회원번호</th><th>회원성명</th><th>전화번호</th><th>고객등급</th><th>매출</th>
</tr>
<% 
	String grade="";
	int sum=0;
	while(rs.next()){
		switch(rs.getString("grade")){
		case "A":
			grade="VIP";
			break;
		case "B":
			grade="일반";
			break;
		case "C":
			grade="직원";
			break;	
		}
		
		sum=sum+rs.getInt("sum");
%>
<tr>
<td><%=rs.getInt("custno")%></td><td><%=rs.getString("custname")%></td><td><%=rs.getString("phone")%></td><td><%=grade%></td><td><%=rs.getInt("sum")%></td>
</tr>
<% 
	}
%>
<tr>
<td colspan="4">총매출액</td>
<td ><%=sum%></td>
</tr>
</table>

	<br>
	<a href="index.jsp">홈으로</a>
</div>
</body>
</html>