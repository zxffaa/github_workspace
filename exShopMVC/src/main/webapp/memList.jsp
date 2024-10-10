<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<header>
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
				<h2 class="title">회원 전체 목록 조회</h2>
				<form>
					<table>
						<tr>
							<th>회원번호</th>
							<th>회원성명</th>
							<th>전화번호</th>
							<th>성별</th>
							<th>가입일자</th>
							<th>고객등급</th>
							<th>거주지역</th>
						</tr>
					<c:forEach var="dto" items="${list}">
						<c:set var="gender" value="남자"/>
						<c:if test="${dto.member.gender=='F'}">
							<c:set var="gender" value="여자"/>
						</c:if>
						<c:set var="grade" value="직원"/>
						<c:choose>
							<c:when test="${(dto.member.grade=='A')}">
								<c:set var="grade" value="VIP"/>
							</c:when>
							<c:when test="${(dto.member.grade=='B')}">
								<c:set var="grade" value="일반"/>
							</c:when>
							<c:otherwise> <!-- 해당사항없을시 -->
								<c:set var="grade" value="직원"/>
							</c:otherwise>
						</c:choose><!-- 문자열을 날짜형식으로 -->
			<!-- 문자열을 날자형식으로 -->
			<fmt:parseDate value="${dto.member.joindate}" var="joindate" pattern="yyyyMMdd" />
			<!-- 날자형식을 format 형식으로 -->
			<fmt:formatDate var="date" value="${joindate}" pattern="yyyy년 MM월 dd일"/>
						<tr>
							<td>${dto.getMember().getCustno()}</td>
							<td>${dto.member.custname}</td>
							<td>${dto.member.phone}</td>
							<td>${gender}</td>
							<td>${date}</td>
							<td>${grade}</td>
							<td>${dto.city.cityname}</td>
						</tr>

					</c:forEach>
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