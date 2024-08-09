<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("UTF-8");
int year = Integer.parseInt(request.getParameter("year"));
String Stuclass = request.getParameter("Stuclass");
int bun = Integer.parseInt(request.getParameter("bun"));
String Name = request.getParameter("Name");
String birth = request.getParameter("birth");
String birthYear = birth.substring(0, 4);
String birthMon = birth.substring(4, 6);
String birthDay = birth.substring(6, 8);
String gen = null;
if (request.getParameter("gender").equalsIgnoreCase("M")) {
	gen = "남성";
} else {
	gen = "여성";
}
String tel1 = request.getParameter("tel1");
String tel2 = request.getParameter("tel2");
String tel3 = request.getParameter("tel3");
%>
<head>
<style>
table {
	border: 2px solid black;
}

table th {
	border: 1px solid black;
}

table td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<div align="center">
		<table>
			<tr>
				<th colspan="2">등록된 학생정보
				</th>
			</tr>
			<tr>
				<td>학년</td>
				<td><%=year%>학년</td>
			</tr>
			<tr>
				<td>반</td>
				<td><%=Stuclass%>반</td>
			</tr>
			<tr>
				<td>번호</td>
				<td><%=bun%></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%=Name%></td>
			</tr>
			<tr>
				<td>생년월일</td>
				<td><%=birthYear%>년<%=birthMon%>월<%=birthDay%>일</td>
			</tr>
			<tr>
				<td>성별</td>
				<td><%=gen%></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><%=tel1%>-<%=tel2%>-<%=tel3%></td>
			</tr>
		</table>
	</div>
</body>
