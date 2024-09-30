<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
*{margin:0;padding:0;}
a{text-decoration:none;color:white;}
ul,li{list-style:none;}
.logo{padding:16px 0;text-align:center;background-color:blue;color:white;}
.nav{overflow:hidden;padding:12px 0px;background-color:teal;}
.nav ul,li{text-align:center;float:left;padding:0 20px;}
.title{text-align:center;padding:16px;}
.content{background-color:gray; padding:12px;}
.footer{text-align:center; background-color:blue; padding:16px;}
.content table{width:500px; margin:0 auto; border:1px black solid;}
.content table th,td{border:1px black solid;}
.content table .button{text-align:center;}
</style>
<script >
function send() {
	if(shop.name.value==""){
		alert("회원성명을 입력하세요")
		shop.name.focus();
		return;
	}
	if(shop.address.value==""){
		alert("주소를 입력하세요")
		shop.address.focus();
		return;
	}
	if(shop.regdate.value==""){
		alert("가입일자를 입력하세요")
		shop.regdate.focus();
		return;
	}
	if(shop.grade.value==""){
		alert("고객등급을 입력하세요")
		shop.grade.focus();
		return;
	}
	if(shop.city.value==""){
		alert("도시코드 입력하세요")
		shop.city.focus();
		return;
	}
	alert("회원등록이 정상적으로 등록되었습니다");
}
function cancel() {
	alert("모든 정보를 지우고 다시 시작합니다");
	shop.reset();
	shop.name.focus();
}
</script>
<body>
<div class="header">
	<h1 class="logo">쇼핑몰 회원관리 VER1.0</h1>
	<div class="nav">
	<nav>
		<ul>
			<li><a href="">회원등록</a></li>
			<li><a href="">회원목록조회/수정</a></li>
			<li><a href="">회원별매출조회</a></li>
			<li><a href="">홈으로</a></li>
		</ul>
	</nav>
	</div>
</div>
<div class="section">
<section>
	<div class="content">
	<h2 class="title">쇼핑몰 회원등록</h2>
	<form action="insert_pro.jsp" method="post" name="shop">
		<table>
			<tr>
				<th>회원번호(자동발생)</th>
				<td><input type="text" name="num"></td>
			</tr>
			<tr>
				<th>회원성명</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>회원주소</th>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<th>가입일자</th>
				<td><input type="text" name="regdate"></td>
			</tr>
			<tr>
				<th>고객등급[A:VIP,B:일반,C:직원]</th>
				<td><input type="text" name="grade"></td>
			</tr>
			<tr>
				<th>도시코드</th>
				<td><input type="text" name="city"></td>
			</tr>
			<tr class="button">
				<td colspan="2">
				<input type="button" onclick="send()" value="등록">
				<input type="button" onclick="cancel()" value="취소">
				</td>
			</tr>
		</table>
	</form>
	</div>
</section>
</div>
<div class="footer">
<footer>
HRDKOREA Copyright@2016 All rights reserve. Human Resources Development Serivce of Korea
</footer>
</div>
</body>
</html>