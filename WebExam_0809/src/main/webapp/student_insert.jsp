<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
 border:3px solid black;
}
table td{
border:1px solid black;
}

table th{
border:1px solid black;
}
</style>
<script>
	function send() {
		if(student.year.value==""){
			alert("학년이 비어있습니다");
			student.year.focus();
			return;
		}
		if(student.Stuclass.value==""){
			alert("반정보가 비어있습니다");
			student.Stuclass.focus();
			return;
		}
		if(student.bun.value==""){
			alert("번호가 비어있습니다");
			student.bun.focus();
			return;
		}
		if(student.Name.value==""){
			alert("이름이 비어있습니다");
			student.Name.focus();
			return;
		}
		if(student.birth.value==""){
			alert("생년월일이 비어있습니다");
			student.birth.focus();
			return;
		}
		if(student.tel1.value=="" || student.tel2.value=="" || student.tel3.value==""){
			alert("전화번호가 비어있습니다");
			student.tel1.focus();
			return;
		}
		student.submit();
	}
</script>
</head>
<body>
<h1 align="center">학생등록</h1>
<div align="center">
	<form name="student" method="post" action="student_insert_ok.jsp">
		<table>
			<tr>
				<td>학년</td>
				<td><input type="text" name="year"></td>
			</tr>
			<tr>
				<td>반</td>
				<td><input type="text" name="Stuclass"></td>
			</tr>
			<tr>
				<td>번호</td>
				<td><input type="text" name="bun"></td>
			</tr>
			<tr>
			    <td>이름</td>
				<td><input type="text" name="Name"></td>
			</tr>
			<tr>
			    <td>생년월일</td>
				<td><input type="text" name="birth"></td>
			</tr>
			<tr>
			    <td>성별</td>
				<td>
				<input type="radio" name="gender" value="m" checked>남성
				<input type="radio" name="gender" value="f">여성
				</td>
			</tr>
			<tr>
			 <td>전화번호</td>
				<td><input type="text" name="tel1">
				-
				<input type="text" name="tel2">
				-
				<input type="text" name="tel3"></td>
			</tr>
			<tr>
			<th colspan="2">
			<input type="button" name="Input" onclick="send()" value="학생등록">&nbsp;&nbsp;
			<input type="reset" name="" value="다시쓰기">
			</th>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>