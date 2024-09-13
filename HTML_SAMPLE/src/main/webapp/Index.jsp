<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<Style>
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
</Style>
</head>
<body>
	<div class="header">
		<h1 class="logo">인사관리 시스템 Ver 2.0</h1>
		<div class="nav">
			<nav>
				<ul>
					<li><a href="">조회</a></li>
					<li><a href="insert.jsp">사원등록</a></li>
					<li><a href="">정보변경</a></li>
					<li><a href="">부서별 사원현황</a></li>
					<li><a href="">퇴사처리</a></li>
					<li><a href="">홈으로</a></li>
				</ul>
			</nav>
		</div>
	</div>
	<div class="section">
		<section>
			<div class="content">
				<h2 class="title">과정평가형 자격 CBQ</h2>
				<br> 국가직무능력표준(NCS:National Competency Standards)으로 설계된 교육*훈련을
				체계족으로 이수하고 내외부 평가를 거쳐 취득하는 국가기술자격입니다 <br><br> 산업현장 중심의 교육평가로 더커지는
				능력!<br><br> 알고 있는것에 할수 있는 것을 더하는 <br><br>과정평가형 자격은<br><br> 현장
				중심형 인재육성을 지원합니다 <br><br>
			</div>
		</section>
	</div>
	<div class="footer">
		<footer> HRDKOREA Copyright@2016 All rights reserve. Human
			Resources Development Serivce of Korea 
		</footer>
	</div>
</body>
</html>