<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.score.model.*,java.util.*"%>
<%
ScoreDAO dao = ScoreDAO.getInstance();
List<StudentDTO> list = dao.studentall();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	border: 2px solid black;
}

table th {
	border: 1px solid black;
}

table td {
	border: 1px solid black;
	text-align:center;
}
</style>
</head>
<body>
	<div align="center">
		<h1>학생정보조회</h1>
		<table>
			<tr>
				<th>학생번호</th>
				<th>학생이름</th>
				<th>전화번호</th>
				<th>성별</th>
				<th>생년월일</th>
				<th>가입일자</th>
			<tr>

				<%
				for (StudentDTO dto : list) {
					String gender = "";
					if (dto.getGender().equalsIgnoreCase("M")) {
						gender = "남성";
					} else {
						gender = "여성";
					}
					String phone = dto.getPhone1() + "-" + dto.getPhone2() + "-" + dto.getPhone3();
					String year1=dto.getBirth().substring(0, 4);
					String month1=dto.getBirth().substring(4, 6);
					String day1=dto.getBirth().substring(6, 8);
					String year2=dto.getRegdate().substring(0, 4);
					String month2=dto.getRegdate().substring(5, 7);
					String day2=dto.getRegdate().substring(8, 10);
				%>
			<tr>
				<td>
				<a href="studentModify.jsp?hakbun=<%=dto.getHakbun()%>">
				<%=dto.getHakbun()%>
				</td>
				<td><%=dto.getName()%></td>
				<td><%=phone%></td>
				<td><%=gender%></td>
				<td><%=year1%>-<%=month1%>-<%=day1%></td>
				<td><%=year2%>년<%=month2%>월<%=day2%>일</td>
			</tr>
			<% 
	}
%>

		</table>
	</div>
</body>
</html>