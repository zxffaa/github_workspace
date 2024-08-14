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
String sql="select * from tbl_member";

pstmt=conn.prepareStatement(sql);
rs=pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	border: 2px solid black;
	width: 600px;
}

table th {
	border: 1px solid black;
}
table th.main {
	font-size:30px;
}
table td {
	text-align:center;
	border: 1px solid black;
}

</style>
</head>
<body>
<div align="center">


<table>
<tr>
<th colspan="7" class="main">회원목록</th>
</tr>
<tr>
<th>회원번호</th><th>회원성명</th><th>전화번호</th><th>성별</th><th>가입일자</th><th>고객등급</th><th>거주지역</th>
</tr>
<% 
	String city="",gender="",grade="";
	while(rs.next()){
		int doci=Integer.parseInt(rs.getString("city"));
		switch(doci){
		case 1:
			city="서울";
			break;
		case 2:
			city="경기";
			break;
		case 3:
			city="인천";
			break;
		case 4:
			city="강원";
			break;
		case 5:
			city="충북";
			break;
		case 6:
			city="충남";
			break;
		case 7:
			city="전북";
			break;
		case 8:
			city="전남";
			break;
		case 9:
			city="경북";
			break;
		case 10:
			city="경남";
			break;
		default:
			city="제주";
			break;
		}
		if(rs.getString("gender").equalsIgnoreCase("M")){
			gender="남성";
		}else{
			gender="여성";
		}
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
%>
<tr>
	<td>
		<a href="memberModify.jsp?custno=<%= rs.getInt("custno") %>">
		<%= rs.getInt("custno") %>
		</a>
	</td>

	<td>
	<%=rs.getString("custname")%>
	</td>
	<td><%=rs.getString("phone")%>
	</td>
	<td>
	<%=gender%>
	</td>
	<td><%=rs.getString("joindate")%>
	</td>
	<td><%=grade%>
	</td>
	<td>
	<%=city%>
	</td>
</tr>
<% 
	}
%>
</table>
<br>
	<a href="index.jsp">홈으로</a>
</div>

</body>
</html>