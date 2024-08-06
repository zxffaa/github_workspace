<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		width:600px;
		border:5px solid black;
		/* 중복되는 표와 셀의 테두리를 한줄로 */
		border-collapse:collapse;

		margin:0 auto; /* 가운데 정렬 */
	}
	td{
		padding:5px;
		border:1px solid black
	}
	th{
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
		<tr align="center">
			<th>방이름</th><th>대상</th><th>크기</th><th>가격</th>
		</tr>
		<tr>
			<th>유채방</th><td>여성 도미트리</td><td rowspan="3">4인실</td><td rowspan="4">1인20,000원</td>
		</tr>
		<tr>
			<th rowspan="2">동백방</th><td>동성도미토리</td>
		</tr>
		<tr>
		<td>가족 1팀</td>
		</tr>
		<tr>
		<th>천해향방</th><td>-</td><td>2인실</td>
		</tr>
	</table>

</body>
</html>