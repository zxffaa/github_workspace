<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	margin: 0;
	padding: 0;
}

ul, li {
	list-style: none;
}

a {
	text-decoration: none;
	color: white;
}

.logo {
	color: white;
	background-color: blue;
	text-align: center;
	padding: 16px 0;
}

.nav {
	background-color: teal;
	padding: 12px 0;
	overflow: hidden;
}

.nav ul, li {
	float: left;
	padding: 0 20px;
	text-align: center;
}

.contents {
	padding: 16px;
	background-color: gray;
}

.title {
	text-align: center;
	padding: 22px;
}

.foot {
	padding: 16px 0px;
	text-align: center;
	background-color: blue;
}

.contents table {
	width: 500px;
	margin: 0 auto;
}

.contents table th, td {
	border: 1px solid black;
}
.contents table .btn_groub{
text-align:center;
}
</style>
<script>
function send() {
	if(sawonresist.sawonnum.value==""){
		alert("사원번호가 비어있습니다");
		sawonresist.sawonnum.focus();
		return;
	}
	if(sawonresist.sawon_name.value==""){
		alert("이름 비어있습니다");
		sawonresist.sawon_name.focus();
		return;
	}
	if(!sawonresist.gen[0].checked&&!sawonresist.gen[1].checked){
		alert("체크가 안되어있습니다");
		return;
	}
	if(sawonresist.sawonjob.selectedIndex==0){
		alert("직군 선택이 안되어있습니다");
		return;
	}
	if(sawonresist.sawon_phone.value==""){
		alert("사원전화번호가 비어있습니다");
		sawonresist.sawon_phone.focus();
		return;
	}
	if(sawonresist.sawon_date.value==""){
		alert("사원입사일자가 비어있습니다");
		sawonresist.sawon_date.focus();
		return;
	}
	if(sawonresist.sawon_deptcode.value==""){
		alert("부서코드가 비어있습니다");
		sawonresist.sawon_deptcode.focus();
		return;
	}
	sawonresist.submit();
}
</script>
</head>
<body>
	<div class="header">
		<h1 class="logo">인사관리 시스템 Ver 2.0</h1>
		<div class="nav">
			<nav>
				<ul>
					<li>조회</li>
					<li><a href="insert.jsp">사원등록</a></li>
					<li>정보변경</li>
					<li>부서별 사원현황</li>
					<li>퇴사처리</li>
					<li>홈으로</li>
				</ul>
			</nav>
		</div>
	</div>
	<div class="section">
		<section>
			<div class="contents">
				<h2 class="title">인사관리 사원등록 화면</h2>
				<form name="sawonresist" method="post" action="insert_pro.jsp" >
				<table>
					<tr>
						<th colspan="2">인사관리 사원등록
						</th>
					</tr>
					<tr>
						<th>사원번호(자동입력)</th>
						<td><input type="text" name="sawonnum" size="10">
						</td>
					</tr>
					<tr>
						<th>성명</th>
						<td><input type="text" name="sawon_name" size="15">
						</td>
					</tr>
					<tr>
						<th>성별</th>
						<td><input type="radio" name="gen">남자 <input
							type="radio" name="gen">여자
						</td>
					</tr>
					<tr>
						<th>직책</th>
						<td>
						<select name="sawonjob" style="width:100px">
							<option>-직책-</option>
							<option>상무</option>
							<option>부장</option>
							<option>과장</option>
							<option>대리</option>
							<option>사원</option>
						</select>
						</td>
					</tr>
					<tr>
						<th>연락처</th>
						<td><input type="text" name="sawon_phone" size="15">
						</td>
					</tr>
					<tr>
						<th>입사일자</th>
						<td><input type="text" name="sawon_date" size="15">
						</td>
					</tr>
					<tr>
						<th>부서코드</th>
						<td><input type="text" name="sawon_deptcode" size="15">
						</td>
					</tr>
					<tr>
						<th colspan="2" class="btn_group">
						<input type="button" onClick="send()" name="submit" value="등록">
						<input type="reset" name="cancel" value="취소">
						</th>
					</tr>
				</table>
				</form>
			</div>
		</section>
	</div>
	<div class="foot">
		<footer> HRDKOREA Copyright@2016 All rights reserve. Human
			Resources Development Serivce of Korea </footer>
	</div>
</body>
</html>