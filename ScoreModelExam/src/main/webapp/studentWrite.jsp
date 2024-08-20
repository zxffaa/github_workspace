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
		if (insert.name.value == "") {
			alert("이름을 입력해주세요");
			insert.hakbun.focus();
			return;
		}
		if (insert.phone1.value == "" || insert.phone2.value == ""
				|| insert.phone3.value == "") {
			alert("전화번호를 입력해주세요");
			insert.hakbun.focus();
			return;
		}
		if (!insert.gender[0].checked && !insert.gender[1].checked) {
			alert("성별를 체크해주세요");
			insert.hakbun.focus();
			return;
		}
		if (insert.birth.value == "") {
			alert("생년월일을 입력해주세요");
			insert.birth.focus();
			return;
		}
		if (insert.regdate.value == "") {
			alert("등록일자를 입력해주세요");
			insert.regdate.focus();
			return;
		}
		insert.action = "studentWrite_pro.jsp"
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
		<h1>학생 정보 등록</h1>
		<form name="insert" method="post">
			<table>
				<tr>
					<th>학번</th>
					<td><input type="text" name="hakbun">예)1101</td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th>전화</th>
					<td><input type="text" name="phone1">-<input type="text"
						name="phone2">-<input type="text" name="phone3"></td>
				</tr>
				<tr>
					<th>성별</th>
					<td><input type="radio" name="gender" value="M">남성 <input
						type="radio" name="gender" value="F">여성</td>
				</tr>
				<tr>
					<th>생년월일</th>
					<td><input type="text" name="birth">예)19971107</td>
				</tr>
				<tr>
					<th>등록일자</th>
					<td><input type="text" name="regdate">예)20200207</td>
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