<%@page import="java.util.function.Function"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function test() {
		if (frm.irum.value == "") {
			alert("이름을 입력하세요");
			frm.irum.focus();
			return;
		}
		if (frm.id.value == "") {
			alert("아이디 입력하세요");
			frm.id.focus();
			return;
		}
		if (frm.pass.value == "") {
			alert("비번입력 입력하세요");
			frm.pass.focus();
			return;
		}

		//전송
		alert("입력값을 전송합니다");
		//frm.submit();
		document.write("이름 :" + frm.irum.value +"<br>")
		document.write("아이디 :" + frm.id.value +"<br>")
		document.write("비번 :" + frm.pass.value +"<br>")

	}
</script>
</head>
<body>
	<form name="frm" method="" action="">
		<table border=1 width="300">
			<tr>
				<td>이름</td>
				<td><input type="text" name="irum" value=""></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="button" value="보내기"
					onClick="test()"> <input type="reset" value="취소하기">
				</td>
			</tr>

		</table>
	</form>

</body>
</html>