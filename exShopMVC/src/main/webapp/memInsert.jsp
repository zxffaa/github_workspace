<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

ul, li {
	list-style: none;
}

a {
	text-decoration: none;
	color: #fff;
}

.logo {
	color: #fff;
	text-align: center;
	background-color: #0040FF;
	padding: 16px 0;
}

.nav {
	padding: 12px 0;
	overflow: hidden;
	background-color: #BCA9F5;
}

.nav ul, li {
	float: left;
	padding: 0 20px;
	text-align: center;
}

.content {
	background-color: #E6E6E6;
	padding: 16px;
}

.title {
	text-align: center;
	padding: 22px;
}

.content table {
	width: 500px;
	margin: 0 auto;
}

.content table th, td {
	border: 1px solid #bbb;
}

.content table .btn_group {
	text-align: center;
}

.footer {
	padding: 16px 0;
	text-align: center;
	background-color: #0040FF;
}
</style>
<script>
	function send() {
		alert("등록합니다");
		mem.submit();
	}
	function cencel() {
		history.back();
	}
</script>
</head>
<body>
	<div class="header">
		<header>
			<h1 class="logo">쇼핑몰 매출현황 관리 프로그램</h1>
			<div class="nav">
				<nav>
					<ul class="navi">
						<li><a href="/Shop?cmd=mInsert">회원등록</a></li>
						<li><a href="/Shop?cmd=mList">회원전체목록</a></li>
						<li><a href="/Shop?cmd=mSearch">회원정보조회</a></li>
						<li><a href="/Shop?cmd=mSale">회원매출현황</a></li>
						<li><a href="/index">홈으로</a></li>
					</ul>
				</nav>
			</div>
		</header>
	</div>
	<div class="section">
		<section>
			<div class="content">
				<h2 class="title">회원등록</h2>
				<form name="mem" method="post" action="/Shop?cmd=mInsertPro">
					<table>
						<tr>
							<th>회원번호(자동발생)</th>
							<td><input type="text" name="custno"></td>
						</tr>
						<tr>
							<th>회원성명</th>
							<td><input type="text" name="custname"></td>
						</tr>
						<tr>
							<th>회원전화</th>
							<td><input type="text" name="phone1" size="3">-<input
								type="text" name="phone2" size="4">-<input type="text"
								name="phone3" size="4"></td>
						</tr>
						<tr>
							<th>회원성별</th>
							<td><input type="radio" name="gender" value="M">남자 <input
								type="radio" name="gender" value="F">여자</td>
						</tr>
						<tr>
							<th>가입일자</th>
							<td><input type="text" name="joindate"></td>
						</tr>
						<tr>
							<th>고객등급</th>
							<td><select name="grade">
									<option>-</option>
									<option value="A">VIP</option>
									<option value="B">일반</option>
									<option value="C">직원</option>
							</select></td>
						</tr>
						<tr>
							<th>도시코드</th>
							<td><select name="city">
									<option>도시를 선택하세요</option>
									<c:forEach var="c" items="${list}">
										<option value="${c.city}">${c.cityname}</option>
									</c:forEach>
							</select></td>

						</tr>
						<tr>
							<th colspan="2" class="btn_group"><input type="button"
								value="등록하기" onClick="send()"> <input type="button"
								value="다시쓰기" onclick="cencel()"></th>
						</tr>
					</table>
				</form>
			</div>
		</section>
	</div>
	<div class="footer">
		<footer>
			<p>HRDKOREA Copyright@2016 All rights reserve. Human Resources
				Development Serivce of Korea</p>
		</footer>
	</div>
</body>
</html>