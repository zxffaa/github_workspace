<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
/*border-collapse:collapse; 셀테두리없애기*/
/*margin:0 auto 가운데 정렬*/
 table{border:1 solid black; width:300px; border-collapse:collapse;margin:0 auto;}
 table th{padding:5px; border:1px solid black;}
 table td{padding:5px; border:1px solid black;}
</style>
</head>
<body>
<a href="index.jsp">메인홈페이지</a><br>
	<!-- <th>자동 가운데정렬 -->
	<table>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>주소</th>
		</tr>
		<tr>
			<td>1</td>
			<td>김사원</td>
			<td>대전 중구 계룡로 825</td>
		</tr>
	</table>

</body>
</html>