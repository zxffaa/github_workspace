<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	border: 2px solid black;
	width: 300px
}

table td {
	border: 1px solid black;

}

table th {
	border: 1px solid black;
}
table td.buts{
	text-align:center;
}
</style>
<script>
function send() {
	if(frm.sawonbun.value==""){
		alert("사원번호가 비어있습니다");
		frm.sawonbun.focus();
		return;
	}
	if(frm.sawonname.value==""){
		alert("사원이름이 비어있습니다");
		frm.sawonname.focus();
		return;
	}
	if(frm.sawonjob.value==""){
		alert("직군이 비어있습니다");
		frm.sawonjob.focus();
		return;
	}
	if(frm.sawonmanager.value==""){
		alert("관리번호가 비어있습니다");
		frm.sawonmanager.focus();
		return;
	}
	if(frm.sawonhiredate.value==""){
		alert("임사일자 비어있습니다");
		frm.sawonhiredate.focus();
		return;
	}
	if(frm.sawonsalary.value==""){
		alert("급여가 비어있습니다");
		frm.sawonsalary.focus();
		return;
	}
	if(frm.sawoncommission.value==""){
		alert("커미션이 비어있습니다");
		frm.sawoncommission.focus();
		return;
	}
	if(frm.sawondeptnum.value==""){
		alert("부서번호 비어있습니다");
		frm.sawondeptnum.focus();
		return;
	}
	frm.submit();
}
function cancel() {
	alert("부서번호 비어있습니다");
	history.back();
}
</script>
</head>
<body>
	<div align="center">
		<form name="frm" method="post" action="empInsert_pro.jsp">
			<table>
				<tr>
					<th>사원번호</th>
					<td><input type="text" name="sawonbun"></td>
				</tr>
				<tr>
					<th>사원이름</th>
					<td><input type="text" name="sawonname"></td>
				</tr>
				<tr>
					<th>직군</th>
					<td><input type="text" name="sawonjob"></td>
				</tr>
				<tr>
					<th>관리번호</th>
					<td><input type="text" name="sawonmanager"></td>
				</tr>
				<tr>
					<th>입사일자</th>
					<td><input type="text" name="sawonhiredate"></td>
				</tr>
				<tr>
					<th>급여</th>
					<td><input type="text" name="sawonsalary"></td>
				</tr>
				<tr>
					<th>커미션</th>
					<td><input type="text" name="sawoncommission"></td>
				</tr>
				<tr>
					<th>부서번호</th>
					<td><input type="text" name="sawondeptnum"></td>
				</tr>
				<tr>
					<td colspan="2" class="buts">
					<input type="button" value="사원등록" onclick="send()">
					<input type="button" value="취소" onclick="cancel()">
					</td>
				</tr>
			</table>
		</form>
		<a href="index.jsp">홈으로</a>
	</div>
</body>
</html>