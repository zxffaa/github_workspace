<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		width:300px;
		border:1px solid black;
		/* 중복되는 표와 셀의 테두리를 한줄로 */
		border-collapse:collapse;

		margin:0 auto; /* 가운데 정렬 */
	}
	td{
		padding:5px;
		border:1px solid black
	}

</style>
</head>
<body>

<a href="index.jsp">메인홈페이지</a><br>
<!-- colspan=열을 합친다 -->
<!-- rowspan=행을 합친다 -->
	<table>
		<tr>
			<td colspan="2" align="center">성적</td>
		</tr>
		<tr>
			<td rowspan="2">국어</td>
			<td>90</td>
		</tr>
		<tr>
			<td>80</td>
		</tr>
		<tr>
			<td rowspan="2">영어</td>
			<td>90</td>
		</tr>
		<tr>
			<td>80</td>
		</tr>
	</table>

</body>
</html>