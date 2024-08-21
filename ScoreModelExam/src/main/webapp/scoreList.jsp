<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.score.model.*,java.util.*"%>
<%
ScoreDAO dao = ScoreDAO.getInstance();
List<ScoreDTO> list=dao.scoreList();
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
		<h1>학생성적조회</h1>
		<table>
			<tr>
				<th>학번</th>
				<th>이름</th>
				<th>성별</th>
				<th>국어</th>
				<th>영어</th>
				<th>수학</th>
				<th>총점</th>
				<th>평균</th>
			<tr>

				<%
				int korAll=0;
				int engAll=0;
				int matAll=0;
				double koravg=0;
				double engavg=0;
				double matavg=0;
				int cnt=0;
				
				for (ScoreDTO dto : list) {
					String gender = "";
					if (dto.getGender().equalsIgnoreCase("M")) {
						gender = "남";
					} else {
						gender = "여";
					}
					String year=dto.getHakbun().substring(0, 1);
					String clas=dto.getHakbun().substring(1, 2);
					String bun=dto.getHakbun().substring(2, 4);
					korAll=korAll+dto.getKor();
					engAll=engAll+dto.getEng();
					matAll=matAll+dto.getMat();
					cnt++;
				%>
			<tr>
				<td>
				<%=year%>-<%=clas%>-<%=bun%>
				</td>
				<td><%=dto.getName()%></td>
				<td><%=gender%></td>
				<td><%=dto.getKor()%></td>
				<td><%=dto.getEng()%></td>
				<td><%=dto.getMat()%></td>
				<td><%=dto.getSum()%></td>
				<td><%=dto.getAvg()%></td>
			</tr>
			<% 
	}
				koravg=korAll/(double)cnt;
				engavg=engAll/(double)cnt;
				matavg=matAll/(double)cnt;
				koravg=Math.round(koravg*10)/10.0;
				engavg=Math.round(engavg*10)/10.0;
				matavg=Math.round(matavg*10)/10.0;
%>
	<tr>
	<th></th>
	<th></th>
	<th>총점</th>
	<th><%=korAll%></th>
	<th><%=engAll%></th>
	<th><%=matAll%></th>
	<th></th>
	<th></th>
	<tr>
	<tr>
	<th></th>
	<th></th>
	<th>평균</th>
	<th><%=koravg%></th>
	<th><%=engavg%></th>
	<th><%=matavg%></th>
	<th></th>
	<th></th>
	<tr>
		</table>
	</div>
</body>
</html>