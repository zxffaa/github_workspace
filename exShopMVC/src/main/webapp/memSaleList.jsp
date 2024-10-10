<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{margin:0; padding:0;}
	ul,li {list-style:none;}
	a {text-decoration:none; color:#fff;}
	.logo {color:#fff; text-align:center; background-color:#0040FF; padding:16px 0;}
	.nav{padding:12px 0; overflow:hidden;background-color:#BCA9F5;}
	.nav ul,li{float:left; padding:0 20px; text-align:center;}
	.content {background-color:#E6E6E6; padding:16px;}
	.title {text-align:center;padding:22px;}
	.content table{width:500px;margin:0 auto;}
	.content table th, td{border:1px solid #bbb;}
	.content table .btn_group {text-align:center;}
	.footer {padding:16px 0; text-align:center; background-color:#0040FF;}
</style>
</head>
<body>
	<div class="header">
			<h1 class="logo">쇼핑몰 매출 현황관리 Ver 1.0</h1>
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
				<h2 class="title">회원 매출 조회</h2>
					<table>
						<tr>
							<th>회원번호</td>
							<th>회원성명</td>
							<th>전화번호</td>
							<th>고객등급</td>
							<th>매출</td>
						</tr>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
					</table>	
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