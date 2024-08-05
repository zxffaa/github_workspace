<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=2>
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>전화</td>
			<td>점수</td>
		</tr>
		<%
		for (int i = 1; i <= 10; i++) {
		%>
		<tr>
			<td><%=i %></td>
			<td>홍길동</td>
			<td>010-1234-1111</td>
			<td>80</td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>