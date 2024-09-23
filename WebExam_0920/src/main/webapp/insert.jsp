<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
* {
	padding: 0;
	margin: 0;
}

.logo {
	background-color: fuchsia;
	text-align: center;
	padding: 16px 0px;
}

.nav {
	padding: 16px 0px;
	background-color: teal;
	overflow: hidden;
}

nav .ul, li {
	text-align: center;
	padding: 0px 20px;
	float: left;
	text-align: center;
	list-style: none;
}

.contents {
	padding: 16px;
	text-align: left;
}

.title {
	padding: 22px;
	text-align: center;
}

.section {
	background-color: gray;
}

.footer {
	padding: 16px 0px;
	background-color: blue;
	text-align: center;
}

a {
	text-decoration: none;
	color: white;
}

table {
	margin: 0 auto;
	width: 500px
}

table th, td {
	border: 1px solid black;
}

table .btn {
	text-align: center;
}
table .gourp{
	text-align: center;
}
</style>
<script>
function send() {
	if(test.bun.value==""){
		alert("참가번호가 입력되지 않았습니다");
		test.bun.focus();
		return;
	}
	if(test.name.value==""){
		alert("참가자명이 입력되지 않았습니다");
		test.name.focus();
		return;
	}
	if(test.year.value==""){
		alert("생년월일 입력되지 않았습니다");
		test.year.focus();
		return;
	}
	if(test.month.value==""){
		alert("생년월일 입력되지 않았습니다");
		test.month.focus();
		return;
	}
	if(test.day.value==""){
		alert("생년월일 입력되지 않았습니다");
		test.day.focus();
		return;
	}
	if(!test.gen[0].checked&&!test.gen[1].checked){
		alert("성별이 선택되지 않았습니다");
		return;
	}
	if(test.ablity.selectedIndex==0){
		alert("특기가 선택되지 않았습니다");
		return;
	}
	if(test.company.value==""){
		alert("소속사가 입력되지 않았습니다");
		test.company.focus();
		return;
	}
	alert("오디션 지원자정보가 등록되었습니다");
	test.submit();
}
function Cancel() {
	alert("정보를 지우고 처음부터 다시 입력합니다!");
	test.reset();
}
</script>
<body>
	<div class="header">
		<h1 class="logo">(과정평가형정보처리산업기사)오디션 관리프로그램ver 2009-06</h1>
		<div class="nav">
			<nav>
				<ul>
					<li><a href="insert.jsp">오디션 등록</a></li>
					<li><a href="">참가자목록조회</a></li>
					<li><a href="">멘토점수조회</a></li>
					<li><a href="">참가자등수조회</a></li>
					<li><a href="index.jsp">홈으로</a></li>
				</ul>
			</nav>
		</div>
	</div>
	<div class="section">
		<h2 class="title">오디션등록</h2>
		<section>
			<div class="contents">
				<form name="test" action="index.jsp">
					<table class="btn">
						<tr>
							<th>참가번호</th>
							<td><input type="text" size="15" name="bun">*참가번호는(A000)4자리입니다</td>
						</tr>
						<tr>
							<th>참가자명</th>
							<td><input type="text" size="15" name="name"></td>
						</tr>
						<tr>
							<th>생년월일</th>
							<td><input type="text" size="10" name="year">년<input type="text"
								size="10" name="month">월<input type="text" size="10" name="day">일</td>
						</tr>
						<tr>
							<th>성별</th>
							<td><input type="radio" name="gen">남성 <input type="radio" name="gen">여성</td>
						</tr>
						<tr>
							<th>특기</th>
							<th><select name="ablity">
									<option>특기선택</option>
									<option>댄스</option>
									<option>랩</option>
									<option>노래</option>
							</select></th>
						</tr>
						<tr>
							<th>소속사</th>
							<td><input type="text" size="15" name="company"></td>
						</tr>
						<tr>
							<th colspan="2" class="gourp">
							<input type="button" value="등록" onClick="send()">
							<input type="button" value="취소" onClick="Cancel()">
							</th>
						</tr>
					</table>
				</form>
			</div>
		</section>
	</div>
	<div class="footer">
		<footer> HRDKOREA Copyright@2016 All rights reserve. Human
			Resources Development Serivce of Korea </footer>
	</div>
</body>
</html>