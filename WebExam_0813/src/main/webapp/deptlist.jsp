<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.*"%>
<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
	} catch (Exception e) {
		e.printStackTrace();
	}
	String sql = "select * from dept";
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	border: 2px solid black;
	width: 600px
}

table td {
	border: 1px solid black;
	text-align: center;
}

table th {
	border: 1px solid black;
}
</style>
</head>
<body>
	<div align="center">
	
	<table>
		<tr>
			<th colspan="3">부서리스트</th>
		</tr>
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>지역</th>
		</tr>
		<%
		while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt("dno")%></td>
			<td><%=rs.getString("dname")%></td>
			<td><%=rs.getString("loc")%></td>
		</tr>
		<%
		}
		%>
	</table>
	<a href="index.jsp">홈으로</a>
	</div>
</body>
</html>