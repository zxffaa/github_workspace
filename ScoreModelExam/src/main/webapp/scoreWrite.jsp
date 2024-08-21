<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.score.model.*"%>
<%
ScoreDAO dao = ScoreDAO.getInstance();
%>
<!DOCTYPE html>
<html>
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
<script>
	function send() {
		if (insert.hakbun.value == "") {
			alert("학번을 입력해주세요");
			insert.hakbun.focus();
			return;
		}
		if (insert.kor.value == "") {
			alert("국어를 입력해주세요");
			insert.kor.focus();
			return;
		}
		if (insert.eng.value == "") {
			alert("영어를 입력해주세요");
			insert.eng.focus();
			return;
		}
		if (insert.mat.value == "") {
			alert("수학를 입력해주세요");
			insert.mat.focus();
			return;
		}
		insert.action = "scoreWrite_pro.jsp"
		insert.submit();
	}
	function cancel() {
		alert("등록을 취소합니다");
		history.back();
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>학생 성적 등록</h1>
		<form name="insert" method="post">
			<table>
				<tr>
					<th>학번</th>
					<td><input type="text" name="hakbun">예)1101</td>
				</tr>
				<tr>
					<th>국어점수</th>
					<td><input type="text" name="kor"></td>
				</tr>
				<tr>
					<th>영어점수</th>
					<td><input type="text" name="eng"></td>
				</tr>
				<tr>
					<th>수학점수</th>
					<td><input type="text" name="mat"></td>
				</tr>
				<tr>
					<th colspan="2"><input type="button" value="등록하기"
						onclick="send()"> <input type="button" value="다시쓰기"
						onclick="cancel()"></th>
				</tr>
			</table>
		</form>
		<h1><a href="index.jsp">홈으로</a></h1>
	</div>
</body>
</html>