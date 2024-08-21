<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.score.model.*,java.util.*"%>
<%
ScoreDAO dao = ScoreDAO.getInstance();
List<ScoreDTO> list=dao.scoreClassList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	border: 2px solid black;
	width: 500px;
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
		<h1>학년별 통계</h1>
		<table>
			<tr>
				<th>학년</th>
				<th>국어총점</th>
				<th>영어총점</th>
				<th>수학총점</th>
				<th>국어평균</th>
				<th>영어평균</th>
				<th>수학평균</th>
			<tr>

				<%
				for (ScoreDTO dto : list) {
				%>
			<tr>
				<td><%=dto.getClases()%>
				</td>
				<td><%=dto.getKortot()%></td>
				<td><%=dto.getEngtot()%></td>
				<td><%=dto.getMattot()%></td>
				<td><%=dto.getKoravg()%></td>
				<td><%=dto.getEngavg()%></td>
				<td><%=dto.getMatavg()%></td>
			</tr>
			<% 
	}
%>
		</table>
	</div>
</body>
</html>